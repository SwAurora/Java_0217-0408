package D_220329;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO2 
{

	public static void main(String[] args) 
	{
		FileOutputStream out = null;
		
		FileInputStream in = null;
		
		try
		{
			in = new FileInputStream("input.txt");//input.txt파일로부터 데이터를 읽어올 수 있도록(파일이 있어야함)
			out = new FileOutputStream("output.txt");//output.txt파일에 데이터를 쓸 수 있도록 (없어도 파일 생성해줌)
			
			int c = in.read();// 1byte 읽어서 c에 저장
			
			while(c != -1)//파일을 읽다가 끝에 도달하면 -1을 반환하기 때문에 c가 -1이 아니라면 파일을 계속 읽음
			{
				System.out.print((char)c);//읽은 데이터를 출력
				out.write(c);//읽은 바이트를 out객체에 쓴다
				c = in.read();//다음 데이터를 읽는다
			}	
		}
		catch(Exception e)
		{
			System.out.println("input.txt 파일이 존재하지 않습니다");
		}
		
		finally
		{
			try//앞에서 열지 않으면 닫을 수 없어서 try catch 사용
			{
				in.close();
				out.close();
			}
			catch(Exception e2)
			{
				System.out.println("스트림이 연결도 안됐는데 닫는 시도를 함");
			}
		}
	}

}