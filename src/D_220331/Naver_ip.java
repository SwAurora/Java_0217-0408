package D_220331;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Naver_ip
{
	public static void main(String[] args) 
	{
		String hostname = "www.naver.com";
		try
		{
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("ip주소: " + address.getHostAddress());
		}
		catch(UnknownHostException e)
		{
			System.out.println("해당 사이트를 찾을 수 없습니다");
		}
	}
}