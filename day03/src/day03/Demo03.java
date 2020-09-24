/**
 * 
 */
package day03;

import java.util.Scanner;

/**
 * @author 13093
 *
 */
class Demo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int i=0;
		int sum=0;
		for(;i<100;i++)
		{
			if(i%10!=3)
			{
				sum+=i;
			}
			
		}
		System.out.println(sum);
		sc.close();
	}

}
