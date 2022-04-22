package D_220222;

import java.util.Scanner;

public class class9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String code = "";
		
		while(!code.equals("AAAAA"))
		{
			code += "A";
			System.out.println(code);
		}
	}
}