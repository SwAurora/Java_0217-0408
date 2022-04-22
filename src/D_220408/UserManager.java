package D_220408;

import java.io.DataInputStream;
import java.net.Socket;

public class UserManager implements Runnable
{
	Socket socket; // client와 연결된 socket 객체
	DataInputStream in;// client와 연결된 socket에서 받아온 DataInputStream
	String nickName;// client의 닉네임
	Users users;// Users클래스의 객체

	public UserManager(Socket socket, Users users) throws Exception
	{
		this.users = users;
		this.socket = socket;
		this.in = new DataInputStream(socket.getInputStream());
		this.nickName = in.readUTF();// 최초로 클라이언트가 연결되면 클라이언트는 ChatRoom의 생성자에서 서버에게 nickName을 write -> readUTF하면
										// client의 닉네임을 받아온다는 것
		this.users.add_user(socket, nickName);
	}
	
	@Override
	public void run()//client가 서버에게 메세지를 전송하면 받아서 모든 client에게 전송해주는 역할
	{
		try
		{
			while(true)
			{
				//서버로 클라이언트가 보낸 채팅이 왔으면 읽는다
				String message = in.readUTF();
				//모든 클라이언트들에게 해당메세지를 전송
				this.users.send_message(this.nickName + ": " + message + "\n");
			}
		}
		catch(Exception e)//여기서 Exception이 발생했다는 것: send_message에서 Exception 발생 / 사용자가 접속을 끊었다는 의미, 채팅방에서 사용자 제거
		{
			users.remove_user(this.nickName);
		}
	}
}
