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
public class ��ά��list {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Object>> table=new ArrayList<List<Object>>();
		
		List<Object> row01=new ArrayList<Object>();
		row01.add(34);
		row01.add("С����01");
		row01.add(23.6);
		row01.add("���������");
		table.add(row01);
		
		List<Object> row02=new ArrayList<Object>();
		row02.add(34);
		row02.add("С����02");
		row02.add(23.6);
		row02.add("���������");
		table.add(row02);
		
		List<Object> row03=new ArrayList<Object>();
		row03.add(34);
		row03.add("С����03");
		row03.add(23.6);
		row03.add("���������");
		table.add(row03);
		//table.size() �������           table.get(i).size() ÿһ�е�Ԫ�ظ���
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
