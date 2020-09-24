/**
 * 
 */
package day04;

import java.util.Scanner;

/**
 * @author 13093
 *数组
 */
class 数组定义 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//1.数组声明
		//int[]arr1;
//		double[]arr2;
//		char[]arr3;
		
		//2.初始化
		//2.1动态初始化
		//arr1=new int[100];//运算符new开辟空间
//		arr1[0]=23;
//		arr1[1]=89;
		
		//2.静态初始化
//		int[]arr4=new int[] {1,5,9,6,3,4,7};
//		String[]names= {"tom","jerry","sunny"};
		
		//3.下标0-长度-1
		//names[names.length]="ford";//.length求数组长度
		///System.out.println("arr1的数组长度"+arr1.length);
		
		//4.遍历
//		int[]arr=new int[500];
//		for(int i=0;i<500;i++)
//		{
//			arr[i]=2*i+2;
//			System.out.print(" "+arr[i]+" ");
//		}
		//输入10个学生的成绩；
		int[]scores=new int[10];// {5,6,2,9,4,7,10,23,65,25};
		for(int i=0;i<10;i++)
		{
			System.out.print("请输入第"+(i+1)+"名学生的成绩：");
			scores[i]=sc.nextInt();
		}	
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10-i-1;j++)
			{
				if(scores[j]>scores[j+1])
				{
					int tmp=scores[j];
					scores[j]=scores[j+1];
					scores[j+1]=tmp;
				}
			}
		}
		double avge=0;
		for(int i=0;i<10;i++)
		{
			System.out.print(" "+scores[i]+" ");
			avge+=scores[i];
		}
		System.out.print("\n");
		System.out.println("最小成绩："+scores[0]);
		System.out.println("最大成绩： "+scores[9]);
		System.out.println("平均成绩为："+avge/scores.length);
		sc.close();
	}

}
