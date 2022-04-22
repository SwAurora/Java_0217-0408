package D_220222;

import java.util.Scanner;

public class class6 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요 >>> ");
		int num = input.nextInt();
		boolean result = (num % 3)==0;
		if(result)
		{
			System.out.println(num + "은(는) 3의 배수입니다.");
		}
		else
		{
			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
		}
	}
}
