package D_220224;

import java.util.Scanner;

public class class2
{
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			int hour = 0;
			
			while(hour < 24)
			{
				int min = 0;
				while(min < 60)
				{
					int sec = 0;
					while(sec < 60)
					{
						System.out.println(hour + "시 " + min + "분 " + sec + "초");
						sec++;//1초 증가
						Thread.sleep(1000);
					}
					min++;//1분 증가
				}
				hour++;//1시간 증가
			}
		}
	}
}