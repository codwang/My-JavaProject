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
		System.out.println("������һ����λ����");
		int num=sc.nextInt();
		System.out.println("��λ��"+num/100);
		System.out.println("ʮλ��"+(num/10)%10);
		System.out.println("��λ��"+num%10);
		sc.close();
		
	}

}
