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
			System.out.println("�������û�����");
			String name=sc.next();
			System.out.println("���������룺");
			String password=sc.next();
			PreparedStatement ps=c.prepareStatement("select * from user where name=?&&password=?");
			ps.setString(1,name);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{
				System.out.println("��¼�ɹ���");
				if(rs.getInt(4)==0)
				{
					System.out.println("��ͨ�û����鿴dvd������dvd���黹�����а�");
				}
				else {
					System.out.println("����Ա������dvd��ɾ��dvd���鿴�����а�");
				}
			}
			else {
				System.out.println("��¼ʧ�ܣ������û��������룡");
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
