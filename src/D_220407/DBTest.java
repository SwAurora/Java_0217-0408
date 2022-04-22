package D_220407;

import java.sql.*;

public class DBTest
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

			String query = "select * from books";
			ResultSet rs = stmt.executeQuery(query);

			while(rs.next())
			{
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				
				System.out.println(id);
				System.out.println(title);
				System.out.println(publisher);
				System.out.println(price);
			}

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
