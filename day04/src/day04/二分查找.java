/**
 * 
 */
package day04;

import java.util.Scanner;

/**
 * @author 13093
 *
 */
class 二分查找 {

	/**
	 * @param args
	 * @return 
	 * @return 
	 */
	public static int main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]a=new int[] {1,3,4,6,7,8,9,16,25,36};
		System.out.println("请输入要查找的数字：");
		int num=sc.nextInt();
		int low=0,high=a.length;
		int mid=(low+high)/2;
		//low,high查找范围
		while(low<=high)
		{
			if(num<a[mid])
			{
				high=mid-1;
			}
			else if(num>a[mid])
			{
				low=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
		//System.out.println();
	}

}
