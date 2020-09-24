/**
 * 
 */
package day06;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * @author 13093
 *
 */
class Demo02 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			if(conn!=null)
				{
					System.out.println("java连接mysql成功!");
				}
				else {
					System.out.println("java连接mysql失败!");
				}
			System.out.println("请输入要删除的dvd的ID：");
			int id=sc.nextInt();
			PreparedStatement ps=conn.prepareStatement("delete from dvd2 where id=?");
			ps.setInt(1, id);
			int row=ps.executeUpdate();
			if(row==1)
			{
				System.out.println("删除成功!");
			}
			else {
				System.out.println("删除失败!");
			}
			ps.close();
			conn.close();
			sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
