package D_220331;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Receiver
{
	public static void main(String[] args) 
	{
		byte[] buf = new byte[256];//256byte를 저장할 수 있는 byte 배열
		try 
		{
			System.out.println("택배 왜 안옴???");
			DatagramSocket socket = new DatagramSocket(8000);//8000번 포트와 bind되는 소켓을 생성
			DatagramPacket packet = new DatagramPacket(buf, buf.length);//받을 데이터패킷 객체 생성(byte배열, byte배열 길이)
			socket.receive(packet);
			System.out.println(new String(buf));//byte배열을 문자열(String)으로 생성 후 출력
		} 
		catch (Exception e) 
		{
			
		}
	}
}