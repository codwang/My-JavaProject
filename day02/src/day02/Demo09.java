/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class Demo09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ꡢ�¡��գ�");
		int year=sc.nextInt();
		int mon=sc.nextInt();
		int day=sc.nextInt();
		int result=0;int i=0;
		for(i=1;i<mon;i++)
		{
		if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
		{
			result+=31;
		}
		else if(i==4||i==6||i==9||i==11)
		{
			result+=30;
		}
		else
		{
			if(year%4 == 0&&year%100!=0||year%400==0&&i==2)
			{
				result+=29;
			}
				
		else  {
				result+=28;;
			  }
			
		}
		}
		result+=day;
		System.out.println("��"+year+"��ĵ�"+result+"��");
		sc.close();
	}

}
