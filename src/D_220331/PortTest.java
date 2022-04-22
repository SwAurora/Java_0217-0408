package D_220331;

import java.io.IOException;
import java.net.ServerSocket;

public class PortTest
{
	public static void main(String[] args) 
	{
		ServerSocket serverSocket = null;
		
		System.out.println("Port스캔을 시작합니다");
		
		for (int i = 1; i <= 65535; i++) 
		{
			try
			{
				serverSocket = new ServerSocket(i);//서버소켓 객체를 생성한다. i번째 포트로 생성
				serverSocket.close();
			}
			catch(IOException e)
			{
				System.out.println(i + "번 포트가 사용중입니다.");
			}
		}
	}
}