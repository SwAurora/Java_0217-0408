package D_220225;

import java.util.Scanner;

public class class4
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
		int[] test = arr[0];
		System.out.println(test[2]);
	}
}