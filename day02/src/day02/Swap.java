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
//		System.out.println("�����������������");
//		int ms=sc.nextInt();
//		int hm=ms%1000;
//		int miao=(ms/1000)%60;
//		int fen=(ms/1000/60)%60;
//		int shi=(ms/1000/60/60)%60;
//		int day=(ms/1000/60/60)/24;
//		System.out.println(day+"��");
//		System.out.println(shi+"ʱ");
//		System.out.println(fen+"��");
//		System.out.println(miao+"��");
//		System.out.println(hm+"����");
		System.out.println("������Ҫ����������������");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("����ǰ��num1="+num1+" " +"num2="+num2);
		int temp=0;
		temp=num1;//�üӼ���
		num1=num2;//�ð�λ���
		num2=temp;
		System.out.println("������num1="+num1+" " +"num2="+num2);
		sc.close();
	}

}
