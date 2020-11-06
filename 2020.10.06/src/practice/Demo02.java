/**
 * 
 */
package practice;


public class Demo02 {
	/*
	 * 将一个数组中的奇数位于偶数前面
	 */
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9,12,15,17,18};
		int left = 0,right = arr.length-1;
		while(left < right) {
			while(left < right && arr[left] % 2 != 0) {
				left++;
			}
			while(left < right && arr[right] % 2 == 0) {
				right--;
			}
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
