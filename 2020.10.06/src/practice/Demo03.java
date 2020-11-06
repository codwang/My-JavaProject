/**
 * 
 */
package practice;


import java.util.Scanner;

/*
  * 递归
  */
public class Demo03 {
	//递归求一个数的每一位
	public static void getNum(int num) {
//		if(num == 0)
//		{
//			return ;
//		}
//		getNum(num / 10);
		if(num > 9)
		{
			getNum(num / 10);
		}
		System.out.print(num % 10+" ");
	}
	//1-10的和
	public static int sum(int num) {
		if(num == 0) {
			return 0;
		}
		return num+sum(num-1);
	}
	//汉诺塔
	public static void move(char pos1,char pos2) {
		System.out.print(pos1+"->"+pos2+" ");
	}
	public static void hanota(int n,char pos1,char pos2,char pos3){
		if(n == 1) {
			move(pos1,pos3);
		}else {
			hanota(n-1,pos1,pos3,pos2);
			move(pos1,pos3);
			hanota(n-1,pos2,pos1,pos3);
			
		}
	}
	  public static int numWays(int n) {
//	         if(n==0||n==1){
//	             return 1;
//	         }
//	         return numWays(n-1)+numWays(n-2);
	        int f0=1,f1=1,f2=0;
	          if(n==0||n==1){
	            return 1;
	        }
	        for(int i=1;i<n;i++){
	            f2 = (f0 + f1) % 1000000007;
	            f0 = f1;
	            f1 = f2;
	        }
	        return f2;
	    }
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		//getNum(num);
		//System.out.println(sum(num));
//		hanota(2,'A','B','C');
//		System.out.println();
//		hanota(3,'A','B','C');
		System.out.println(numWays(44));
	}
}
