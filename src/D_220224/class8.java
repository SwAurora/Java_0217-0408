package D_220224;

import java.util.Scanner;

public class class8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력 >>> ");
		int num = input.nextInt();
		int result=1;
		
		for(int i=1;i<=num;i++)
		{
			result *= i;
		}
		
		System.out.println(num + "! = " + result + "입니다.");
	}
}