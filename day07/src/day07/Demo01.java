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
 *��ɾ��executeUpdata
 */
class Demo01 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			if(conn!=null)
				{
					System.out.println("java����mysql�ɹ�!");
				}
				else {
					System.out.println("java����mysqlʧ��!");
				}
			System.out.println("������Ҫ���ĵ�dvd��ID��");
			int id=sc.nextInt();
			PreparedStatement ps=conn.prepareStatement("update dvd2 set state=1,borName=?,borData=?,times=times+1 where id=?");
			System.out.println("������Ҫ���ĸ�dvd���˵�������");
			String name=sc.next();
			System.out.println("������Ҫ���ĸ�dvd�����ڣ�");
			String bordata=sc.next();
			ps.setString(1, name);
			ps.setString(2, bordata);
			ps.setInt(3, id);
			int row=ps.executeUpdate();
			if(row==1)
			{
				System.out.println("���ĳɹ�!");
			}
			else {
				System.out.println("����ʧ��!");
			}
			
			
			
//			System.out.println("������Ҫ�黹��dvd��ID��");
//			int bid=sc.nextInt();
//			PreparedStatement bps=conn.prepareStatement("update dvd2 set state=0,borName=?,borData=? where id=?");
//			System.out.println("������黹��dvd�����ڣ�");
//			String  bdata=sc.next();
//			bps.setString(1, "0");
//			bps.setString(2, bdata);
//			bps.setInt(3, bid);
//			int row=bps.executeUpdate();
//			if(row==1)
//			{
//				System.out.println("�黹�ɹ�!");
//			}
//			else {
//				System.out.println("�黹ʧ��!");
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
