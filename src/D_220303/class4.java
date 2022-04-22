package D_220303;

public class class4
{
	public static void main(String[] args) 
	{
		StringBuilder s = new StringBuilder("www.naver.com");
		
		for(int i = 0 ; i < 1000000 ; i++)
		{
			s = s.append("test");
			System.out.println(s);
		}
	}
}
