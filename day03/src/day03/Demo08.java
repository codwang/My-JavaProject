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
		int result=(int)(Math.random()*100);//产生随机数
		int count=0;//计数器
		int i=0;
		System.out.println("欢迎来到猜数字游戏：");
		System.out.println("系统已经随机生成一个0-99的数字，请开始猜吧！");
		for(i=1;i<=20;i++)
		{
			int input=sc.nextInt();
			if(input==result)
			{
				count=i;
				System.out.println("恭喜你猜对啦，答案是"+result+"  "+"一共猜了"+count+"次");
				if(count==1)
				{
					System.out.println("你太有才了！");
				}
				else if(count>=2&&count<=6)
				{
					System.out.println("这么快就猜出来了，很聪明么！");
				}
				else  {
					System.out.println("猜了半天才猜出来，小同志，尚需努力啊！");
				}
				break;
			}
			if(input<result)
			{
				System.out.println("太小了!");
				System.out.println("请输入您要猜的数字：");
			}
			if(input>result)
			{
				System.out.println("太大了");
				System.out.println("请输入您要猜的数字：");
				
			}
		}	
		sc.close();
	}

}
