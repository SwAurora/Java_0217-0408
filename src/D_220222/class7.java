package D_220222;

import java.util.Scanner;

public class class7 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("국어 성적 입력: ");
		int korean = input.nextInt();
		
		System.out.print("수학 성적 입력: ");
		int math = input.nextInt();
		
		System.out.print("영어 성적 입력: ");
		int english = input.nextInt();
		
		double average = (double)(korean+math+english)/3;// or double average = (korean+math+english)/3.0;
		System.out.printf("평균 점수: %.1f\n", average);
		
		if(average>=80)
		{
			System.out.println("등급: A");
		}
		else if(average>=50)
		{
			System.out.println("등급: B");
		}
		else if(average>=30)
		{
			System.out.println("등급: C");
		}
		else
		{
			System.out.println("등급: D");
		}
	}
}
