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
class ��ϰ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//1.��
//		int[]a=new int[7];
//		a[0]=1;a[1]=8;a[2]=9;a[3]=12;a[4]=56;a[5]=96;
//		System.out.print("��������Ҫ��ӵ����֣�");
//		int num=sc.nextInt();
//		//�Ӻ���ǰ����
//		boolean flag=true;//�ڱ���
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
		
		
		//2.ɾ ����12    //����ڶ������顣��ɾ��֮�������copy���ڶ�������
//		int []arr=new int[] {45,85,12,3,5,6};
//		System.out.print("������Ҫɾ�����֣� ");
//		int num=sc.nextInt();
//		boolean flag=false;
//		int i=0;//��ǰ������
//		for( i=0;i<arr.length;i++)
//		{
//			if(arr[i]==num)
//			{
//				flag=true;
//				break;
//			}
//		}
//		//�ӵ�ǰλ��������
//		if(flag==true)
//		{
//		for(;i<arr.length-1;i++)
//		{
//			arr[i]=arr[i+1];
//		}
//		//�������
//		for(i=0;i<arr.length-1;i++)
//		{
//			
//			System.out.print(arr[i]+" ");
//		}
//		System.out.print("\nɾ���ɹ���");
//		}
//		else {
//		for(i=0;i<arr.length;i++)
//		{
//			
//			System.out.print(arr[i]+" ");
//		}
//		}
		//System.out.print(Arrays.toString(arr));
		//3.��
//		int []arr=new int[] {45,85,12,3,5,6};
//		
//		System.out.print("������Ҫ�ĵ�Ԫ�أ� ");
//		int num=sc.nextInt();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==num)
//			{
//				System.out.print("������ı���Ԫ�أ�");
//				arr[i]=sc.nextInt();
//			}
//		}
//		System.out.println("�޸ĳɹ�!");
//		System.out.print(Arrays.toString(arr));
			
		sc.close();
	}

}
