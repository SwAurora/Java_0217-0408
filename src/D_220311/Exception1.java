package D_220311;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		try 
		{
			int a = input.nextInt();
			int b = input.nextInt();
			
			System.out.println("나누기를 시도합니다");
			System.out.println(a / b);
			System.out.println("나눗셈 완료");
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("정수를 입력해야합니다");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다");
			System.out.println(e.getMessage());
		}
	
		finally
		{
			System.out.println("프로그램 종료");
		}
		
	}

}
