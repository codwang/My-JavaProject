/**
 * 
 */
package day04;

import java.util.Scanner;

/**
 * @author 13093
 *
 */
class ������� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int line=10;
		//��ά���飬����������
		int[][]yanghui=new int[line][];
		for(int i=0;i<line;i++)
		{
			yanghui[i]=new int[i+1];//��ǰ�е���Ԫ�ظ���
			//��һ��ֵ���һ��ֵΪ1
			yanghui[i][0]=1;
			yanghui[i][i]=1;
			for(int j=1;j<i;j++)
			{
				yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
			}
		}
		//����������
		for(int i=0;i<yanghui.length;i++)
		{
			for(int j=0;i<yanghui[i].length;j++)
			{
				System.out.print(yanghui[i][j]+"\t");
			}
		}
		sc.close();
	}

}
