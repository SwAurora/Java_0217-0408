package D_220408;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class Users
{
	// 모든 client를 관리하는 HashMap
	// key: client의 닉네임, value: client와 연결되어있는 socket의 DataOutputStream
	HashMap<String, DataOutputStream> clientMap = new HashMap<>();

	//클라이언트가 접속했을 때 실행되는 add_user. HashMap에 추가하는 작업을 담당
	//Socket: 연결된 client의 socket, nickName: 연결된 client의 닉네임
	public synchronized void add_user(Socket socket, String nickName)
	{
		try
		{
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());//client와 연결된 socket에서 서버가 보낼 outputStream을 받아옴
			clientMap.put(nickName, outputStream);//HashMap에 추가
			send_message(nickName + "님이 입장하셨습니다. --server\n");
			send_message("현재 채팅 참여 인원: " + clientMap.size() + "\n");
		}
		catch(Exception e)
		{
		}
	}
	//client가 채팅방을 나갔을 때 동작을 처리함 HashMap에서 해당 유저를 제거
	//nickName: 채팅방을 나간 client의 닉네임
	public synchronized void remove_user(String nickName)
	{
		try
		{
			clientMap.remove(nickName);
			send_message(nickName + "님이 퇴장하셨습니다. --server\n");
			send_message("현재 채팅 참여 인원: " + clientMap.size() + "\n");
		}
		catch(Exception e)
		{
		}
	}
	//접속되어 있는 모든 클라이언트들에게 메세지를 보내는 담당
	//HashMap에 저장되어있는 모든 dataoutputStream에서 writeUTF를 함
	//message: 모든 클라이언트들에게 보낼 메세지
	public synchronized void send_message(String message) throws Exception
	{
		Iterator<String> iter = clientMap.keySet().iterator();
		while(iter.hasNext())
		{
			String clientNickName = iter.next(); //닉네임을 받아서
			clientMap.get(clientNickName).writeUTF(message);
		}
	}
}
