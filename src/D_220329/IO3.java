package D_220329;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class IO3 
{

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin = new FileInputStream("src.zip");//파일과 프로그램을 연결
			ZipInputStream zin = new ZipInputStream(fin);//ZipInputStream과 FileInputStream을 결합
			ZipEntry entry = null;//압축파일 데이터들은 ZipEntry객체
			
			while((entry = zin.getNextEntry()) != null)//압축파일의 다음 ZipEntry객체를 가져옴, 만약 다음 가져올 객체가 있다면 while문을 돌린다
			{
				System.out.println("압축해제: " + entry.getName());//ZipEntry객체의 이름(파일의 이름)을 출력한다
				
				FileOutputStream fout = new FileOutputStream(entry.getName());//현재 ZipEntry객체의 이름으로 FileOutoutStream을 연결(파일생성)
				
				for (int c = zin.read(); c != -1; c = zin.read())
				{
					fout.write(c);//읽은 바이트만큼 그대로 outputStream에 쓴다
				}
				fout.close();
				zin.closeEntry();
			}
			zin.close();
			fin.close();
		}
		catch(Exception e)
		{
			
		}
	}

}