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

	public static  void Menu()//�޲��޷�
	{
		System.out.println("*******************");
		System.out.println("******�ͻ�����ϵͳ*****");
		System.out.println("******1.�����ͻ�******");
		System.out.println("******2.��ʾ�����û�***");
		System.out.println("******3.ɾ��ָ���ͻ�***");
		System.out.println("******4.�޸Ŀͻ�******");
		System.out.println("******0.�˳�ϵͳ******");
		System.out.println("*******************");
		System.out.println("��ѡ��->");
	}
	public static void main(String[] args) {
		
		List list=new ArrayList();
		//�����û�
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
			System.out.println("������ͻ���ţ�");
			int id=sc.nextInt();
			System.out.println("������ͻ�������");
			String name=sc.next();
			System.out.println("������ͻ��绰���룺");
			String phone=sc.next();
			//����һ���ͻ�
			Customer c=new Customer(id,name,phone);
			list.add(c);//�������Ŀͻ������б�
			System.out.println("�����ɹ���");
			System.out.println("�Ƿ����¼�룿y or n");
			s=sc.next();
			}while(s.equals("y"));
			 break;
		 case 2:
			 System.out.println("�ͻ����\t�ͻ�����\t�ͻ��绰");
			for(int i=0;i<list.size();i++)
			{
				Customer c1=(Customer)(list.get(i));
				System.out.println(c1.id+"\t"+c1.name+"\t"+c1.phone);
			}
		 
			System.out.println("\n��ʾ��ϣ�");
			 break;
		 case 3:
			 //ɾ���ͻ�
			 System.out.println("��������Ҫɾ���Ŀͻ���ţ�");
				int del=sc.nextInt();
				int delIndex=-1;//δ�ҵ�
				for(int i=0;i<list.size();i++)
				{
					Customer c1=(Customer)(list.get(i));
					if(c1.id==del)
					{
						delIndex=i;//��¼ɾ���ͻ����±�
						break;
					}
				}
				if(delIndex==-1)
				{
					System.out.println("δ�ҵ����Ϊ"+del+"�Ŀͻ�");
				}
				else {
					list.remove(delIndex);//�����±�ɾ��
					System.out.println("ɾ���ɹ���");
				}
			 break;
		 case 4:
			System.out.println("��������Ҫ�޸ĵĿͻ���ţ�");
			int oldid =sc.nextInt();
			int updateIndex=-1;
			for(int i=0;i<list.size();i++)
			{
				Customer c1=(Customer)(list.get(i));
			if(c1.id==oldid)
				{
				updateIndex=i;//��¼ɾ���ͻ����±�
				break;
				}
			}
			if(updateIndex==-1)
			{
				System.out.println("δ�ҵ����Ϊ"+oldid+"�Ŀͻ�");
			}
			else {
				String s1;
				String s2;
				do {
				Customer c1=(Customer)(list.get(updateIndex));	
				System.out.println("��������Ҫ�޸ĵĿͻ���ԭʼ��Ϣ:name or phone");
				s1=sc.next();
				if(s1.equals("name"));
				{
				System.out.println("������ͻ���������("+c1.name+")");
				String newname=sc.next();
				list.set(updateIndex, new Customer(oldid,newname,c1.phone));
				}
				if(s1.equals("phone"))
				{
				System.out.println("������ͻ����µ绰����("+c1.name+")");
				String newphone=sc.next();
				list.set(updateIndex, new Customer(oldid,c1.name,newphone));
				}
				System.out.println("�޸���ϣ�");
				System.out.println("�Ƿ�����޸�:y or n");
				s2=sc.next();
				}while(s2.equals("y"));
			}
		 	 break;
		 case 0:
			 System.out.println("ϵͳ���˳�");
			 break;
		 default:
			 System.out.println("���ı�������������������룡");
			 break;
		 }
		}while(input!=0);	
	}
}