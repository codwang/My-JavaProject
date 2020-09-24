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
		System.out.println("请选择->借阅or归还:");
		String input=sc.next();
		if(input.equals("借阅"))
		{
		System.out.println("请输入要借阅的dvd的ID：");
		int id=sc.nextInt();
		System.out.println("请输入要借阅该dvd的人的姓名：");
		String name=sc.next();
		System.out.println("请输入要借阅该dvd的日期：");
		String bordata=sc.next();
		list.add(name);
		list.add(bordata);
		list.add(id);
		int row=jdbc.update("update dvd2 set state=1,borName=?,borData=?,times=times+1 where id=?",list);
		System.out.println(row>=1?"借阅成功!":"借阅失败!");
		}
		else if(input.equals("归还"))
		{
			System.out.println("请输入要归还的dvd的ID：");
			int id=sc.nextInt();
			System.out.println("请输入要归还该dvd的人的姓名：");
			String name=sc.next();
			System.out.println("请输入要归还该dvd的日期：");
			String bordata=sc.next();
			list.add(name);
			list.add(bordata);
			list.add(id);
			int row=jdbc.update("update dvd2 set state=0,borName=?,borData=? where id=?",list);
			System.out.println(row>=1?"归还成功!":"归还失败!");
		}
		sc.close();
	}

}
