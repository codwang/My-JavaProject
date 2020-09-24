/**
 * 
 */
package day03;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class Demo05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			 count=num%10;
			 num/=10;
			 System.out.print(count);
		}
		sc.close();
	}

}
