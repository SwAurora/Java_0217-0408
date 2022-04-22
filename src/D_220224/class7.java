package D_220224;

import java.util.Scanner;

public class class7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int garo = input.nextInt();
		int sero = input.nextInt();
		
		for(int y=0;y<sero;y++)
		{
			for(int i=0;i<garo;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}