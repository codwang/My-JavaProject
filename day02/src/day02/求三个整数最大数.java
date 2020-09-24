/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class 求三个整数最大数 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入三个数：");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=sc.nextInt();
//		int max=0;
//		max=a>b?a:b;
//		max=max>c?max:c;
//		System.out.println("最大数为："+max);
//		System.out.println("请输入时间(0-24)");
//		int time=sc.nextInt();
	
//		String result1=(0<=time&&time<=6)?"凌晨":"上午";
//		
//		System.out.println(time+"点为"+result1);
	
		
//		if(0<=time&&time<=6)
//		{
//			System.out.println("现在是凌晨");
//		}
//		if(time>=7&&time<=12)
//		{
//			System.out.println("现在是上午");
//		}
//		if(time>=13&&time<=18)
//		{
//			System.out.println("现在是下午");
//		}
//		if(time>=19&&time<=24)
//		{
//			System.out.println("现在是晚上");
//		}
//		System.out.println("请输入年份");
//		int year=sc.nextInt();
//		if(year%4 == 0&&year%100!=0||year%400==0)
//		{
//		System.out.println("是闰年");
//		}
//		else {
//			System.out.println("不是闰年");
//		}
		int year=sc.nextInt();
		String str=(year%4 == 0&&year%100!=0||year%400==0)?"是闰年":"不是闰年";
		System.out.println(year+"年"+str);
		sc.close();	

	}

}
