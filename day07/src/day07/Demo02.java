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
 *��ѯ executeQuery(��)
 */
class Demo02 {

	
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
//			System.out.println("������Ҫ��ѯ��dvd��ID��");
//			int id=sc.nextInt();
			PreparedStatement ps=conn.prepareStatement("select * from dvd2");
			ResultSet rs =ps.executeQuery();//��ѯ
			System.out.println("���\t����\t�۸�\t������\t���Ĵ���");
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
