/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class ��������������� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("��������������");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=sc.nextInt();
//		int max=0;
//		max=a>b?a:b;
//		max=max>c?max:c;
//		System.out.println("�����Ϊ��"+max);
//		System.out.println("������ʱ��(0-24)");
//		int time=sc.nextInt();
	
//		String result1=(0<=time&&time<=6)?"�賿":"����";
//		
//		System.out.println(time+"��Ϊ"+result1);
	
		
//		if(0<=time&&time<=6)
//		{
//			System.out.println("�������賿");
//		}
//		if(time>=7&&time<=12)
//		{
//			System.out.println("����������");
//		}
//		if(time>=13&&time<=18)
//		{
//			System.out.println("����������");
//		}
//		if(time>=19&&time<=24)
//		{
//			System.out.println("����������");
//		}
//		System.out.println("���������");
//		int year=sc.nextInt();
//		if(year%4 == 0&&year%100!=0||year%400==0)
//		{
//		System.out.println("������");
//		}
//		else {
//			System.out.println("��������");
//		}
		int year=sc.nextInt();
		String str=(year%4 == 0&&year%100!=0||year%400==0)?"������":"��������";
		System.out.println(year+"��"+str);
		sc.close();	

	}

}
