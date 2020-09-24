/**
 * 
 */
package day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 13093
 *list 列表
 */
class 集合 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int[]users=new int[50];
		//1.定义列表
		List list=new ArrayList();//int []list=new int[n];
		
		//2.添加元素           //可以放任意类型
		list.add(1);//list[0]=1;
		list.add(56);//list[1]=56;
		list.add(89.3);
		list.add("tom");
		list.add(0,100);//按位置下标新增
		//System.out.println(list);
		
		
		//3.获取元素
		//System.out.println(list.get(1));
		
		//4.获取集合长度
		System.out.println(list.size());
		
		//5.遍历
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.print(list.get(i)+" ");
//		}
//		
		
		//6.删除元素
		//list.remove(0);//整数，通过下标来删除/其他类型，按值删除
		//System.out.println(list);
		
		//7.改  list.set(i,"");//按索引修
		//8.包含
		System.out.println(list.contains("tom"));//contains 包含有为true，没有为false
		
		//9.清除所有元素
		list.clear();
		System.out.println(list);
	}

}
