/**
 * 
 */
package com.wx.input;

import java.util.Scanner;

/**
 * @author 13093
 *1.����������
 *2.next�����ַ�����nextInt��������
 */
public class Inputdemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.���붨��һ��������
		Scanner sc=new Scanner(System.in);
		//2.�û�����
		
		//3����
		System.out.println("����������������");
		String name=sc.next();//��tab���ո�enter��������/nextLine���Լӿո�
		System.out.println("�������������䣺");
		int age =sc.nextInt();
		System.out.println("����������רҵ��");
		String profess=sc.next();
		System.out.println("���˼�����");
		System.out.println("���֣�"+name);
		System.out.println("���䣺"+age);
		System.out.println("רҵ��"+profess);
		
		System.out.println("������Բ�İ뾶��");
		int r =sc.nextInt();
		double s=r*r*3.14;
		System.out.println("Բ�������"+s);
		sc.close();
	}

}
