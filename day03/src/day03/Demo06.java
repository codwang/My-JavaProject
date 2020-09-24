/**
 * 
 */
package day03;

import java.util.Scanner;

/**
 * @author 13093
 *
 */
class Demo06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
		int j=0;//´òÓ¡½ð×ÖËþ
		for(i=0;i<5;i++)
		{
			for(j=0;j<4-i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
