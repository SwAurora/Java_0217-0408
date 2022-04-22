package D_220303;

import java.util.ArrayList;

public class class6
{
	public static void main(String[]args)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(4);
		arr.add(23);
		arr.add(1);

		arr.remove(Integer.valueOf(23));
//		int index = arr.indexOf(23);
//		System.out.println(index);
//		arr.remove(index);
		
		for (Integer integer : arr)
		{
			System.out.println(integer);
		}
	}
}