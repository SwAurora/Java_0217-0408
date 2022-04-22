package D_220325;

import java.util.Arrays;

public class greedy 
{

	public static void main(String[] args) 
	{
		int money = 770; //거스름돈
		
		int[] coins = {100, 500, 10, 50};
		int coinCount = 0;//거슬러준 동전의 개수
		
		Arrays.sort(coins);
		
		for (int i = coins.length - 1 ; i >= 0 ; i--) 
		{
			while(money - coins[i] >= 0)//만약 현재 동전으로 잔돈을 거슬러 줄 수 있다면
			{
				money -= coins[i]; //돈을 거슬러 준다
				
				coinCount++;
				System.out.println("거슬러 준 동전: " + coins[i]);
				System.out.println("남은 잔돈: " + money);
			}
		}
		System.out.println("사용한 동전의 개수는: " + coinCount);
	}

}
