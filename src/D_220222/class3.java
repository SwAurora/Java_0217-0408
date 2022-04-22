package D_220222;

import java.util.Scanner;

public class class3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String id = "java";
		String pw = "abc123";
		
		System.out.print("ID를 입력하세요: ");
		String inputID = input.next();
		if(inputID.equals(id))
		{
			System.out.println("ID가 일치합니다");
			
			System.out.print("PW를 입력하세요: ");
			String inputPW = input.next();
			if(inputPW.equals(pw))
			{
				System.out.println("PW가 일치합니다");
				System.out.println("LOGIN");
			}
			else
			{
				System.out.println("PW가 불일치합니다");
			}
		}
		else 
		{
				System.out.println("ID가 불일치합니다");
		}
		
	}
}
