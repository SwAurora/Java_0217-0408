package D_220331;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try 
		{
			serverSocket = new ServerSocket(8000);
			System.out.println("서버소켓이 생성되었습니다");
			System.out.println("클라이언트의 요청을 기다리는 중....");
	
			Socket socket = serverSocket.accept();//클라이언트 연결이 올 때까지 대기
			
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());//여기 왔다는 것은 연결이 되었다는 뜻 //소켓으로부터 outputstream 생성
			
			out.writeUTF("yesyesyesyesyesyes");//클라이언트에게 데이터를 보낸다 (문자열을 쓴다)
			out.close();
			serverSocket.close();
		} 
		catch (Exception e) 
		{
			System.out.println("port가 사용중입니다!");
		}
	}
}