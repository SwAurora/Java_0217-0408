package D_220222;

import java.util.Scanner;

public class class2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = a+b;
		
		if(c>10)
		{
			System.out.println(c + "는 10보다 큽니다");
		}
		else if(c>5)
		{
			System.out.println(c + "는 5보다 크고, 10이하입니다");
		}
		else if(c>3)
		{
			System.out.println(c + "는 3보다 크고, 5이하입니다");
		}
		else
		{
			System.out.println(c + "는 3이하 입니다");
		}
	}
}
