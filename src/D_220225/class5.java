package D_220225;

import java.util.Scanner;

public class class5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int[][] arr = new int[][]
		{
			{1,2,3},
			{4,5,6,10,100,50},
			{7,8,9}
		};
		
		for (int i = 0; i < arr.length; i++)//arr.length 행의 갯수
		{
			for (int j = 0; j < arr[i].length; j++) //arr[i].length 열의 갯수
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}