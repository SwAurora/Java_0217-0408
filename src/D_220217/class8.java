package D_220217;

import java.util.Scanner;

public class class8 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("num1 입력: ");
		int num1 = input.nextInt();
		System.out.print("num2 입력: ");
		int num2 = input.nextInt();
		int result = (num1<<2)+num2;
		System.out.println("결과: " + result);
	}

}
