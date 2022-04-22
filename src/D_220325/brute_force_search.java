package D_220325;

import java.util.ArrayList;

public class brute_force_search 
{
	static int[] item = {300,200,150};
	static ArrayList<Integer> cost_list = new ArrayList<>();
	
	static void brute_force(int curt_cost, int start)
	{
		cost_list.add(curt_cost);
		
		for (int i = start; i < item.length; i++) 
		{
			brute_force(item[i] + curt_cost, i+1);
		}
	}
	
	public static void main(String[] args) 
	{
		brute_force(0,0);
		for (int cost : cost_list) 
		{
			System.out.println(cost);
		}
	}

}
