/**
 * 
 */
package day07;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 13093
 *
 */
class DemoSelect {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		JDBCUtil jdbc=new JDBCUtil();
		List list=new ArrayList();
		System.out.println("��ѡ��->����or�黹:");
		String input=sc.next();
		if(input.equals("����"))
		{
		System.out.println("������Ҫ���ĵ�dvd��ID��");
		int id=sc.nextInt();
		System.out.println("������Ҫ���ĸ�dvd���˵�������");
		String name=sc.next();
		System.out.println("������Ҫ���ĸ�dvd�����ڣ�");
		String bordata=sc.next();
		list.add(name);
		list.add(bordata);
		list.add(id);
		int row=jdbc.update("update dvd2 set state=1,borName=?,borData=?,times=times+1 where id=?",list);
		System.out.println(row>=1?"���ĳɹ�!":"����ʧ��!");
		}
		else if(input.equals("�黹"))
		{
			System.out.println("������Ҫ�黹��dvd��ID��");
			int id=sc.nextInt();
			System.out.println("������Ҫ�黹��dvd���˵�������");
			String name=sc.next();
			System.out.println("������Ҫ�黹��dvd�����ڣ�");
			String bordata=sc.next();
			list.add(name);
			list.add(bordata);
			list.add(id);
			int row=jdbc.update("update dvd2 set state=0,borName=?,borData=? where id=?",list);
			System.out.println(row>=1?"�黹�ɹ�!":"�黹ʧ��!");
		}
		sc.close();
	}

}
