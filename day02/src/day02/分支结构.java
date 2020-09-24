/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 * 单分支if
 *双分支if-else
 *多分支if-else if-else
 *嵌套
 */
class 分支结构 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入年份和月份：");
//		int year=sc.nextInt();
//		int mon=sc.nextInt();
//		int day=sc.nextInt();
//		int result=0;int i=0;
//			if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
//			{
//				System.out.println("31天");
//			}
//			else if(mon==4||mon==6||mon==9||mon==11)
//			{
//				System.out.println("30天");
//			}
//			else {
//				if(year%4 == 0&&year%100!=0||year%400==0)
//				{
//					if(mon==2)
//					{
//						System.out.println("29天");
//					}
//				}
//				else {
//					System.out.println("28天");
//				}
//			}
		
//		for(i=1;i<mon;i++)
//		{
//		if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
//		{
//			result+=31;
//		}
//		else if(i==4||i==6||i==9||i==11)
//		{
//			result+=30;
//		}
//		else
//		{
//			if(year%4 == 0&&year%100!=0||year%400==0&&i==2)
//			{
//				result+=29;
//			}
//				
//		else  {
//				result+=28;;
//			  }
//			
//		}
//		}
//		result+=day;
//		System.out.println("是"+year+"年的第"+result+"天");
		System.out.println("请输入当月利润：");
		int m=sc.nextInt();
		double w=0;
		if(m<=10)
		{
			w+=m*(0.1);
		}
		else if(10<m&&m<=20)
		{
			w+=10*0.1+(m-10)*(0.075);
		}
		else if(20<m&&m<=40)
		{
			w+=10*0.1+10*0.075+(m-20)*(0.05);
		}
		else if(40<m&&m<=60)
		{
			w+=10*0.1+10*0.075+20*0.05+(m-40)*(0.03);
		}
		else if(60<m&&m<=100)
		{
			w+=10*0.1+10*0.075+20*0.05+20*0.03+(m-60)*(0.015);
		}
		else {
			w+=10*0.1+10*0.075+20*0.05+20*0.03+40*0.015+(m-100)*(0.01);
		}
		System.out.println("利润为："+w+"万");
		sc.close();
	}

}
