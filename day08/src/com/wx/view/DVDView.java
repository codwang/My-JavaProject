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
	//��ͨ�û��Ľ���
	public void commonMenu() {
		int input;
		do
		{
		System.out.println("1.��ʾ����DVD");
		System.out.println("2.����DVD");
		System.out.println("3.�黹DVD");
		System.out.println("4.DVD���а�");
		System.out.println("0.�˳�ϵͳ");
		System.out.println("��ѡ��->[0-4]");
		input=sc.nextInt();
		
			switch(input)
			{
			case 0:
				System.out.println("ϵͳ���˳�����ӭ�´ι��٣�");
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
				System.out.println("���Ĳ�����������������!");;
				break;
			}
		}while(input!=0);
		
	}
	//����Ա�Ľ���
	public void manageMenu() {
		
	int input;
	do
	{
	System.out.println("1.��ʾ����DVD");
	System.out.println("2.����DVD");
	System.out.println("3.ɾ��DVD");
	System.out.println("4.DVD���а�");
	System.out.println("0.�˳�ϵͳ");
	Scanner sc=new Scanner(System.in);
	System.out.println("��ѡ��->[0-4]");
	input=sc.nextInt();
	
		switch(input)
		{
		case 0:
			System.out.println("ϵͳ���˳�����ӭ�´ι��٣�");
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
			System.out.println("���Ĳ�����������������!");
			break;
		}
	}while(input!=0);
	
}
	//��ʾ����DVD
  	public void ShowAllDVD()
	{
		List<List<Object>> list = dao.queryAllDVD();
		if(list==null||list.size()==0)
		{
			System.out.println("û�в�ѯ������!");
		}
		else {
			System.out.println("���\t����\t�۸�\t������\t�Ƿ���\t������\t��������\t\t���Ĵ���");
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
	//����DVD
	public void BorDVD()

	{
		System.out.println("��������ĵ�DVD�ı��");
		int id=sc.nextInt();
		//��ѯdvd�Ƿ����
		List<List<Object>> list =dao.queryById(id);
		if(list==null||list.size()==0)
		{
			//û�в鵽
			System.out.println("���Ϊ"+id+"��DVDδ�鵽,��ȷ�����ټ�����");
		}
		else {
			//�鵽
			if((int)(list.get(0).get(4))==1)
			{
				System.out.println("���Ϊ"+id+"��DVD�Ѿ������!������ѡ��!");
			}
			else
			{
				System.out.println("��DVDδ��������ɽ���!");
				System.out.println("����������ߵ�����:");
				String name=sc.next();
				System.out.println("��������ĵ����ڣ���ʽ2020-1-23:");
				String date=sc.next();
				int row=dao.borrow(id, name, date);
				if(row==0)
				{
					System.out.println("����ʧ��!");
				}
				else {
					System.out.println("���ĳɹ�!");
				}
			}
		}
	}
	//�黹DVD
	public void returnDVD()
	{
		System.out.println("������黹��DVD�ı��");
		int id=sc.nextInt();
		//��ѯdvd�Ƿ����
		List<List<Object>> list =dao.queryById(id);
		if(list==null||list.size()==0)
		{
			//û�в鵽
			System.out.println("���Ϊ"+id+"��DVDδ�鵽,��ȷ�����ټ�����");
		}
		else {
			//�鵽
			if((int)(list.get(0).get(4))==0)
			{
				System.out.println("���Ϊ"+id+"��DVDδ�����!���ù黹!");
			}
			else {
				//�Ѿ���������Թ黹
				//�������ڲ��ʼ
				Date nowDate=new Date();//��ȡ��ǰϵͳʱ��
				String borData=(String)(list.get(0).get(6));
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				try {//���ں��ַ���ת��
					Date date=sdf.parse(borData);//���ַ��������ڣ�ת�����ڸ�ʽ
					System.out.println(nowDate+"********"+date);
					long ms=nowDate.getTime()-date.getTime();//��ǰ����-�������ڵĺ�����
					int day=(int)(ms/(1000*60*60*24));//��������תΪ����
					System.out.println("���Ϊ"+id+"��DVD���Ѿ����"+day+"�졣");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//�������ڲ����
				int row=dao.returnDVD(id);
				if(row>=1)
				{
					System.out.println("�黹�ɹ�!");
				}
				else
				{
					System.out.println("�黹ʧ��!");
				}
			}
		}
	}
	//DVD���а�
 	public void ShowDVDOrder()
	{
		
		List<List<Object>> list=dao.queryByOrder();
		if(list==null||list.size()==0)
		{
			System.out.println("û�в�ѯ������!");
		}
		else {
			System.out.println("���\t����\t�۸�\t������\t�Ƿ���\t������\t��������\t\t���Ĵ���");
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
	//����DVD
 	public void InsertDVD()
 	{
 		System.out.println("��ӭ������������!");
 		System.out.println("������DVD������:");
 		String Sname=sc.next();
 		System.out.println("������DVD�ļ۸�:");
 		Double price=sc.nextDouble();
 		System.out.println("������DVD�ĳ�����:");
 		String publish=sc.next();
 		int row=dao.Insert(Sname, price, publish);
 		if(row>=1)
 		{
 			System.out.println("�����ɹ�!");

 		}
 		else {
 			System.out.println("����ʧ��!");
 		}

 	}
	//ɾ��DVD
 	public void DeleteDVD()
 	{
 		
 		System.out.println("��ӭ����ɾ������!");
 		System.out.println("��ѡ��ɾ��ȫ��DVD���ǵ���DVD��all or single");
 		String input=sc.next();
 		if(input.equals("all"))
 		{
 			int row=dao.DeleteAllDVD();
 			if(row>=1)
 	 		{
 	 			System.out.println("����DVDɾ���ɹ�!");
 	 		}
 	 		else {
 	 			System.out.println("ɾ��ʧ��!");
 	 		}
 		}
 		else if(input.equals("single"))
 		{
 		System.out.println("������Ҫɾ����DVD��ID��");
 		int id=sc.nextInt();
 		int row=dao.Delete(id);
 		if(row>=1)
 		{
 			System.out.println("ɾ���ɹ�!");
 		}
 		else {
 			System.out.println("ɾ��ʧ��!");
 		}
 		}
 		else {
 			System.out.println("���������������������룡");
 		}
 	}
}
