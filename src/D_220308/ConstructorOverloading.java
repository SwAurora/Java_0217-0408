package D_220308;

class Calculator2
{
	int num1,num2,num3,num4;
	
	public Calculator2() 
	{
		this(1,2,3,4);//this()을 통한 다른 생성자 호출 (맨 첫줄에 적어야함)
		System.out.println("기본 생성자");
	}
	public Calculator2(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public Calculator2(int num1, int num2, int num3, int num4)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}
}

public class ConstructorOverloading
{
	public static void main(String[] args)
	{
		Calculator2 calc = new Calculator2(5,4,3,2);
		System.out.println("calc의 변수 값들: ");
		System.out.println(calc.num1);
		System.out.println(calc.num2);
		System.out.println(calc.num3);
		System.out.println(calc.num4);
	}
}