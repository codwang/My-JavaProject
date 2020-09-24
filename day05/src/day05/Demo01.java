/**
 * 
 */
package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 13093
 *
 */
class Demo01 {

	public static  void Menu()//无参无返
	{
		System.out.println("*******************");
		System.out.println("******客户管理系统*****");
		System.out.println("******1.新增客户******");
		System.out.println("******2.显示所有用户***");
		System.out.println("******3.删除指定客户***");
		System.out.println("******4.修改客户******");
		System.out.println("******0.退出系统******");
		System.out.println("*******************");
		System.out.println("请选择->");
	}
	public static void main(String[] args) {
		
		List list=new ArrayList();
		//新增用户
		Scanner sc=new Scanner(System.in);
		int input;
		do
		{
			Menu();
		 input=sc.nextInt();
		 switch(input)
		 {
		 case 1:
			 String s;
			do
			{
			System.out.println("请输入客户编号：");
			int id=sc.nextInt();
			System.out.println("请输入客户姓名：");
			String name=sc.next();
			System.out.println("请输入客户电话号码：");
			String phone=sc.next();
			//创造一个客户
			Customer c=new Customer(id,name,phone);
			list.add(c);//将创建的客户存入列表
			System.out.println("新增成功！");
			System.out.println("是否继续录入？y or n");
			s=sc.next();
			}while(s.equals("y"));
			 break;
		 case 2:
			 System.out.println("客户编号\t客户姓名\t客户电话");
			for(int i=0;i<list.size();i++)
			{
				Customer c1=(Customer)(list.get(i));
				System.out.println(c1.id+"\t"+c1.name+"\t"+c1.phone);
			}
		 
			System.out.println("\n显示完毕！");
			 break;
		 case 3:
			 //删除客户
			 System.out.println("请输入需要删除的客户编号：");
				int del=sc.nextInt();
				int delIndex=-1;//未找到
				for(int i=0;i<list.size();i++)
				{
					Customer c1=(Customer)(list.get(i));
					if(c1.id==del)
					{
						delIndex=i;//记录删除客户的下标
						break;
					}
				}
				if(delIndex==-1)
				{
					System.out.println("未找到编号为"+del+"的客户");
				}
				else {
					list.remove(delIndex);//根据下标删除
					System.out.println("删除成功！");
				}
			 break;
		 case 4:
			System.out.println("请输入需要修改的客户编号：");
			int oldid =sc.nextInt();
			int updateIndex=-1;
			for(int i=0;i<list.size();i++)
			{
				Customer c1=(Customer)(list.get(i));
			if(c1.id==oldid)
				{
				updateIndex=i;//记录删除客户的下标
				break;
				}
			}
			if(updateIndex==-1)
			{
				System.out.println("未找到编号为"+oldid+"的客户");
			}
			else {
				String s1;
				String s2;
				do {
				Customer c1=(Customer)(list.get(updateIndex));	
				System.out.println("请输入需要修改的客户的原始信息:name or phone");
				s1=sc.next();
				if(s1.equals("name"));
				{
				System.out.println("请输入客户的新姓名("+c1.name+")");
				String newname=sc.next();
				list.set(updateIndex, new Customer(oldid,newname,c1.phone));
				}
				if(s1.equals("phone"))
				{
				System.out.println("请输入客户的新电话号码("+c1.name+")");
				String newphone=sc.next();
				list.set(updateIndex, new Customer(oldid,c1.name,newphone));
				}
				System.out.println("修改完毕！");
				System.out.println("是否继续修改:y or n");
				s2=sc.next();
				}while(s2.equals("y"));
			}
		 	 break;
		 case 0:
			 System.out.println("系统已退出");
			 break;
		 default:
			 System.out.println("您的编号输入有误，请重新输入！");
			 break;
		 }
		}while(input!=0);	
	}
}