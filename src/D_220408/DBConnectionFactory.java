package D_220408;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionFactory
{
	// DB정보가 담긴 파일
	private File file;
	// DB의 정보
	private String driver;
	private String ip;
	private String port;
	private String db;
	private String url;
	private String user;
	private String password;
	// 연결된 connection 객체
	private Connection connection;

	public DBConnectionFactory()
	{
		file = new File("C:/Users/rlatj/IdeaProjects/Java_0217-0408/DBsetting.txt");
		loadData();
	}

	private void loadData()
	{
		try
		{
			BufferedReader bfr = new BufferedReader(new FileReader(file));
			driver = bfr.readLine();
			url = bfr.readLine();
			ip = bfr.readLine();
			port = bfr.readLine();
			db = bfr.readLine();
			user = bfr.readLine();
			password = bfr.readLine();
			//url정보를 합쳐서 하나로 만듦
			url += ip + ":" + port + "/" + db;
		}
		catch(Exception e)
		{
			System.out.println("Error: 파일을 읽을 수 없습니다.(파일이 존재하지 않음)");
		}
		
	}
	//connection객체를 반환하는 메소드 - DB와의 연결을 담당
	public Connection getConnection()
	{
		try
		{
			Class.forName(driver);
			
		}
		catch(Exception e)
		{
			System.out.println("Error: driver정보가 잘못되었습니다");
			return null; //연결 실패시 null 반환
		}
		
		try
		{
			//DB와의 연결을 시도하고 connection객체를 받아옴
			connection = DriverManager.getConnection(url, user, password);
		}
		catch(Exception e)
		{
			System.out.println("Error: DB와의 연결을 실패하였습니다.");
			System.out.println("Error: ip, port, user, pw 확인 바람.");
			return null;
		}
		
		System.out.println("MYSQL: " + db + "와의 연결을 완료하였습니다.");
		return connection;//연결된 DB의 connection객체를 반환
	}
	
}