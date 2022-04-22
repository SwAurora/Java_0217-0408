package D_220225;

import java.util.ArrayList;

public class NumReverse
{
	public static void main(String[] args)
	{
		int num = 12345;
		ArrayList<Integer> result = new ArrayList<>();
		while(true)
		{
			result.add(num%10);
			num = num/10;
			if(num == 0)
			{
				break;
			}
		}
		System.out.print("result = {");
		for (int i = 0; i < result.size(); i++) 
		{
			System.out.print(result.get(i));
			if(i<result.size()-1)
			{
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
}