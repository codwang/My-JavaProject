
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
				System.out.println("����ʧ��!");
			}else {
				System.out.println("���ӳɹ�!");
			}
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
