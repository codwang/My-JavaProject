/**
 * 
 */
package day03;

import java.util.Scanner;

/**
 * @author 13093
 *
 */
class Demo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����������");
		int num=sc.nextInt();
		int i=0;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("��������");
				break;
			}
			else {
				System.out.println("������");
				break;
			}
		}
		sc.close();
	}

}
