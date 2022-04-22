package D_220322;

import java.util.LinkedList;
import java.util.Scanner;

public class AlgorithmTest2
{
	public static void main(String[] args) 
	{
		LinkedList<Character> link = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("괄호만 사용한 문자 입력 >> ");
		String word = input.next();
		
		char[] words = word.toCharArray();
		
		for (int i = 0; i < words.length; i++)
		{
			if(words[i] == '(')
			{
				link.push(words[i]);
			}
			else
			{
				if(link.isEmpty())
				{
					System.out.println("false");
					return;
				}
				else
				{
					if(link.peek() == '(')
					{
						link.pop();
					}
					else
					{
						System.out.println("false");
						return;
					}
				}
			}
		}
		if(link.isEmpty())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}