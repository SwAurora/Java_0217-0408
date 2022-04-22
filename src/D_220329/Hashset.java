package D_220329;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset 
{

	public static void main(String[] args) 
	{
		HashSet<String> hashSet = new /*Linked*/HashSet<>();//Linked 넣으면 넣은 순서대로
		
		hashSet.add("apple");
		hashSet.add("melon");
		hashSet.add("banana");
		hashSet.add("grape");
		
		hashSet.add("apple");
		hashSet.add("banana");
		
		Iterator iter = hashSet.iterator();
		
		while(iter.hasNext())//다음으로 가져올 요소가 존재하는가?
		{
			System.out.println(iter.next());//가져와서 출력
		}
	}

}