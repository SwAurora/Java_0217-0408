package D_220310;

class Out2
{
	void print_test()
	{
		System.out.println("test1");
	}
	
	void print_test2()
	{
		System.out.println("test2");
	}
}

public class anonymousclass 
{

	public static void main(String[] args) 
	{
		Out2 o = new Out2();
		o.print_test();
		o.print_test2();

		Out2 o2 = new Out2()
		{
			void print_test2()
			{
				System.out.println("test2-1");
			}
		};
		o2.print_test2();
	}

}
