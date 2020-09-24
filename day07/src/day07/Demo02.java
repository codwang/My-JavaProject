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
 *查询 executeQuery(查)
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
//			System.out.println("请输入要查询的dvd的ID：");
//			int id=sc.nextInt();
			PreparedStatement ps=conn.prepareStatement("select * from dvd2");
			ResultSet rs =ps.executeQuery();//查询
			System.out.println("编号\t名字\t价格\t出版社\t借阅次数");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(8));
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
