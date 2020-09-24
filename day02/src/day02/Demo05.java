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
		System.out.println("请输入时间(0-24)");
		int time=sc.nextInt();
		
		
		if(0<=time&&time<=6)
		{
			System.out.println(time+"点是凌晨");
		}
		if(time>=7&&time<=12)
		{
			System.out.println(time+"点是上午");
		}
		if(time>=13&&time<=18)
		{
			System.out.println(time+"点是下午");
		}
		if(time>=19&&time<=24)
	    {
		System.out.println(time+"点是晚上");
		}
		sc.close();
	}

}
