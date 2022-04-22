package D_220331;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Web_Information
{
	public static void main(String[] args) throws Exception
	{
		URL site = new URL("https://www.naver.com");//URL의 정보를 가져온다
		URLConnection url = site.openConnection();//해당 URL과 연결한다
		
		BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream(), "UTF-8"));
		
		String inLine = in.readLine();//한줄 읽음
		while(inLine != null)//끝까지 읽을때까지 반복
		{
			System.out.println(inLine);//읽은 줄을 출력
			inLine = in.readLine();//다시 한 줄 읽음
		}
		in.close();
	}
}