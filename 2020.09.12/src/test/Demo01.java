/**
 * 
 */
package test;

import java.util.Random;

class Demo01 {
	public static void main(String []args)
	{
		int arr[]=new int[108];
		int player[][]=new int[4][25];
		int leftnum=108;//��ǰʣ���Ƶ�����
		Random random=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(i+1)%54;
			if(arr[i]==0)
			{
				arr[i]=54;
			}
		}
		for(int i=0;i<25;i++)
		{
			for(int j=0;j<player.length;j++)
			{
			 int index=random.nextInt(leftnum);
			 	player[j][i]=arr[index];
			 	arr[index]=arr[leftnum-1];
			 	leftnum--;	
			}
		}
		for(int i=0;i<player.length;i++)
		{
			System.out.println("���"+(i+1)+"����:");
			for(int j=0;j<player[i].length;j++)
			{
				System.out.print(player[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("����");
		for(int i=0;i<8;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
