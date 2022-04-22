package D_220225;

import java.util.Random;
import java.util.Scanner;

public class RandomGame
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("랜덤 숫자를 생성합니다...");
		Random random = new Random();
		int[] randomchar = new int[] { random.nextInt(5) + 1, random.nextInt(5) + 1, random.nextInt(5) + 1 };
		for (int i = 0; i < 3; i++)//3라
		{
			int count = 2;
			for (int j = 0; j < 3; j++)//기회3번
			{
				System.out.print("맞출 숫자를 입력하세요: ");
				int num = input.nextInt();
				if (num == randomchar[i])//i번째 라운드의 랜덤숫자와 입력숫자 비교
				{
					if (i == 2)//3라 성공할때 탈출
					{
						System.out.println("성공!");
						break;
					}
					System.out.println("맞았습니다. 다음 숫자를 입력하세요.");
					count++;//카운트 0일때 맞추면 바깥쪽 for문 탈출되어서 count+1
					break;
				} 
				else if (count == 0)//안쪽for문 탈출
				{
					System.out.println("실패!\n" + "랜덤 숫자는.. " + randomchar[0] + "," + randomchar[1] + "," + randomchar[2] + "입니다.");
				} 
				else//틀렸을때 기회-1
				{
					System.out.println("틀렸습니다. 다시 입력하세요 ..남은 기회 = " + count + "번 ");
					count--;
				}

			}
			if (count == 0)//바깥쪽 for문 탈출
			{
				break;
			}
		}

	}
}