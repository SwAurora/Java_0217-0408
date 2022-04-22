package D_220304;

class Student2
{
	void welcome(String name, int age)
	{
		System.out.println(name + "님 환영합니다");
		System.out.println("나이는 " + age + "살이네요");
		System.out.println("메소드 끝");
	}
}

public class inputOreturnX 
{
	public static void main(String[] args) 
	{
		Student2 s1 = new Student2();
		
		s1.welcome("ksw", 10);
		s1.welcome("lee", 50);
	}
}
