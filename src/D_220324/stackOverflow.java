package D_220324;

public class stackOverflow
{
	static void test()
	{
		System.out.println("test");
		test();
	}
	
	
	public static void main(String[] args) 
	{
		test();
	}

}