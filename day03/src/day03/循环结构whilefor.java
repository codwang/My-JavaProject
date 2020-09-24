/**
 * 
 */
package day03;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class 循环结构whilefor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
//		int i=1;
//		100以内7的倍数
//		while(i<100)
//		{
//			if(i%7==0)
//			{
//				System.out.println(i);
//			}
//			i++;
//		}
//	int i=0;
//		int sum=0;
//		while(i<=100)
//		{
//			//100以内所有偶数及偶数和
//			if(i%2==0)
//			{
//				sum+=i;
//				System.out.println(i);
//			}
//			i++;
//		}
//		System.out.println("偶数和为："+sum);
//		int i=0,sum=0;
//		do {
//			sum+=i;
//			i+=2;
//		}while(i<=100);
//		System.out.println("偶数和为："+sum);
//		String input;
//		do {
//			System.out.println("判断回文！");
//			
//			System.out.println("是否继续？y-继续");
//			input=sc.next();
//		}while(input.equals("y"));//判断两字符串是否相等用.equals("")
//
//		int num;
//		do {
//			System.out.println("***课程名称***********课程代码***");
//			System.out.println("***1.使用Java语言理解逻辑程序*****");
//			System.out.println("***2.使用HTML语言开发商业站点*****");
//			System.out.println("**3.使用SQLServer管理和查询数据***");
//			System.out.println("***4.使用C#开发数据库应用程序*******");
//			System.out.println("请选择->");
//			num=sc.nextInt();
//			switch(num)
//			{
//			case 0:
//				System.out.println("系统已退出");
//				break;
//			case 1:
//				System.out.println("使用Java语言理解逻辑程序");
//				break;
//			case 2:
//				System.out.println("使用HTML语言开发商业站点");
//				break;
//			case 3:
//				System.out.println("使用SQLServer管理和查询数据");
//				break;
//			case 4:
//				System.out.println("使用C#开发数据库应用程序");
//				break;
//				default:
//					System.out.println("您的选择不对请重新选择");
//					break;
//			}	
//		}while(num!=0);
//		int i=0;
//		int sum=0;
//		for(;i<100;i++)
//		{
//			if(i%10!=3)
//			{
//				sum+=i;
//			}
//			
//		}
//		System.out.println(sum);
		System.out.println("请输入一个正整数：");
		int num=sc.nextInt();
		int i=2;
//		for(;i<num;i++)
//		{
//			if(num%i==0)
//			{
//				System.out.println("不是质数");
//				break;
//			}
//			else {
//				System.out.println("是质数");
//				break;
//			}
//		}
		//哨兵法 判断质数
		boolean flag=true;
		for( i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println(num+"是质数");
		}
		else {
			System.out.println(num+"不是质数");
		}
		sc.close();
	}

}
