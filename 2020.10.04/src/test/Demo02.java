/**
 * 
 */
package test;

import java.util.Scanner;

public class Demo02 {
	static void Show() {
		System.out.println("666");
	}
	public static void main(String[] args) {
		Demo02 d = new Demo02();
		Show();
	}
	public static void main1(String[] args) {
		/*
		 *  判断一个数二进制位中含有多少个1
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int num = sc.nextInt();
		int count = 0;
		while(num>0) {
			num=num & (num-1);
			count++;
		}
		System.out.println("该数二进制位含有1的个数为:"+count);
	}
}
