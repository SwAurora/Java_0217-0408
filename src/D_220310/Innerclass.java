package D_220310;

class Out
{
	private int number = 3;
	
	class In
	{
		void print_test()
		{
			System.out.println("in의 메소드");
			System.out.println(number);
		}
	}
	
	Out()
	{
		In i = new In();
		i.print_test();
		System.out.println("out 클래스 생성자");
	}
}

public class Innerclass 
{

	public static void main(String[] args) 
	{
		new Out();
	}

}
