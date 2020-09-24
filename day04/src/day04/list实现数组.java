/**
 * 
 */
package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author 13093
 *
 */
class list实现数组 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList();
		int input;
		do
		{
			System.out.println("*****************");
			System.out.println("*****1.新增整数*****");
			System.out.println("*****2.删除整数*****");
			System.out.println("*****3.修改整数*****");
			System.out.println("*****4.显示所有整数***");
			System.out.println("*****5.排行榜*******");
			System.out.println("*****0.退出系统******");
			System.out.println("请选择->");
			input=sc.nextInt();
		switch(input)
		{
		case 0:
			System.out.println("欢迎下次光临！");
			break;
		case 1:
			String inputs;
			do
			{
			System.out.println("请输入要添加的数据：");
			int num=sc.nextInt();
			list.add(num);
			System.out.println("是否继续添录入：y or n");
			 inputs=sc.next();
			}while(inputs.equals("y"));
			break;
		case 2:
			System.out.println("请输入需要删除的数据：");
			int del=sc.nextInt();
			list.remove(new Integer(del));
			break;
		case 3:
			System.out.println("请输入需要修改的数据：");
			int oldNum =sc.nextInt();
			if( list.contains(oldNum))
				{
					System.out.println("请输入修改后的数据：");
					int index=list.indexOf(oldNum);
					int newNum=sc.nextInt();
					list.set(index, newNum);
				}
			
			System.out.println("修改完毕！");
			break;
		case 4:
			for(int i=0;i<list.size();i++)
			{
				System.out.print(list.get(i)+" ");
			}
			System.out.println("\n显示完毕！");
			break;
		case 5:
			for(int i=0;i<list.size();i++)
			{
				for(int j=0;j<list.size()-i-1;j++)
				{
					if(list.get(j)>list.get(j+1))
					{
						int temp=list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, temp);
						
					}
				}
			}
			System.out.println("\n排序成功！");
			//Collections.sort(list);//默认升序
			break;
		default:
			System.out.println("您的输入有误，请重新输入！");
		break;
		}
		}while(input!=0);
	}

}
