package D_220329;

import java.io.File;

public class IO1 
{

	public static void main(String[] args) 
	{
		String path = ".\\";
		
		File file = new File(path);//내가 설정한 경로로 file 객체를 생성
		
		String list[] = file.list();//file경로의 모든 파일과 폴더 이름을 배열형태로 가져온다
		
		for (int i = 0; i < list.length; i++) {
			
			File this_file = new File(path, list[i]);//파일 객체 + 파일/폴더명 으로 새로운 파일 객체 생성
			
			if(this_file.isDirectory())//만약 현재 객체가 폴더
			{
				System.out.println(list[i] + ": 디렉토리");
			}
			else
			{
				System.out.printf("%s: 파일(%,dbyte)\n", list[i], this_file.length());//%,d 하면 1000의 자리 넘어갈때마다 , 찍어줌
			}
		}
	}

}
