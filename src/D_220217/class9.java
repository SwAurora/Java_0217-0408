package D_220217;

import java.util.Scanner;

public class class9 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int a = input.nextInt();
		boolean b = a%2 ==0;
		System.out.println(a + "은(는) " + b + "입니다.");
	}

}
