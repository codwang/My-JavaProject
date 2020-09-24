/**
 * 
 */
package day02;
import java.util.Scanner;
/**
 * @author 13093
 *switch-case
 */
class 分支结构switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入本月利润：");
		int lirun=sc.nextInt();
		double w=0;
		switch(lirun/10)
		{
	default:
	    w+=(lirun-100)*0.01;lirun=100;
		case 9:
		case 8:
		case 7:
		case 6:
		   w+=(lirun-60)*0.015;lirun=60;
		case 5:
		case 4:
			w+=(lirun-40)*0.03;lirun=40;
		case 3:
		case 2:		
			w+=(lirun-20)*0.05;lirun=20;
		case 1:
		    w+=(lirun-10)*0.075;lirun=10;
		case 0:
			w+=lirun*0.1;
			break;
		}
		System.out.println("利润为："+w);
		sc.close();
	}

}
