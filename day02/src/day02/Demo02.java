/**
 * 
 */
package day02;

import java.util.Scanner;

/**
 * @author 13093
 *
 */
class Demo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入任意毫秒数：");
		int ms=sc.nextInt();
		int hm=ms%1000;
		int mins=ms%(1000*60*60)/(1000*60);
		int sends=ms%(1000*60)/1000;
		int hour=ms%(1000*60*60*24)/(1000*60*60);
		int day=ms/(1000*60*60*24);
		System.out.println(day+"天");
		System.out.println(hour+"时");
		System.out.println(mins+"分");
		System.out.println(sends+"秒");
		System.out.println(hm+"毫秒");
		sc.close();
	}

}
