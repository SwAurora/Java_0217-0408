package D_220225;

import java.util.ArrayList;

public class class7
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		// ArrayList arr = new ArrayList();하면 모든 형태 다 넣을수있지만 뭐가 들어있는지 알기 어려움
		arr.add(1000);
		arr.add(5);
		arr.add(7);
		arr.add(80);

		arr.sort(null);// 정렬

		for (int i = 0; i < arr.size(); i++)// 배열 크기 반환
		{
			System.out.println(arr.get(i));// index값 반환
		}

	}
}