package D_220324;

import java.util.ArrayList;

public class recursiveDFS 
{
	static void recursive_DFS(ArrayList<Integer> visit, int[][] graph, int node)
	{
		visit.add(node);//start_node를 방문했다고 체크
		
		for (int i = 0; i < graph[node].length; i++)//현재 node와 연결된 다른 노드를 체크 
		{
			if(!visit.contains(graph[node][i]))//다음 방문할 후보노드가 이미 방문되어 있는 노드가 아니라면
			{
				recursive_DFS(visit, graph, graph[node][i]);//다음 방문할 후보노드를 recursive_DFS메소드의 node로 전달해서 실행
			}
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
		
		ArrayList<Integer> visit = new ArrayList<>();
		
		recursive_DFS(visit, graph, 0);
		
		System.out.println("DFS로 방문한 노드들의 순서: ");
		for (Integer integer : visit) 
		{
			System.out.print(integer + " ");
		}
	}
}