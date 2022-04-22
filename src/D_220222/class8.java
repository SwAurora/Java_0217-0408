package D_220222;

import java.util.Scanner;

public class class8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("문자를 입력하세요 >> ");
		String s = input.next();
		
		while(!s.equals("a"))//기본 자료형은 == 나머지는 equals 사용
		{
			System.out.println(s);
			System.out.print("문자를 입력하세요 >> ");
			s = input.next();
		}
	}
}