/**
 * 
 */
package day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 13093
 *list �б�
 */
class ���� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int[]users=new int[50];
		//1.�����б�
		List list=new ArrayList();//int []list=new int[n];
		
		//2.���Ԫ��           //���Է���������
		list.add(1);//list[0]=1;
		list.add(56);//list[1]=56;
		list.add(89.3);
		list.add("tom");
		list.add(0,100);//��λ���±�����
		//System.out.println(list);
		
		
		//3.��ȡԪ��
		//System.out.println(list.get(1));
		
		//4.��ȡ���ϳ���
		System.out.println(list.size());
		
		//5.����
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.print(list.get(i)+" ");
//		}
//		
		
		//6.ɾ��Ԫ��
		//list.remove(0);//������ͨ���±���ɾ��/�������ͣ���ֵɾ��
		//System.out.println(list);
		
		//7.��  list.set(i,"");//��������
		//8.����
		System.out.println(list.contains("tom"));//contains ������Ϊtrue��û��Ϊfalse
		
		//9.�������Ԫ��
		list.clear();
		System.out.println(list);
	}

}
