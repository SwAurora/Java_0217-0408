package D_220304;

class Person2
{
	static String country = "한국";
	String name;
	
	void test()//인스턴스 메소드 안에는 클래스 메소드 들어갈 수 있음
	{
		print_country();
	}
	
	static void print_country()
	{
		System.out.println(country);
	}
}

public class StaticVar2
{
	public static void main(String[] args)
	{
//		Person2 p1 = new Person2();
//		Person2 p2 = new Person2();
		
		Person2.print_country();
	}
}