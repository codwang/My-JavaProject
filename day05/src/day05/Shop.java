/**
 * 
 */
package day05;

/**
 * @author 13093
 *
 */
public class Shop {
	//@SuppressWarnings("unused")
	private int snum;
	private String sname;
	private String sdes;//��Ʒ����
	private int sprice;//��Ʒ�۸�
	public static void shop1()
	{
		
		Shop s1=new Shop();//��һ����Ʒ
		s1.snum=01;
		s1.sname="���Ϲ���â";
		s1.sdes="�����ز�";
		s1.sprice=50;
		System.out.print(s1.snum+" ");
		System.out.print(s1.sname+" ");
		System.out.print(s1.sdes+" ");
		System.out.print(s1.sprice+" ");
		System.out.print(" \n");
	}
	public static void shop2()
	{
		Shop s2=new Shop();//�ڶ�����Ʒ
		s2.snum=02;
		s2.sname="�Ϳ�Z2020";
		s2.sdes="�Ϳ�";
		s2.sprice=1000;
		System.out.print(s2.snum+" ");
		System.out.print(s2.sname+" ");
		System.out.print(s2.sdes+" ");
		System.out.print(s2.sprice+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shop1();
		shop2();
	
		
	
	}

}
