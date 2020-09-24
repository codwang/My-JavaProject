/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class Demo08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年份和月份：");
		int year=sc.nextInt();
		int mon=sc.nextInt();
			if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
			{
				System.out.println("31天");
			}
			else if(mon==4||mon==6||mon==9||mon==11)
			{
				System.out.println("30天");
			}
			else {
				if(year%4 == 0&&year%100!=0||year%400==0)
				{
					if(mon==2)
					{
						System.out.println("29天");
					}
				}
				else {
					System.out.println("28天");
			}
			}
		
	sc.close();
	}

}
