package D_220310;

class Animal2
{
	String name;
	public Animal2() 
	{
		System.out.println("매개 변수 없는 기본 부모 생성자");
	}
	
	public Animal2(String name) 
	{
		this.name = name;
		System.out.println("부모 클래스 생성자");
	}
	
	void run()
	{
		System.out.println("달리기");
	}
}

class Lion2 extends Animal2
{
	public Lion2() 
	{
		super("홍길동"); //->부모클래스의 생성자를 의미 (안적으면 컴파일러가 자동으로 넣음, 맨 윗줄에 적어야함)
		super.name = "테스트";
		System.out.println("자식 클래스 생성자");
	}
	
	void jump()
	{
		super.run();
		System.out.println("점프");
	}
}

public class InheritanceSuper 
{
	public static void main(String[] args)
	{
		Lion2 l1 = new Lion2();
		l1.jump();
		
		System.out.println(l1.name);
	}
}
