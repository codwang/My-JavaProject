
package practice;

import java.util.Arrays;

public class Demo01 {
	/**
	 * 
	 * @param 模拟实现toString 方法
	 * @return
	 */
	public static String myString(int []arr) {
		if(arr == null) {
			return null;
		}
		if(arr.length == 0) {
			return "[]";
		}
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				str += arr[i]+"]";
				break;
			}
			str += arr[i] + ", ";
		}
		return str;
	}
	/**
	 * 数组拷贝
	 * 1.native：说明此方法是一个本地方法
	 * 2.src：源数组   srcPos: 从源数组的pos位置开始拷贝
	 *   dest：拷贝到目的数组 destPos：拷贝到目的数组的pos位置
	 *   length： 拷贝长度
	 * 3.arraycopy 拷贝速度最快     
	 * @param args
	 */
	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		//int []dest = new int[arr.length];
		
		//本地方法
		//System.arraycopy(arr, 0, dest, 0, arr.length);
		//System.out.println(Arrays.toString(arr));
		
		
		//int []dest = Arrays.copyOf(arr, arr.length);
		
		int []dest = arr.clone();
		System.out.println(Arrays.toString(dest));
		//System.out.println(myString(arr));
	
		
	}
}
