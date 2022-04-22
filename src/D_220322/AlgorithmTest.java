package D_220322;

import java.util.LinkedList;
import java.util.Scanner;

public class AlgorithmTest
{
	public static void main(String[] args) 
	{
		LinkedList<Character> link = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("팬림드롬 판단할 문자 입력 >> ");
		String word = input.nextLine();
		
		char[] words = word.toCharArray();//입력받은 문자열을 하나의 문자씩 나눠서 배열로 생성
		
		
		for (int i = 0; i < words.length; i++) 
		{
			if(words[i] != ' ')
			{
				link.offer(words[i]);
				System.out.println(link);
			}
		}
		
		while(link.size() > 1)//비교할 문자 2개가 존재한다면
		{
			if(!link.pollFirst().equals(link.pollLast()))//linked list의 가장 첫번째 요소와 마지막 요소를 빼서 비교
			{
				System.out.println("팬린드롬이 아님");
				return;
			}
		}
		System.out.println("팬린드롬이다");
	}
}