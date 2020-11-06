/**
 * 
 */
package practice;

import java.util.Arrays;

public class Demo03 {
	 public static int fib(int n) {
	        if(n==1||n==2){
	            return 1;
	        }
	        int f1 = 1;
	        int f2 = 1;
	        int f3 = 0;
	        for(int i=2;i<n;i++){
	            f3 = f1 + f2;
	            f2 = f1;
	            f1 = f3;
	        }
	        return f3;
	    }
	 /**
	  * 
	  * @param x 模拟实现pow(x,n) x的n次方
	  * @param n
	  * @return
	  */
	 public static double myPow(double x,int n) {
		 if(x==0 && n==0) {
			 return 0;
		 } 
//		 if(x==1) {
//			 return 1;
//		 }
		 double ret = 1.0;
		 long t = n;
		 if(t < 0) {
			 t  = -t ;
		 } 
		 for (long i = t; i > 0; i=i>>1) {
			 if(i%2==1) {
				 ret *= x;
			 }
				x *= x;
			 
		}
		 if(n>0) {
			 return ret;
		 }else {
			 return 1/ret;
		 }
		
	 }
	 public static void show(int []arr) {
		 for (int i : arr) {
			System.out.println(i+" ");
		}
	 }
	 public static void printArray(int[] arr) {  //打印这个数组
			for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i]+" "); 
			} 
		}
	 public static int[] transform(int[] arr) { 
			int[] ret = new int[arr.length];
			for (int i = 0; i < arr.length; i++) { 
				ret[i] = arr[i] * 2; 
			} 
			return ret;
		} 
	 public static String toString(int[] arr) { 
			String ret = "["; 
			for (int i = 0; i < arr.length; i++) { 
				// 借助 String += 进行拼接字符串 
				ret += arr[i]; 
				// 除了最后一个元素之外, 其他元素后面都要加上 ", " 
				if (i != arr.length - 1) { 
					ret += ", "; 
				} 
			}
			ret += "]"; 
			return ret; 
		}
	 public static void main(String[] args) {
		//System.out.println(fib(2));
		 //System.out.println(myPow(1,25672721));
		 int []arr = {1,2,3};
			//int[] ret = transform(arr); 
			//printArray(ret); 
		 System.out.println(Arrays.toString(arr));
			System.out.println(toString(arr));
			//printArray(arr);
			
	}
}
