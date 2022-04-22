package D_220304;

class Student5
{
	void welcome(int number)
	{
		if(number < 0)
		{
			System.out.println("test - 2");
			return;
		}
		System.out.println("test - 1");
	}
}
public class VoidReturn                   
{
	public static void main(String[] args) 
	{
		Student5 s1 = new Student5();
		s1.welcome(-1);
	}
}