package D_220408;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server
{
	public static void main(String[] args)
	{
		ArrayList<Thread> clientThread = new ArrayList<>();// 클라이언트들의 Thread를 저장하고 있는 ArrayList
		Users users = new Users();// 클라이언트들을 HashMap으로 관리하는 Users클래스 객체
		ServerSocket serverSocket = null;

		try
		{
			System.out.println("서버를 시작합니다...");
			System.out.println("소켓을 생성하는 중...");
			serverSocket = new ServerSocket(8000);

			while(true)
			{
				System.out.println("client의 연결 요청을 기다리는 중...");
				Socket socket = serverSocket.accept();
				// 여기로 왔다는 것은 client와 연결이 이루어졌다는 뜻
				UserManager um = new UserManager(socket, users);// UserManager 객체
				Thread umThread = new Thread(um);// UserManager 스레드 생성
				clientThread.add(umThread);// ArrayList에 해당 스레드를 저장
				umThread.start();// 스레드를 시작
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: server Port가 이미 사용중입니다!");
		}
		finally
		{
			try
			{
				serverSocket.close();
			}
			catch(Exception e2)
			{
				System.out.println("Error: 서버가 닫혀있는데 닫는 시도를 함");
			}
		}
	}
}
