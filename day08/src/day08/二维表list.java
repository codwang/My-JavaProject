/**
 * 
 */
package day08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 13093
 *
 */
public class 二维表list {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Object>> table=new ArrayList<List<Object>>();
		
		List<Object> row01=new ArrayList<Object>();
		row01.add(34);
		row01.add("小王子01");
		row01.add(23.6);
		row01.add("人民出版社");
		table.add(row01);
		
		List<Object> row02=new ArrayList<Object>();
		row02.add(34);
		row02.add("小王子02");
		row02.add(23.6);
		row02.add("人民出版社");
		table.add(row02);
		
		List<Object> row03=new ArrayList<Object>();
		row03.add(34);
		row03.add("小王子03");
		row03.add(23.6);
		row03.add("人民出版社");
		table.add(row03);
		//table.size() 表的行数           table.get(i).size() 每一行的元素个数
		//table.get(0).get(0)==table[0][0];
		for(int i=0;i<table.size();i++)
		{
			for(int j=0;j<table.get(i).size();j++)
			{
				System.out.print(table.get(i).get(j)+"\t");
			}
			System.out.println();
		}
		
	}

}
