/**
 * 
 */
package com.wx.input;

import java.util.Scanner;

/**
 * @author 13093
 *1.定义输入类
 *2.next输入字符串，nextInt输入整数
 */
public class Inputdemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.必须定义一个输入类
		Scanner sc=new Scanner(System.in);
		//2.用户输入
		
		//3测试
		System.out.println("请输入您的姓名：");
		String name=sc.next();//以tab，空格，enter结束输入/nextLine可以加空格
		System.out.println("请输入您的年龄：");
		int age =sc.nextInt();
		System.out.println("请输入您的专业：");
		String profess=sc.next();
		System.out.println("个人简历：");
		System.out.println("名字："+name);
		System.out.println("年龄："+age);
		System.out.println("专业："+profess);
		
		System.out.println("请输入圆的半径：");
		int r =sc.nextInt();
		double s=r*r*3.14;
		System.out.println("圆的面积："+s);
		sc.close();
	}

}
