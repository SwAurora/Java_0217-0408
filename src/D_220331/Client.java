package D_220331;

import java.io.DataInputStream;
import java.net.Socket;

public class Client
{
	public static void main(String[] args) 
	{
		String serverIp = "192.168.1.2";//or 127.0.0.1
		System.out.println("서버에 연결 시도 중...");
		try 
		{
			Socket socket = new Socket(serverIp, 8000);//서버와 연결할 소켓 객체를 생성해서 연결
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String result = dis.readUTF();
			System.out.println("서버로부터 받은 메세지: " + result);
			
			dis.close();
			socket.close();
		} 
		catch (Exception e) 
		{
			System.out.println("포트가 열려있지 않음");
		}
	}
}