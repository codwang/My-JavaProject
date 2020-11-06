
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
		System.out.println("阶乘和:"+sum);
	}
	/**
	 * 1-100和、奇数和、偶数和
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
		System.out.println("1-100奇数和:"+sum2);
		System.out.println("1-100偶数和:"+sum1);
		System.out.println("1-100和:"+sum3);
	}
	/**
	 * 判断一个数是正数还是负数
	 **/
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("负数");
		}else if(num>0){
			System.out.println("正数");
		}else {
			System.out.println("既不是正数也不是负数");
		}
	
	}
	
}
