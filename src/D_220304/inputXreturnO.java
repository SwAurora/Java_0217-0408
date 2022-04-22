package D_220304;

class Student3
{
	String welcome()
	{
		return "test";
	}
	
	int welcome2()
	{
		return 123;
	}
}

public class inputXreturnO 
{
	public static void main(String[] args) 
	{
		Student3 s1 = new Student3();

		System.out.println(s1.welcome());
		System.out.println(s1.welcome2());
	}
}
