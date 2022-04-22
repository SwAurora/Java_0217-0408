package D_220217;

import java.util.Scanner;

public class class7 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("가로 길이를 입력하세요 >>> ");
		int a = input.nextInt();
		System.out.print("세로 길이를 입력하세요 >>> ");
		int b = input.nextInt();
		int c = (a+b)*2;
		int d = a*b;
		System.out.println("직사각형의 둘레: " + c);
		System.out.println("직사각형의 넓이: " + d);
	}

}
