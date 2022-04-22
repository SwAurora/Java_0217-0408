package D_220408;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectTest
{
    public static void main(String[] args)
    {
        String url="jdbc:mysql://localhost:3306/chattingdb_java";
        String id = "root";
        String pw = "1234";
        String driver = "com.mysql.cj.jdbc.Driver";

        try{
            Class.forName(driver);
            System.out.println("드라이브 로드 완료 ");
            Connection conn = DriverManager.getConnection(url,id,pw);
            System.out.println("연결 객체 생성 완료");
            

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
