/**
 * 
 */
package day05;
import java.util.Scanner;
/**
 * @author 13093
 */
	//����(����)
	//����(��Ϊ������)
	//ȫ�ֱ���(��Ա��������Ա����),�ֲ�����û��Ĭ��ֵ
	//Ĭ��ֵ��ͬ��ȫ�ֱ�����Ĭ��ֵ(����0��С��0.0��char0��boolean-false��String-null)
 
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
		System.out.println(age+"��");
	}
	public int addAge(int n)
	{
		n+=2;
		return n;
	}
	public Person()//���췽��
	//�����������������ͬ
	//û�з���ֵ����void
	//ֻ����new��ʱ�����      ���ã������Գ�ʼ��
	//ϵͳĬ���ṩ�޲ι��췽����һ��ʵ�֣�ϵͳ���ṩ�޲ι��췽��
	{
		System.out.println("���췽��");
	}
	public Person(String name1,int age,String sex)
	{
		//�вι��췽��
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		System.out.println("�������һ����Ϣ��");
		p1.name=sc.next();//"zhangsan";
		System.out.println("������ڶ�����Ϣ��");
		p2.name=sc.next();//"lisi";
		p1.age=18;
		int a=p1.age;
		p2.age=16;
		p1.study();
		p1.showAge();
		System.out.println(p1.addAge(a)+"��");
		p2.study();
		p2.showAge();
		//��������
		//������һ�����������������Ͳ�һ��
		//���췽��
	
	}

}


