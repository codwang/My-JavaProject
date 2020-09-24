/**
 * 
 */
package day02;
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
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要交换的两个整数：");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("交换前：num1="+num1+" " +"num2="+num2);
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("交换后：num1="+num1+" " +"num2="+num2);
		sc.close();
	}

}
