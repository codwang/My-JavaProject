/**
 * 
 */
package day02;
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
		System.out.println("���������");
		int year=sc.nextInt();
		if(year%4 == 0&&year%100!=0||year%400==0)
		{
		System.out.println("����366��");
		}
		else {
			System.out.println("ƽ��365��");
		}
	sc.close();
	}

}
