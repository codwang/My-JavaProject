/**
 * 
 */
package day03;
import java.util.Scanner;
/**
 * @author 13093
 *
 */
class ѭ���ṹwhilefor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
//		int i=1;
//		100����7�ı���
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
//			//100��������ż����ż����
//			if(i%2==0)
//			{
//				sum+=i;
//				System.out.println(i);
//			}
//			i++;
//		}
//		System.out.println("ż����Ϊ��"+sum);
//		int i=0,sum=0;
//		do {
//			sum+=i;
//			i+=2;
//		}while(i<=100);
//		System.out.println("ż����Ϊ��"+sum);
//		String input;
//		do {
//			System.out.println("�жϻ��ģ�");
//			
//			System.out.println("�Ƿ������y-����");
//			input=sc.next();
//		}while(input.equals("y"));//�ж����ַ����Ƿ������.equals("")
//
//		int num;
//		do {
//			System.out.println("***�γ�����***********�γ̴���***");
//			System.out.println("***1.ʹ��Java��������߼�����*****");
//			System.out.println("***2.ʹ��HTML���Կ�����ҵվ��*****");
//			System.out.println("**3.ʹ��SQLServer����Ͳ�ѯ����***");
//			System.out.println("***4.ʹ��C#�������ݿ�Ӧ�ó���*******");
//			System.out.println("��ѡ��->");
//			num=sc.nextInt();
//			switch(num)
//			{
//			case 0:
//				System.out.println("ϵͳ���˳�");
//				break;
//			case 1:
//				System.out.println("ʹ��Java��������߼�����");
//				break;
//			case 2:
//				System.out.println("ʹ��HTML���Կ�����ҵվ��");
//				break;
//			case 3:
//				System.out.println("ʹ��SQLServer����Ͳ�ѯ����");
//				break;
//			case 4:
//				System.out.println("ʹ��C#�������ݿ�Ӧ�ó���");
//				break;
//				default:
//					System.out.println("����ѡ�񲻶�������ѡ��");
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
		System.out.println("������һ����������");
		int num=sc.nextInt();
		int i=2;
//		for(;i<num;i++)
//		{
//			if(num%i==0)
//			{
//				System.out.println("��������");
//				break;
//			}
//			else {
//				System.out.println("������");
//				break;
//			}
//		}
		//�ڱ��� �ж�����
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
			System.out.println(num+"������");
		}
		else {
			System.out.println(num+"��������");
		}
		sc.close();
	}

}
