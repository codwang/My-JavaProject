/**
 * 
 */
package day04;

import java.util.Scanner;

/**
 * @author 13093
 *����
 */
class ���鶨�� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//1.��������
		//int[]arr1;
//		double[]arr2;
//		char[]arr3;
		
		//2.��ʼ��
		//2.1��̬��ʼ��
		//arr1=new int[100];//�����new���ٿռ�
//		arr1[0]=23;
//		arr1[1]=89;
		
		//2.��̬��ʼ��
//		int[]arr4=new int[] {1,5,9,6,3,4,7};
//		String[]names= {"tom","jerry","sunny"};
		
		//3.�±�0-����-1
		//names[names.length]="ford";//.length�����鳤��
		///System.out.println("arr1�����鳤��"+arr1.length);
		
		//4.����
//		int[]arr=new int[500];
//		for(int i=0;i<500;i++)
//		{
//			arr[i]=2*i+2;
//			System.out.print(" "+arr[i]+" ");
//		}
		//����10��ѧ���ĳɼ���
		int[]scores=new int[10];// {5,6,2,9,4,7,10,23,65,25};
		for(int i=0;i<10;i++)
		{
			System.out.print("�������"+(i+1)+"��ѧ���ĳɼ���");
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
		System.out.println("��С�ɼ���"+scores[0]);
		System.out.println("���ɼ��� "+scores[9]);
		System.out.println("ƽ���ɼ�Ϊ��"+avge/scores.length);
		sc.close();
	}

}
