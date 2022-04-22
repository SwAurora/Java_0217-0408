package D_220325;

public class DP_pibo2
{
	static int pibonacci(int i1, int i2, int count, int n)
	{
		if(count == n)
		{
			return i2;
		}
		return pibonacci(i2, i1+i2, count + 1, n);
	}
	
	public static void main(String[] args) 
	{
		int n = 30;
		
		int result = pibonacci(1, 1, 2, n);
		System.out.println("피보나치 수열의 " + n + "번째 항은 " + result);
	}

}
