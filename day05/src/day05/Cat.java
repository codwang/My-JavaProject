/**
 * 
 */
package day05;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @author 13093
 *
 */
public class Cat {

	//����
	//�������Ե����������������ڲ�����
//	public static  int sum()
//	{
//		int sum=0;
//		for(int i=0;i<10;i++)
//		{
//			sum+=i;
//		}
//		return sum;
//	
//	}
	String name;
	//�в��޷�
	public void sum(int n)
	{
		System.out.println(n);
	}
	//�޲��з�
	public String getName()
	{
		return name;
	}
	//�в��з�
	public String name(String n)
	{
		return n;
	}
	public static  void Menu()//�޲��޷�
	{
		System.out.println("*******************");
		System.out.println("******1.�����ͻ�******");
		System.out.println("******2.�����ͻ�******");
		System.out.println("******3.�����ͻ�******");
		System.out.println("******4.�����ͻ�******");
		System.out.println("******5.�����ͻ�******");
		System.out.println("******6.�����ͻ�******");
		System.out.println("*******************");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=sum();
//		System.out.println(a);
		Cat c=new Cat();
//		System.out.println(c.sum());
		c.Menu();
		
	}

}
