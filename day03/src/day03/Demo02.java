/**
 * 
 */
package day03;

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
		Scanner sc =new Scanner(System.in);
		int i=0;//��Ϣ
		double money=10000;
		for(;i<5;i++)
		{
			money+=money*0.003;
		}
		System.out.println("����Ϊ��"+money);
		sc.close();
	}

}
