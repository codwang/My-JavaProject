/**
 * 
 */
package day04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 13093
 *
 */
class 练习 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//1.增
//		int[]a=new int[7];
//		a[0]=1;a[1]=8;a[2]=9;a[3]=12;a[4]=56;a[5]=96;
//		System.out.print("请输入你要添加的数字：");
//		int num=sc.nextInt();
//		//从后向前遍历
//		boolean flag=true;//哨兵法
//		for(int i=a.length-2;i>=0;i--)
//		{
//			if(a[i]>a[i+1])
//			{
//				a[i+1]=a[i];
//			}
//			else {
//				a[i+1]=num;
//				flag=false;
//				break;
//			}
//		}
//		if(flag=true)
//		{
//			a[0]=num;
//		}
//		System.out.print(Arrays.toString(a));
		
		
//		for(int i=0;i<a.length;i++) 
//		{
//			if(a[i]==0)
//			{
//				a[i]=num;
//			}
//			//System.out.print(a[i]+" ");
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length-i-1;j++)
//			{
//				if(a[j]>a[j+1])
//				{
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//		for(int i=0;i<a.length;i++) 
//		{
//			System.out.print(a[i]+" ");
//		}
		
		
		//2.删 比如12    //定义第二个数组。把删除之后的数组copy到第二个数组
//		int []arr=new int[] {45,85,12,3,5,6};
//		System.out.print("请输入要删的数字： ");
//		int num=sc.nextInt();
//		boolean flag=false;
//		int i=0;//从前向后遍历
//		for( i=0;i<arr.length;i++)
//		{
//			if(arr[i]==num)
//			{
//				flag=true;
//				break;
//			}
//		}
//		//从当前位置向后遍历
//		if(flag==true)
//		{
//		for(;i<arr.length-1;i++)
//		{
//			arr[i]=arr[i+1];
//		}
//		//输出数组
//		for(i=0;i<arr.length-1;i++)
//		{
//			
//			System.out.print(arr[i]+" ");
//		}
//		System.out.print("\n删除成功！");
//		}
//		else {
//		for(i=0;i<arr.length;i++)
//		{
//			
//			System.out.print(arr[i]+" ");
//		}
//		}
		//System.out.print(Arrays.toString(arr));
		//3.改
//		int []arr=new int[] {45,85,12,3,5,6};
//		
//		System.out.print("请输入要改的元素： ");
//		int num=sc.nextInt();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==num)
//			{
//				System.out.print("请输入改变后的元素：");
//				arr[i]=sc.nextInt();
//			}
//		}
//		System.out.println("修改成功!");
//		System.out.print(Arrays.toString(arr));
			
		sc.close();
	}

}
