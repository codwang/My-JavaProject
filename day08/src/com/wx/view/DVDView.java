/**
 * 
 */
package com.wx.view;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.wx.dao.DVDDao;

/**
 * @author 13093
 *
 */
public class DVDView {
	Scanner sc=new Scanner(System.in);
	DVDDao dao=new DVDDao();
	//普通用户的界面
	public void commonMenu() {
		int input;
		do
		{
		System.out.println("1.显示所有DVD");
		System.out.println("2.借阅DVD");
		System.out.println("3.归还DVD");
		System.out.println("4.DVD排行榜");
		System.out.println("0.退出系统");
		System.out.println("请选择->[0-4]");
		input=sc.nextInt();
		
			switch(input)
			{
			case 0:
				System.out.println("系统已退出，欢迎下次光临！");
				break;
			case 1:
				ShowAllDVD();
				break;
			case 2:
				BorDVD();
				break;
			case 3:
				returnDVD();
				break;
			case 4:
				ShowDVDOrder();
				break;
			default:
				System.out.println("您的操作有误，请重新输入!");;
				break;
			}
		}while(input!=0);
		
	}
	//管理员的界面
	public void manageMenu() {
		
	int input;
	do
	{
	System.out.println("1.显示所有DVD");
	System.out.println("2.新增DVD");
	System.out.println("3.删除DVD");
	System.out.println("4.DVD排行榜");
	System.out.println("0.退出系统");
	Scanner sc=new Scanner(System.in);
	System.out.println("请选择->[0-4]");
	input=sc.nextInt();
	
		switch(input)
		{
		case 0:
			System.out.println("系统已退出，欢迎下次光临！");
			break;
		case 1:
			ShowAllDVD();
			break;
		case 2:
			InsertDVD();
			break;
		case 3:
			DeleteDVD();
			break;
		case 4:
			ShowDVDOrder();
			break;
		default:
			System.out.println("您的操作有误，请重新输入!");
			break;
		}
	}while(input!=0);
	
}
	//显示所有DVD
  	public void ShowAllDVD()
	{
		List<List<Object>> list = dao.queryAllDVD();
		if(list==null||list.size()==0)
		{
			System.out.println("没有查询到数据!");
		}
		else {
			System.out.println("编号\t名字\t价格\t出版社\t是否借出\t借阅人\t借阅日期\t\t借阅次数");
			for(int i=0;i<list.size();i++)
			{
				for(int j=0;j<list.get(i).size();j++)
				{
					System.out.print(list.get(i).get(j)+"\t");
				}
				System.out.println();
			}
		}
	}
	//借阅DVD
	public void BorDVD()

	{
		System.out.println("请输入借阅的DVD的编号");
		int id=sc.nextInt();
		//查询dvd是否存在
		List<List<Object>> list =dao.queryById(id);
		if(list==null||list.size()==0)
		{
			//没有查到
			System.out.println("编号为"+id+"的DVD未查到,请确定后再继续！");
		}
		else {
			//查到
			if((int)(list.get(0).get(4))==1)
			{
				System.out.println("编号为"+id+"的DVD已经被借出!请重新选择!");
			}
			else
			{
				System.out.println("该DVD未被借出，可借阅!");
				System.out.println("请输入借阅者的姓名:");
				String name=sc.next();
				System.out.println("请输入借阅的日期，格式2020-1-23:");
				String date=sc.next();
				int row=dao.borrow(id, name, date);
				if(row==0)
				{
					System.out.println("借阅失败!");
				}
				else {
					System.out.println("借阅成功!");
				}
			}
		}
	}
	//归还DVD
	public void returnDVD()
	{
		System.out.println("请输入归还的DVD的编号");
		int id=sc.nextInt();
		//查询dvd是否存在
		List<List<Object>> list =dao.queryById(id);
		if(list==null||list.size()==0)
		{
			//没有查到
			System.out.println("编号为"+id+"的DVD未查到,请确定后再继续！");
		}
		else {
			//查到
			if((int)(list.get(0).get(4))==0)
			{
				System.out.println("编号为"+id+"的DVD未被借出!不用归还!");
			}
			else {
				//已经借出，可以归还
				//借阅日期差，开始
				Date nowDate=new Date();//获取当前系统时间
				String borData=(String)(list.get(0).get(6));
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				try {//日期和字符串转换
					Date date=sdf.parse(borData);//将字符串的日期，转成日期格式
					System.out.println(nowDate+"********"+date);
					long ms=nowDate.getTime()-date.getTime();//当前日期-借阅日期的毫秒数
					int day=(int)(ms/(1000*60*60*24));//将毫秒数转为天数
					System.out.println("编号为"+id+"的DVD，已经借出"+day+"天。");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//借阅日期差，结束
				int row=dao.returnDVD(id);
				if(row>=1)
				{
					System.out.println("归还成功!");
				}
				else
				{
					System.out.println("归还失败!");
				}
			}
		}
	}
	//DVD排行榜
 	public void ShowDVDOrder()
	{
		
		List<List<Object>> list=dao.queryByOrder();
		if(list==null||list.size()==0)
		{
			System.out.println("没有查询到数据!");
		}
		else {
			System.out.println("编号\t名字\t价格\t出版社\t是否借出\t借阅人\t借阅日期\t\t借阅次数");
			for(int i=0;i<list.size();i++)
			{
				for(int j=0;j<list.get(i).size();j++)
				{
					System.out.print(list.get(i).get(j)+"\t");
				}
				System.out.println();
			}
		}
	}
	//新增DVD
 	public void InsertDVD()
 	{
 		System.out.println("欢迎来到新增界面!");
 		System.out.println("请输入DVD的名称:");
 		String Sname=sc.next();
 		System.out.println("请输入DVD的价格:");
 		Double price=sc.nextDouble();
 		System.out.println("请输入DVD的出版社:");
 		String publish=sc.next();
 		int row=dao.Insert(Sname, price, publish);
 		if(row>=1)
 		{
 			System.out.println("新增成功!");

 		}
 		else {
 			System.out.println("新增失败!");
 		}

 	}
	//删除DVD
 	public void DeleteDVD()
 	{
 		
 		System.out.println("欢迎来到删除界面!");
 		System.out.println("请选择删除全部DVD还是单个DVD？all or single");
 		String input=sc.next();
 		if(input.equals("all"))
 		{
 			int row=dao.DeleteAllDVD();
 			if(row>=1)
 	 		{
 	 			System.out.println("所有DVD删除成功!");
 	 		}
 	 		else {
 	 			System.out.println("删除失败!");
 	 		}
 		}
 		else if(input.equals("single"))
 		{
 		System.out.println("请输入要删除的DVD的ID。");
 		int id=sc.nextInt();
 		int row=dao.Delete(id);
 		if(row>=1)
 		{
 			System.out.println("删除成功!");
 		}
 		else {
 			System.out.println("删除失败!");
 		}
 		}
 		else {
 			System.out.println("您的输入有误！请重新输入！");
 		}
 	}
}
