package D_220331;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Sender
{
	public static void main(String[] args) 
	{
		try 
		{
			String s = "택배요~~";
			
			DatagramSocket socket = new DatagramSocket();//데이터그램 소켓을 생성
			byte[] buf = s.getBytes();//문자열을 byte배열로 만든다
			
			InetAddress address = InetAddress.getByName("127.0.0.1");
			DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 8000);//보낼 패킷을 생성(보낼byte데이터, byte 길이, 목적지 주소, 포트번호)
			
			socket.send(packet);//소켓에서 생성한 패킷을 전송
			System.out.println("택배 발송");
			socket.close();
		} 
		catch (Exception e) 
		{
			
		}
	}
}