package D_220303;

public class foreach
{

	public static void main(String[] args) 
	{
		int[][] arr = {{1,10},{50,30}};

		for(int[] number : arr)
		{
			//number = {1,10}
			//number = {50,30}
			for (int is : number) 
			{
				//is = 1
				//is = 10
				//is = 50
				//is = 30
				System.out.println(is);
			}
			
		}
	}

}
