/**
 * 
 */
package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author 13093
 *
 *///new ���ٿռ�
class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList();
		int input;
		do
		{
			System.out.println("*****************");
			System.out.println("*****1.��������*****");
			System.out.println("*****2.ɾ������*****");
			System.out.println("*****3.�޸�����*****");
			System.out.println("*****4.��ʾ��������***");
			System.out.println("*****5.���а�*******");
			System.out.println("*****0.�˳�ϵͳ******");
			System.out.println("��ѡ��->");
			input=sc.nextInt();
		switch(input)
		{
		case 0:
			System.out.println("��ӭ�´ι��٣�");
			break;
		case 1:
			String inputs;
			do
			{
			System.out.println("������Ҫ��ӵ����ݣ�");
			int num=sc.nextInt();
			list.add(num);
			System.out.println("�Ƿ������¼�룺y or n");
			 inputs=sc.next();
			}while(inputs.equals("y"));
			break;
		case 2:
			System.out.println("��������Ҫɾ�������ݣ�");
			int del=sc.nextInt();
			list.remove(new Integer(del));
			break;
		case 3:
			System.out.println("��������Ҫ�޸ĵ����ݣ�");
			int oldNum =sc.nextInt();
			if( list.contains(oldNum))
				{
					System.out.println("�������޸ĺ�����ݣ�");
					int index=list.indexOf(oldNum);
					int newNum=sc.nextInt();
					list.set(index, newNum);
					System.out.println("�޸���ϣ�");
				}
			else {
			System.out.println("Ҫ�޸ĵ����ݲ����ڣ�");
			}
			break;
		case 4:
			for(int i=0;i<list.size();i++)
			{
				System.out.print(list.get(i)+" ");
			}
			System.out.println("\n��ʾ��ϣ�");
			break;
		case 5:
			for(int i=0;i<list.size();i++)
			{
				for(int j=0;j<list.size()-i-1;j++)
				{
					if(list.get(j)>list.get(j+1))
					{
						int temp=list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, temp);
						
					}
				}
			}
			System.out.println("\n����ɹ���");
			//Collections.sort(list);//Ĭ������
			break;
		default:
			System.out.println("���������������������룡");
		break;
		}
		}while(input!=0);
		sc.close();
	}

}
