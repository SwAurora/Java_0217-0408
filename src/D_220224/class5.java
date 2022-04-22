package D_220224;

import java.util.Scanner;

public class class5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		for(int i=1;i<10;i++)
		{
			for(int dan=2;dan<10;dan++)
			{
				System.out.print(dan + "x" + i + "=" + dan*i + "\t");
			}
			System.out.println();
		}
	}
}