package D_220325;

public class DP_pibo
{

	public static void main(String[] args) 
	{
		int n = 30;
		int[] pibo = new int[n];
		
		pibo[0] = 1;
		pibo[1] = 1;
		
		for (int i = 2; i < pibo.length; i++) 
		{
			pibo[i] = pibo[i-1] + pibo[i-2];
		}
		System.out.println("피보나치 수열의 " + n + "번째 항은 " + pibo[n-1]);
	}

}
