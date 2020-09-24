/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class Demo10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个不多于五位的正整数：");
		int num=sc.nextInt();
		int gewei=num%10;
		int shiwei=(num%100)/10;
		int baiwei=(num/100)%10;
		int qianwei=(num/1000)%10;
		int wanwei=num/10000;
		if(num/10000>0)
		{
			System.out.println("是五位数");
			System.out.println(gewei+","+shiwei+","+baiwei+","+qianwei+","+wanwei);
		}
		else if(num/1000>0&&num/10000==0)
		{
			System.out.println("是四位数");
			System.out.println(gewei+","+shiwei+","+baiwei+","+qianwei);
		}
		else if(num/100>0&&num/1000==0)
		{
			System.out.println("是三位数");
			System.out.println(gewei+","+shiwei+","+baiwei);
			
		}
		else if(num/10>0&&num/100==0)
		{
			System.out.println("是两位数");
			
			System.out.println(gewei+","+shiwei);
		}
		else {
			System.out.println("是个位数");
			System.out.println(gewei);
		}
	
			sc.close();
		
	}

}
