/**
 * 
 */
package test;

import java.util.Scanner;

class student
{
	public String sex; //公有成员
	public int age;
	public String name;
	final int b=10;
	static int no=1; //定义静态变量
	static int Add(int a,int b)//定义静态方法
	{
		return a+b;
	}
	private int ID;//私有类成员
	public student(String sex, int age, String name) //构造方法
	{
		super();//在子类中访问父类被覆盖的成员
		this.sex = sex;
		this.age = age;
		this.name = name;
	}
	public student()
	{
		this.sex = "man";
		this.age = 18;
		this.name = "wang";
	}
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		}

	@Override
	public String toString() {
		return "student [sex=" + sex + ", age=" + age + ", name=" + name + "]";
	}
	
}

public class test {
	   public static void main(String []args)
	   {
		
//		   student s1=new student();
//		   s1.age=12;
//		   s1.name="zhang";
//		   s1.sex="man";
//		   System.out.println(s1.name);
//		   System.out.println(s1.age);
//		   System.out.println(s1.sex);
//		   System.out.println(s1);
//		   System.out.println(s1.sum(10, 20));
		  // student s2=new student();
//		   System.out.println(s2);
//		   System.out.println(s2.sum(10, 20));
//		   System.out.println(s2.sum(10,20,30));
//			student s3=new student("man",16,"lisi");
//			student s4=new student();
//			 System.out.println(s3);
//			 System.out.println(s4);
//			student s5=new student();
//			System.out.println(s4.equals(s5));
//			 System.out.println(student.no);
//			 System.out.println(student.Add(5, 6));
			// student s6=new student();
//			 s6.setAge(12);
//			 s6.setSex("man");
//			 s6.setName("wang");
//			 System.out.println(s6.getAge());
//			 System.out.println(s6.getName());
//			 System.out.println(s6.getSex());
//			Scanner sc= new Scanner(System.in);
//			int a=sc.nextInt();
//			 System.out.println(a);
//			 System.out.println(s6.b);
			 
	}
	   
}
