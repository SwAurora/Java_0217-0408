package D_220217;

import java.util.Scanner;
//import java.util.Scanner; 도 가능
public class class6 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("문장을 입력하세요");
		String s = input.nextLine();
		
		System.out.println("단어를 입력하세요");
		String s2 = input.next();
		
		System.out.println("숫자를 입력하세요");
		int i = input.nextInt();
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(i);
	}

}
