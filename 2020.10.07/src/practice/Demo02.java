/**
 * 
 */
package practice;

import java.util.Scanner;

public class Demo02 {
	//找一个数组中最大值
	public static int maxValue(int []arr) {
		if(arr == null || arr.length == 0) {//标识
			return -1;
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	//求平均值
	public static double average(int []arr) {
		int sum = 0; 
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum*1.0 / arr.length;
	}
	//二分查找
	public static int binarySearch(int[]arr,int key) {
		int left = 0;
		int right = arr.length-1;
		while(left <= right) {
			int mid = (left + right)/2;
			if(arr[mid] < key) {
				left = mid + 1;
			}else if(arr[mid]>key) {
				right = mid -1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arr = {2,3,6,10,13,24,29,35,57};
//		System.out.println(maxValue(arr));
//		System.out.println(average(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的值：");
		int key = sc.nextInt();
		int ret = binarySearch(arr,key);
		System.out.println(ret);
	}
}
