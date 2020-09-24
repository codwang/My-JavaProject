/**
 * 
 */
package day04;

import java.util.Scanner;

/**
 * @author 13093
 *
 */
class 杨辉三角 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int line=10;
		//二维数组，存放杨辉三角
		int[][]yanghui=new int[line][];
		for(int i=0;i<line;i++)
		{
			yanghui[i]=new int[i+1];//当前行的总元素个数
			//第一个值最后一个值为1
			yanghui[i][0]=1;
			yanghui[i][i]=1;
			for(int j=1;j<i;j++)
			{
				yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
			}
		}
		//输出杨辉三角
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
