/**
 * 
 */
package day02;
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
		System.out.println("������ʱ��(0-24)");
		int time=sc.nextInt();
		
		
		if(0<=time&&time<=6)
		{
			System.out.println(time+"�����賿");
		}
		if(time>=7&&time<=12)
		{
			System.out.println(time+"��������");
		}
		if(time>=13&&time<=18)
		{
			System.out.println(time+"��������");
		}
		if(time>=19&&time<=24)
	    {
		System.out.println(time+"��������");
		}
		sc.close();
	}

}
