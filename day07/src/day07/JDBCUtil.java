/**
 * 
 */
package day07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author 13093
 *
 */
public class JDBCUtil {

	//实现增删改功能
	public int update(String sql,List list)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			PreparedStatement ps=conn.prepareStatement(sql);
			if(list!=null)
			{
				//说明有？号
				for(int i=0;i<list.size();i++)
				{
					ps.setObject(i+1, list.get(i));
				}
			}
			int row=ps.executeUpdate();
			ps.close();
			conn.close();
			return row;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	public void Find(String sql)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ResultSet rs =ps.executeQuery();
			System.out.println("编号\t名字\t价格\t出版社\t借阅次数");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(8));
			}
        	ps.close();
			conn.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	
}
