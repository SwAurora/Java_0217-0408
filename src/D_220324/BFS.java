package D_220324;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS 
{
	static void BFS(int[][] graph, int start_node)//시작할 node를 받아와서 BFS탐색
	{
		ArrayList<Integer> visit = new ArrayList<>();//방문한 노드를 순서대로 저장하는 visit 배열
		Queue<Integer> queue = new LinkedList<>();//방문할 노드를 저장하는 queue
		
		queue.offer(start_node);
		
		while(!queue.isEmpty())//queue안에 후보노드가 존재한다면 탐색을 계속 진행
		{
			int node = queue.poll();//방문할 후보노드를 queue에서 뽑음
			
			if(!visit.contains(node))//방문한 배열에 해당 node를 추가
			{
				visit.add(node);//방문한 배열에 해당 node를 추가
				System.out.println("현재 방문한 노드: " + node);
				System.out.print("후보노드로 추가한 노드 목록: ");
				for (int i = 0; i < graph[node].length; i++)//현재 방문한 노드의 자식노드들을 후보노드로 추가 
				{
					queue.offer(graph[node][i]);
					System.out.print(graph[node][i] + " ");
				}
				System.out.println();
			}
		}
		System.out.print("방문한 노드(visit): ");
		for (Integer integer : visit) {
			System.out.print(integer + " ");
		}
	}
	
	
	public static void main(String[] args) 
	{
		int[][] graph = 
			{
				{1, 2, 3},
				{4, 5},
				{6},
				{7, 8},
				{9},
				{},
				{10},
				{},
				{11},
				{},
				{},
				{}
			};
		BFS(graph, 0);
	}
}