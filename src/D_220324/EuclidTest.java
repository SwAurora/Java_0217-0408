package D_220324;

public class EuclidTest
{
	static int Euclid(int num1, int num2)
	{
		if(num2 == 0)//num2가 나머지
		{
			return num1;
		}
		
		return Euclid(num2, num1 % num2);
	}
	
	public static void main(String[] args) 
	{
		int result = Euclid(1112, 695);
		System.out.println(result);
	}
}