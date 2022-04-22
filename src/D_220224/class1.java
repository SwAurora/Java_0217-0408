package D_220224;

import java.util.Scanner;

public class class1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i = 1;
		while(i < 10)
		{
			int j = 1;// j는 while안에서만 작동하는 지역변수가 됨
			
			while(j < 10)
			{
				System.out.println("i=" + i + " j=" + j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}