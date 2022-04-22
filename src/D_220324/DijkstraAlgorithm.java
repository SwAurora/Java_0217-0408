package D_220324;

public class DijkstraAlgorithm
{

	public static void main(String[] args) 
	{
		int[][] nodes =
			{
					{1,2,2},
					{1,3,5},
					{2,3,6},
					{2,4,1},
					{2,5,3},
					{4,5,4},
					{5,7,9},
					{3,6,8},
					{6,7,7}
			};
		
		int startNode = 0;
		int N = 7; //node의 수
//		int E = 9; //간선의 수
		
		int INF = 10000000;
		
		boolean[] visit = new boolean[N];
		int[] nodeCost = new int[N];
		
		for (int i = 0; i < N; i++) 
		{
			visit[i] = false;
			nodeCost[i] = INF;
		}
		
		visit[startNode] = true;
		nodeCost[startNode] = 0;
		
		while(true)
		{
			boolean out = true;
			for (int j = 0; j < visit.length; j++) 
			{
				if(!visit[j])//하나라도 방문 안한 노드가 있으면 out = false
				{
					out = false;
				}
			
			}
			
			if(out)
			{
				break;
			}
			
			int lowCost = INF;
			int lowNode = -1;
			startNode = -1;
			
			for (int j = 0; j < nodes.length; j++)//현재 출발지를 도착지로 보고 연결 할 수 있는 출발지를 찾는다.
			{
				int nowNode = nodes[j][0] - 1;
				int arriveNode = nodes[j][1] - 1;
				int cost = nodes[j][2];
				
				if(visit[nowNode] && !visit[arriveNode] && (nodeCost[nowNode] + cost < lowCost))//만약 연결되어있고 출발지가 아직 방문되지 않았다면
				{
					lowCost = nodeCost[nowNode] + cost;//가중치를 계산한 후 현재 상태에서 가장 작은 가중치와 비교
					lowNode = arriveNode;
					startNode = nowNode;
				}
//				else if(visit[arriveNode] && !visit[nowNode] && (nodeCost[arriveNode] + cost < lowCost))
//				{
//					lowCost = nodeCost[arriveNode] + cost;
//					lowNode = nowNode;
//					startNode = arriveNode;
//				}
				System.out.println("lowcost  " + lowCost);
				System.out.println("lownode  " + lowNode);
				System.out.println("startnode  " + startNode);
			}
			
			visit[lowNode] = true;
			nodeCost[lowNode] = lowCost;
			for (boolean i : visit)
			{
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i : nodeCost)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
