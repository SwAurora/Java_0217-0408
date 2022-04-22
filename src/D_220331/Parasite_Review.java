package D_220331;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Parasite_Review
{
	public static void main(String[] args) throws Exception
	{
		URL site = new URL("https://movie.naver.com/movie/bi/mi/basic.naver?code=161967");//URL의 정보를 가져온다
		URLConnection url = site.openConnection();//해당 URL과 연결한다
		
		BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream(), "UTF-8"));
		
		String inLine = in.readLine();//한줄 읽음
		boolean printCheck = false;
		while(inLine != null)//끝까지 읽을때까지 반복
		{
			if(inLine.contains("/p"))
			{
				printCheck = false;
			}
			
			if(printCheck && !inLine.trim().equals(""))//만약 출력 flag가 true라면, 그리고 양쪽 공백을 다 없앴을 때 빈문자열이 아니라면
			{
				System.out.println(inLine.trim());//읽은 줄을 출력
			}
			
			if(inLine.contains("스포일러 컨텐츠"))
			{
				printCheck = true;//이제부터 출력해라
			}
			inLine = in.readLine();//다시 한 줄 읽음
		}
		in.close();
	}
}