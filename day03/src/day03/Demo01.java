/**
 * 
 */
package day03;

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
		int num;
		do {
			System.out.println("***课程名称***********课程代码***");
			System.out.println("***1.使用Java语言理解逻辑程序*****");
			System.out.println("***2.使用HTML语言开发商业站点*****");
			System.out.println("**3.使用SQLServer管理和查询数据***");
			System.out.println("***4.使用C#开发数据库应用程序*******");
			System.out.println("请选择->");
			num=sc.nextInt();
			switch(num)
			{
			case 0:
				System.out.println("系统已退出");
				break;
			case 1:
				System.out.println("使用Java语言理解逻辑程序");
				break;
			case 2:
				System.out.println("使用HTML语言开发商业站点");
				break;
			case 3:
				System.out.println("使用SQLServer管理和查询数据");
				break;
			case 4:
				System.out.println("使用C#开发数据库应用程序");
				break;
				default:
					System.out.println("您的选择不对请重新选择");
					break;
			}	
		}while(num!=0);
		sc.close();
	}

}
