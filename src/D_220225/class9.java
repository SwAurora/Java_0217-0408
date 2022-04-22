package D_220225;

import java.util.ArrayList;

public class class9
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list_arr = new ArrayList<>();
		ArrayList<Integer> list_arr2 = new ArrayList<>();
		list_arr.add(4);
		list_arr.add(3);
		list_arr.add(2);
		list_arr.add(1);

		list_arr2.add(2);
		list_arr2.add(20);
		list_arr2.add(10);
		list_arr2.add(3);
		list_arr2.add(5);
		
		list_arr.sort(null);
		list_arr2.sort(null);
		list_arr.remove(0);
		list_arr2.remove(0);
		
		System.out.print("list_arr = ");
		for (int i = 0; i < list_arr.size(); i++)
		{
			System.out.print(list_arr.get(i));
			if(i < list_arr.size()-1)
			{
				System.out.print(",");
			}
		}
		System.out.println();
		
		System.out.print("list_arr2 = ");
		for (int i = 0; i < list_arr2.size(); i++)
		{
			System.out.print(list_arr2.get(i));
			if(i < list_arr2.size()-1)
			{
				System.out.print(",");
			}
		}
	}
}