package D_220224;

import java.util.Scanner;

public class class6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 10; i++) 
		{
			if(i % 2 == 0)
			{
				sum += i;
				System.out.println(i + " 짝수");
				continue;
			}
			System.out.println(i + " 홀수");
		}
	}
}