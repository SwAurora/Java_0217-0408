package D_220225;

public class class8
{
	public static void main(String[] args)
	{
		int[][] list1 = new int[][]{{1,2},{2,3}};
		int[][] list2 = new int[][]{{3,4},{5,6}};
		int[][] result = new int[2][2];

		for (int i = 0; i < list1.length; i++) 
		{
			for (int j = 0; j < list2.length; j++) 
			{
				result[i][j]=(list1[i][j] + list2[i][j]);
			}
		}
			System.out.println("result = {{" + result[0][0] + "," + result[0][1] + "}, {" + result[1][0] + "," + result[1][1] + "}}");
	}
}