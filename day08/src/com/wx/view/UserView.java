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
public class UserView {//��¼�˵�
	
	public  void beginMenu() {
		System.out.println("*************��ӭ����DVD����ϵͳ*********");
		System.out.println("�������¼���û���:");
		Scanner sc=new Scanner(System.in);
		String username=sc.next();
		System.out.println("�������û�����:");
		String password=sc.next();
		
		//��¼����
		List<List<Object>> login=new UserDao().login(username,password);
		if(login==null||login.size()==0)
		{
			System.out.println("��½ʧ�ܣ������û���������!");
		}
		else {
			System.out.println("��½�ɹ�!");
			//��ȡ��½�߽�ɫ���ӵ�һ�е������л�ȡ
			if((int)(login.get(0).get(3))==1)
			{
				//����Ա��¼
				new DVDView().manageMenu();
			}
			else {
				//��ͨ�û���¼
				new DVDView().commonMenu();
			}
		}
		sc.close();
	}



	
}
