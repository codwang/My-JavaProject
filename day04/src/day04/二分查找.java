/**
 * 
 */
package day04;

import java.util.Scanner;

/**
 * @author 13093
 *
 */
class ���ֲ��� {

	/**
	 * @param args
	 * @return 
	 * @return 
	 */
	public static int main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]a=new int[] {1,3,4,6,7,8,9,16,25,36};
		System.out.println("������Ҫ���ҵ����֣�");
		int num=sc.nextInt();
		int low=0,high=a.length;
		int mid=(low+high)/2;
		//low,high���ҷ�Χ
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
