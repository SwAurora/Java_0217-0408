package D_220224;

import java.util.Scanner;

public class class9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력 >>> ");
		int num = input.nextInt();
		int result = 0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				result += i;
			}
		}
		
		System.out.println(num + "의 약수의 합은 " + result +"입니다.");
	}
}