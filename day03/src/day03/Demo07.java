/**
 * 
 */
package day03;

import java.util.Scanner;

/**
 * @author 13093
 *
 */
class Demo07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int i=0;
		for(i=101;i<999;i++)
		{
			//输出100-999之间的水仙花数
			int gewei=i%10;
			int shiwei=(i/10)%10;
			int baiwei=i/100;
			if((gewei*gewei*gewei)+(shiwei*shiwei*shiwei)+(baiwei*baiwei*baiwei)==i)
			{
				System.out.print(i+" ");
			}
		
		}
		sc.close();
	}

}
