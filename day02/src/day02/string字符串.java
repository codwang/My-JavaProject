/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class string×Ö·û´® {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		String name=sc.next();
//		System.out.println(2+name);
//		System.out.println((2+3.1-1)/2);
		int a=2;
		int b=a++;
		int c=++a;
		if(a==c)
		{
			System.out.println("true");
		}
		System.out.println(a+","+b+","+c);
		sc.close();
		
	}

}
