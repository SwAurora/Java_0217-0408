package D_220222;

import java.util.Scanner;

public class class5 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("정수1 입력: ");
		int num1 = input.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = input.nextInt();
		System.out.print("정수3 입력: ");
		int num3 = input.nextInt();
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("가장 큰 수는 "+ num1 + "입니다.");
			}
			else
			{
				System.out.println("가장 큰 수는 "+ num3 + "입니다.");
			}
			
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("가장 큰 수는 "+ num2 + "입니다.");
			}
			else
			{
				System.out.println("가장 큰 수는 "+ num3 + "입니다.");
			}
		}
	}
}
