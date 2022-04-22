package D_220407;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest3
{
	static Statement stmt;

	static void insert_data(int id, String title, String publisher, int price)
	{
		String query = "insert into books values" + 
	                   "('" + id + "', '" + title + "', '" + publisher + "', '" + price + "')";

		try
		{
			int result = stmt.executeUpdate(query);
			if(result == 1)
			{
				System.out.println("데이터가 정상적으로 추가되었습니다");
			}
			else
			{
				System.out.println("데이터 추가를 실패하였습니다");
			}
		}
		catch(SQLException e)
		{
			System.out.println("query문이 잘못되었습니다. 확인 바람.");
		}

	}

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

			stmt = con.createStatement();
			
			insert_data(7, "마지막 인생", "이태원", 5000);
			insert_data(8, "dddd", "eeee", 3000);

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
