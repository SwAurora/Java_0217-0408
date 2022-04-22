package D_220324;

public class factorialTest
{
	static int factorial(int number)
	{
		if(number == 1)
		{
			return 1;
		}
		
		return number * factorial(number-1);
	}
	
	
	public static void main(String[] args) 
	{
		int result = factorial(3);
		System.out.println(result);
	}

}