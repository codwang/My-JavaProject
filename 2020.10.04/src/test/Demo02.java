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
		 *  �ж�һ����������λ�к��ж��ٸ�1
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����:");
		int num = sc.nextInt();
		int count = 0;
		while(num>0) {
			num=num & (num-1);
			count++;
		}
		System.out.println("����������λ����1�ĸ���Ϊ:"+count);
	}
}
