/**
 * 
 */
package day07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * @author 13093
 *增删改executeUpdata
 */
class Demo01 {

	
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
			System.out.println("请输入要借阅的dvd的ID：");
			int id=sc.nextInt();
			PreparedStatement ps=conn.prepareStatement("update dvd2 set state=1,borName=?,borData=?,times=times+1 where id=?");
			System.out.println("请输入要借阅该dvd的人的姓名：");
			String name=sc.next();
			System.out.println("请输入要借阅该dvd的日期：");
			String bordata=sc.next();
			ps.setString(1, name);
			ps.setString(2, bordata);
			ps.setInt(3, id);
			int row=ps.executeUpdate();
			if(row==1)
			{
				System.out.println("借阅成功!");
			}
			else {
				System.out.println("借阅失败!");
			}
			
			
			
//			System.out.println("请输入要归还的dvd的ID：");
//			int bid=sc.nextInt();
//			PreparedStatement bps=conn.prepareStatement("update dvd2 set state=0,borName=?,borData=? where id=?");
//			System.out.println("请输入归还该dvd的日期：");
//			String  bdata=sc.next();
//			bps.setString(1, "0");
//			bps.setString(2, bdata);
//			bps.setInt(3, bid);
//			int row=bps.executeUpdate();
//			if(row==1)
//			{
//				System.out.println("归还成功!");
//			}
//			else {
//				System.out.println("归还失败!");
//			}
//			
//			bps.close();
			ps.close();
			conn.close();
			sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
