
package practice;

import java.util.Arrays;

public class test {
	public static int fib(int n) { 
	 	int f1 = 1; 
	 	int f2 = 1; 
	 	int cur = 0; 
		 for (int i = 3; i <= n; i++) { 
	 		cur = f1 + f2; 
	 		f2 = f1; 
	 		f1 = cur; 
	 } 
		 return cur; 
	}
	public static boolean isSort(int[]arr) {
		if(arr == null || arr.length == 0) {
			return false;
		}
		boolean flag = true;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void bubbleSort(int []arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length-1; i++) {
			flag = true;
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					flag = false;
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			if(flag) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		int []arr = {2,6,3,4,8,9,10,1,4,21};
		long start = System.currentTimeMillis(); //运行时间
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(Arrays.toString(arr));
		
		
		
		
//		int []arr1 = {1,3,2,4,5};
//		int []arr2 = {1,2,3,4,5};
//		System.out.println(isSort(arr1));
//		System.out.println(isSort(arr2));
		
		//System.out.println(fib(40));
//	 	int sum = 0;
//	 	for (int i = 1; i <= 5; i++) {
//	 		sum += factor(i);
//	 }
//		 System.out.println("sum = " + sum);
	}
	public static int factor(int n) {
	 	System.out.println("计算" + n + "的阶乘中!");
	 	int result = 1;
	 	for (int i = 1; i <= n; i++) {
	 		result *= i;
	 }
		 return result;
	 }

}
