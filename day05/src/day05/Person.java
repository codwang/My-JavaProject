/**
 * 
 */
package day05;
import java.util.Scanner;
/**
 * @author 13093
 */
	//属性(特征)
	//方法(行为，功能)
	//全局变量(成员变量、成员属性),局部变量没有默认值
	//默认值不同：全局变量有默认值(整数0，小数0.0，char0，boolean-false，String-null)
 
public class Person {
	 String name;
	 int age;
	String sex;
	public void study()
	{
		System.out.println(name+" studying..");
	}
	public void showAge()
	{
		System.out.println(age+"岁");
	}
	public int addAge(int n)
	{
		n+=2;
		return n;
	}
	public Person()//构造方法
	//方法名必须和类名相同
	//没有返回值，无void
	//只有在new的时候调用      作用：给属性初始化
	//系统默认提供无参构造方法，一旦实现，系统不提供无参构造方法
	{
		System.out.println("构造方法");
	}
	public Person(String name1,int age,String sex)
	{
		//有参构造方法
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		System.out.println("请输入第一个信息：");
		p1.name=sc.next();//"zhangsan";
		System.out.println("请输入第二个信息：");
		p2.name=sc.next();//"lisi";
		p1.age=18;
		int a=p1.age;
		p2.age=16;
		p1.study();
		p1.showAge();
		System.out.println(p1.addAge(a)+"岁");
		p2.study();
		p2.showAge();
		//方法重载
		//方法名一样，参数个数，类型不一样
		//构造方法
	
	}

}


