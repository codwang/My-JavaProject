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
	private String sdes;//商品描述
	private int sprice;//商品价格
	public static void shop1()
	{
		
		Shop s1=new Shop();//第一个商品
		s1.snum=01;
		s1.sname="海南贵妃芒";
		s1.sdes="海南特产";
		s1.sprice=50;
		System.out.print(s1.snum+" ");
		System.out.print(s1.sname+" ");
		System.out.print(s1.sdes+" ");
		System.out.print(s1.sprice+" ");
		System.out.print(" \n");
	}
	public static void shop2()
	{
		Shop s2=new Shop();//第二个商品
		s2.snum=02;
		s2.sname="耐克Z2020";
		s2.sdes="耐克";
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
