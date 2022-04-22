package D_220407;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest2
{

	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3330/librarydb";
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

			String query = "insert into books values (5, 'test', '연구원', 1)";

			int result = stmt.executeUpdate(query);
			System.out.println("결과: " + result);
			
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class.forName에 잘 적었나요?^^");
		}
		catch(SQLException e)
		{
			System.out.println("connetion에 실패했습니다");
			System.out.println("port번호와 url 잘 확인하였나요??????");
			System.out.println("user id와 비밀번호 잘 적었나요?^^");
		}
	}

}
