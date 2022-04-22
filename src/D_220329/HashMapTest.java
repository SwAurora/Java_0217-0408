package D_220329;

import java.util.HashMap;

public class HashMapTest 
{

	public static void main(String[] args) 
	{
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("컴퓨터", 10000);
		hashMap.put("키보드", 5000);
		hashMap.put("마우스", 3000);
		
		if(hashMap.containsKey("마우스"))
		{
			System.out.println(hashMap.get("마우스"));
		}
		
		System.out.println(hashMap.get("키보드"));
		hashMap.put("키보드", 1000);
		System.out.println(hashMap.get("키보드"));
	}

}