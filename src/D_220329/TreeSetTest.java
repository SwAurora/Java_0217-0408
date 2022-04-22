package D_220329;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest 
{

	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet();
		
		ts.add("apple");
		ts.add("melon");
		ts.add("banana");
		ts.add("grape");
		
		ts.add("apple");
		ts.add("banana");
		
		System.out.println("오름차순 정렬 결과: ");
		Iterator <String> iter = ts.iterator();
		
		while(iter.hasNext())//다음으로 가져올 요소가 존재하는가?
		{
			System.out.println(iter.next());//가져와서 출력
		}
		
		System.out.println("내림차순 정렬 결과: ");
		Iterator <String> iter2 = ts.descendingIterator();
		
		while(iter2.hasNext())//다음으로 가져올 요소가 존재하는가?
		{
			System.out.println(iter2.next());//가져와서 출력
		}
	}

}