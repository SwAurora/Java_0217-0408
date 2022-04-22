package D_220224;

public class class4
{
	public static void main(String[] args)
	{
		int i = 1;

		while(i<=100)
		{
			if(i%3 == 0)
			{
				System.out.print(i + "\t");
				if(i%5 == 0)
				{
					System.out.println();
				}
			}
			i++;
		}
	}
}