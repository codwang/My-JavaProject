
package test;

import java.util.Scanner;

public class Demo01 {
	/*
	 * 5!+4!+3!+2!+1!
	 */
	public static void main(String[] args) {
	
		int num = 5;
		int sum = 0;
		while(num>0) {
			int i = 1;
			int count = 1;
			while(i <= num) {
				count *= i;
				i++;
			}
			sum += count;
			num--;
		}
		System.out.println("�׳˺�:"+sum);
	}
	/**
	 * 1-100�͡������͡�ż����
	 */
    public static void main2(String[] args) {
		int i = 0;
		int j = 0;
		int sum1=0,sum2=0,sum3=0;
		while(i <= 100) {
			if(i % 2 == 0) {
				sum1 += i;
			}
			else {
				sum2 += i;
			}
			i++;
		}
		while(j <= 100) {
			sum3 += j;
			j++;
		}
		System.out.println("1-100������:"+sum2);
		System.out.println("1-100ż����:"+sum1);
		System.out.println("1-100��:"+sum3);
	}
	/**
	 * �ж�һ�������������Ǹ���
	 **/
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����:");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("����");
		}else if(num>0){
			System.out.println("����");
		}else {
			System.out.println("�Ȳ�������Ҳ���Ǹ���");
		}
	
	}
	
}
