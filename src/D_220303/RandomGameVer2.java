package D_220303;

import java.util.Random;
import java.util.Scanner;

public class RandomGameVer2 
{

	public static void main(String[] args) 
	{
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		int randomCount = 3;//랜덤숫자 갯수
		int chanceCount = 3;//맞출 수 있는 기회
		
		int[] randomList = new int [randomCount];
		
		for (int i = 0; i < randomList.length; i++) 
		{
			randomList[i] = random.nextInt(5) + 1;
		}
		
		for (int i = 0; i < randomList.length; i++) 
		{
			System.out.println("현재 맞출 숫자는(랜덤list안의 요소): " + randomList[i]);
			
			boolean endCheck = false;//게임을 끝낼것인지 판단하는 변수
			
			for (int  j = chanceCount; j > 0; j--) 
			{
				System.out.print("맞출 숫자를 입력하세요: ");
				int number = input.nextInt();
				if(number == randomList[i])
				{
					break;
				}
				
				else if(j==1)//게임종료 체크 변수를 true로 바꿈
				{
					endCheck = true;
				}
				else
				{
					System.out.println("틀렸습니다. 다시 입력하세요 ..남은 기회 = " + (j - 1) + "번 ");
				}
			}
			if(endCheck)
			{
				System.out.println("실패");
				break;
			}
			else if(i == randomList.length-1)
			{
				System.out.println("성공");
			}
			else
			{
				System.out.println("맞았습니다. 다음 숫자를 입력하세요");
			}
		}
		
		
	}

}
