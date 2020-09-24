/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个五位数：");
		int num=sc.nextInt();
		int gewei=num%10;
		int shiwei=(num%100)/10;
		int qianwei=(num/1000)%10;
		int wanwei=num/10000;
		if(gewei==wanwei&&qianwei==shiwei)
		{
			System.out.println("是回文数");
		}
		else {
			System.out.println("不是回文数");
		}
		sc.close();
	}

}
