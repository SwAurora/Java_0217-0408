package D_220325;

import java.util.ArrayList;

public class TowerDFS 
{
	
	static boolean Jump(ArrayList<Integer> tower, int now_floor, int jump)
	{
		if(now_floor == tower.get(tower.size()-1))//현재 도달한 층이 타워의 마지막 층이라면 true 반환
		{
			return true;
		}
		
		if(now_floor > tower.get(tower.size()-1) || jump <= 0)//만약 점프해서 도달한 층이 타워의 맨 마지막 층보다 높다면, 점프를 안했거나 밑으로 했다면 false
		{
			return false;
		}
		
		if(tower.contains(now_floor))//현재 층이 타워 배열 안에 존재한다면
		{
			//다음 갈 수 있는 모든 층으로 점프롤 시도
			//다음 층수 = 이전층에서 올라온 jump량 + 현재 내 층수
			return Jump(tower, now_floor + jump, jump) ||
			Jump(tower, now_floor + jump+1, jump+1) || 
			Jump(tower, now_floor + jump-1, jump-1);
		}
		
		return false;//현재 층이 타워 배열 안에 없다면 갈 수 없다고 판단해서 false 반환
		
	}
	
	public static void main(String[] args) 
	{
		int[] tower = {0, 1, 2, 4, 7, 9};
		
		ArrayList<Integer> newTower = new ArrayList<>();
		
		for (int i = 0; i < tower.length; i++) 
		{
			newTower.add(tower[i]);
		}
		
		System.out.println(Jump(newTower, 1, 1));//첫 층은 무조건 1층, jump량도 무조건 1
		
	}

}
