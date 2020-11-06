
package demo1;


public class Practice {
	int a=10;
	int b=20;
	 static void Swap(Practice x)
	{
		x.a=x.a^x.b;
		x.b=x.a^x.b;
		x.a=x.a^x.b;
	}
	public static void main(String []args)
	{
		Practice p1=new Practice();
		
		Swap(p1);
		System.out.println(p1.a);
		System.out.println(p1.b);
		
	}
}
