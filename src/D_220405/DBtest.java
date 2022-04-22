package D_220405;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBtest
{

	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/librarydb";
		String user = "root";
		String pw = "1234";
		Connection con = null;

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 적재 성공");

			con = DriverManager.getConnection(url, user, pw);
			System.out.println("DB 연결 성공");

			Statement stmt = con.createStatement();
			
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class.forname에 잘 적었나요?");
		}
		catch(SQLException e)
		{
			System.out.println("connection에 실패했습니다");
			System.out.println("port번호 잘 확인하였나요?");
			System.out.println("user id 와 비밀번호 잘 적었나요?");
		}
	}

}
