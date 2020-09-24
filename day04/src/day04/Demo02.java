
package day04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 13093
 *
 */
class Demo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[5];
		System.out.println("输入要排序的数组：");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//选择排序
		 for (int i = 0; i < arr.length - 1; i++) 
		 {    
	            int  min = i;
	            for (int j = i + 1; j < arr.length; j++) 
	            {
	                  if (arr[min] > arr[j]) 
	                  {
	                       min = j;
	                  }
	            }
	            if (min != i) 
	            {
	               int tmp = arr[min];
	               arr[min] = arr[i];
	               arr[i] = tmp;
	            }             
		 }
			System.out.println(Arrays.toString(arr));
			sc.close();
	}
}
