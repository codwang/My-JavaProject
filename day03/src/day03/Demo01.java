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
			System.out.println("***�γ�����***********�γ̴���***");
			System.out.println("***1.ʹ��Java��������߼�����*****");
			System.out.println("***2.ʹ��HTML���Կ�����ҵվ��*****");
			System.out.println("**3.ʹ��SQLServer����Ͳ�ѯ����***");
			System.out.println("***4.ʹ��C#�������ݿ�Ӧ�ó���*******");
			System.out.println("��ѡ��->");
			num=sc.nextInt();
			switch(num)
			{
			case 0:
				System.out.println("ϵͳ���˳�");
				break;
			case 1:
				System.out.println("ʹ��Java��������߼�����");
				break;
			case 2:
				System.out.println("ʹ��HTML���Կ�����ҵվ��");
				break;
			case 3:
				System.out.println("ʹ��SQLServer����Ͳ�ѯ����");
				break;
			case 4:
				System.out.println("ʹ��C#�������ݿ�Ӧ�ó���");
				break;
				default:
					System.out.println("����ѡ�񲻶�������ѡ��");
					break;
			}	
		}while(num!=0);
		sc.close();
	}

}
