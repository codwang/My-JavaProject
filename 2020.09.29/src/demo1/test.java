
package demo1;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;


public class test {
	public static void main(String []args)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/wangba", "root", "123456");
			if(conn==null)
			{
				System.out.println("连接失败!");
			}else {
				System.out.println("连接成功!");
			}
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
