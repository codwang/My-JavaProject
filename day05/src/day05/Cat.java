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

	//属性
	//方法可以调方法，但不能在内部定义
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
	//有参无返
	public void sum(int n)
	{
		System.out.println(n);
	}
	//无参有返
	public String getName()
	{
		return name;
	}
	//有参有返
	public String name(String n)
	{
		return n;
	}
	public static  void Menu()//无参无返
	{
		System.out.println("*******************");
		System.out.println("******1.新增客户******");
		System.out.println("******2.新增客户******");
		System.out.println("******3.新增客户******");
		System.out.println("******4.新增客户******");
		System.out.println("******5.新增客户******");
		System.out.println("******6.新增客户******");
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
