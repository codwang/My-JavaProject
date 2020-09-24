/**
 * 
 */
package day07;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


/**
 * @author 13093
 *
 */
class login {


	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			System.out.println("请输入用户名：");
			String name=sc.next();
			System.out.println("请输入密码：");
			String password=sc.next();
			PreparedStatement ps=c.prepareStatement("select * from user where name=?&&password=?");
			ps.setString(1,name);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{
				System.out.println("登录成功！");
				if(rs.getInt(4)==0)
				{
					System.out.println("普通用户，查看dvd，借阅dvd，归还，排行榜");
				}
				else {
					System.out.println("管理员，新增dvd，删除dvd，查看，排行榜");
				}
			}
			else {
				System.out.println("登录失败，请检查用户名或密码！");
			}
			sc.close();
			ps.close();
			c.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	


}
