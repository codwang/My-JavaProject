
package practice;

import java.util.Arrays;

public class Demo04 {
	public static int[] show(int[]arr) {
		int []str = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			str[i] = arr[i] * 2;
		}
		return str;
	}
	public static void main(String[] args) {
		int []arr = new int[] {1,2,3,4};
		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println(Arrays.toString(show(arr)));
	}
}
