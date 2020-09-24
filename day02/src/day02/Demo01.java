/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int num=sc.nextInt();
		System.out.println("百位："+num/100);
		System.out.println("十位："+(num/10)%10);
		System.out.println("个位："+num%10);
		sc.close();
		
	}

}
