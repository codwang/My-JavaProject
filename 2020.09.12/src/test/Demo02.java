/**
 * 
 */
package test;

import java.util.Scanner;
import day01.HelloWorld;
import day01.People;
class Student
{
	int no;
	String name;
	Birthday day;
	Student(int _no,String _name)
	{
		no=_no;
		name=_name;
	}
}
class Birthday
{
	static int year;
	int month;
	int date;
}
class OverLoad
{
	public int ADD(int x,int y)
	{
		return x+y;
	}
	public int ADD(int x,int y,int z)
	{
		return x+y+z;
	}
}
public class Demo02 {
	public static void main(String []args)
	{
//		Student s1=new Student(3, "lisi");
//		Student s2=new Student(0, null);
//		s1.no=1;s2.no=2;
//		s1.name="wang";s2.name="zhang";
//		System.out.println("no:"+s1.no+" name:"+s1.name);
//		System.out.println("no:"+s2.no+" name:"+s2.name);
//		Birthday b=new Birthday();
//		Birthday.year=10;
//		
//		s.no=2;
//		System.out.println(s.no);
//		OverLoad o=new OverLoad();
//		System.out.println(o.ADD(2, 3));
//		System.out.println(o.ADD(2, 3, 4));
//		Scanner sc=new Scanner(System.in);
//		System.out.println("«Î ‰»Îaµƒ÷µ:");
//		int a=sc.nextInt();
//		System.out.println(a);
//		HelloWorld h=new HelloWorld();
//		h.main(args);
		People p=new People();
		System.out.println(p.ADD(12));
		p.print();
	}
}
