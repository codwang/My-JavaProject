/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class Swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入任意毫秒数：");
//		int ms=sc.nextInt();
//		int hm=ms%1000;
//		int miao=(ms/1000)%60;
//		int fen=(ms/1000/60)%60;
//		int shi=(ms/1000/60/60)%60;
//		int day=(ms/1000/60/60)/24;
//		System.out.println(day+"天");
//		System.out.println(shi+"时");
//		System.out.println(fen+"分");
//		System.out.println(miao+"秒");
//		System.out.println(hm+"毫秒");
		System.out.println("请输入要交换的两个整数：");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("交换前：num1="+num1+" " +"num2="+num2);
		int temp=0;
		temp=num1;//用加减法
		num1=num2;//用按位异或法
		num2=temp;
		System.out.println("交换后：num1="+num1+" " +"num2="+num2);
		sc.close();
	}

}
