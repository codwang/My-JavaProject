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
 *JDBC��
 *1.��������
 *2.��ȡ���ӣ�java����mysql���ݿ⣩
 *3.Ԥִ�У�׼����SQL��䣩
 *4.ִ��
 *5.�ͷ���Դ���ر�Ԥִ�У��ر����ӣ�
 */
class Demo01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		//1.��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2.��ȡ����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			//3.Ԥִ�У�׼��SQL��䣩
				System.out.println("������dvd�����֣�");
				String name=sc.next();
				System.out.println("������dvd�ļ۸�");
				double price=sc.nextDouble();
				System.out.println("������dvd�ĳ����磺");
				String publish=sc.next();
				System.out.println("�������dvd�Ľ����ߣ�");
				String borName=sc.next();
				System.out.println("��������ĸ�dvd������");
				String borData=sc.next();
				PreparedStatement ps=conn.prepareStatement("insert into dvd2 values(null,?,?,?,0,?,?,0)");
				ps.setString(1, name);//��name��ֵ���ڵ�һ���ʺŴ�
				ps.setDouble(2,price);//��priced��ֵ����ڶ����ʺŴ�
				ps.setString(3, publish);//��publish��ֵ���ڵ������ʺŴ�
				ps.setString(4, borName);
				ps.setString(5, borData);
				//4.ִ��
				int row=ps.executeUpdate();//ִ��sql:ֻ��ִ����ɾ�ģ�����ֵΪӰ�캯��
				if (row==1)
				{
					System.out.println("�����ɹ�!");
					
				}
				else {
					System.out.println("����ʧ��!");
				}
//			if(conn!=null)
//			{
//				System.out.println("java����mysql�ɹ�!");
//			}
//			else {
//				System.out.println("java����mysqlʧ��!");
//			}
			//5.�ͷ���Դ
			sc.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}


}
