/**
 * 
 */
package day03;
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
		Scanner sc =new Scanner(System.in);
		int result=(int)(Math.random()*100);//���������
		int count=0;//������
		int i=0;
		System.out.println("��ӭ������������Ϸ��");
		System.out.println("ϵͳ�Ѿ��������һ��0-99�����֣��뿪ʼ�°ɣ�");
		for(i=1;i<=20;i++)
		{
			int input=sc.nextInt();
			if(input==result)
			{
				count=i;
				System.out.println("��ϲ��¶���������"+result+"  "+"һ������"+count+"��");
				if(count==1)
				{
					System.out.println("��̫�в��ˣ�");
				}
				else if(count>=2&&count<=6)
				{
					System.out.println("��ô��Ͳ³����ˣ��ܴ���ô��");
				}
				else  {
					System.out.println("���˰���Ų³�����Сͬ־������Ŭ������");
				}
				break;
			}
			if(input<result)
			{
				System.out.println("̫С��!");
				System.out.println("��������Ҫ�µ����֣�");
			}
			if(input>result)
			{
				System.out.println("̫����");
				System.out.println("��������Ҫ�µ����֣�");
				
			}
		}	
		sc.close();
	}

}
