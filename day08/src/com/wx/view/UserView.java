/**
 * 
 */
package com.wx.view;

import java.util.List;
import java.util.Scanner;

import com.wx.dao.UserDao;

/**
 * @author 13093
 *
 */
public class UserView {//登录菜单
	
	public  void beginMenu() {
		System.out.println("*************欢迎进入DVD管理系统*********");
		System.out.println("请输入登录的用户名:");
		Scanner sc=new Scanner(System.in);
		String username=sc.next();
		System.out.println("请输入用户密码:");
		String password=sc.next();
		
		//登录功能
		List<List<Object>> login=new UserDao().login(username,password);
		if(login==null||login.size()==0)
		{
			System.out.println("登陆失败，请检查用户名和密码!");
		}
		else {
			System.out.println("登陆成功!");
			//获取登陆者角色，从第一行第四列中获取
			if((int)(login.get(0).get(3))==1)
			{
				//管理员登录
				new DVDView().manageMenu();
			}
			else {
				//普通用户登录
				new DVDView().commonMenu();
			}
		}
		sc.close();
	}



	
}
