package D_220224;

public class class3
{
	public static void main(String[] args)
	{
		int j = 1;

		while(j < 10)
		{
			int i = 2;
			while(i < 10)
			{
				System.out.print(i + "x" + j + "=" + (i*j) + "\t");
				i++;
			}
			System.out.println();
			j++;
		}
	}
}