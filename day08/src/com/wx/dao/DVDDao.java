/**
 * 
 */
package com.wx.dao;

import java.util.ArrayList;
import java.util.List;
import com.wx.util.JDBCUtil;

/**
 
 *
 */
public class DVDDao {
	JDBCUtil jdbc =new JDBCUtil();
	//��ѯ����DVD
public List<List<Object>> queryAllDVD()
{
		
		List<List<Object>> table=jdbc.query("select * from dvd2 ", null);
		return table;
}
//���ݽ��Ĵ����Ӵ�С���򣬲�ѯ����dvd
public List<List<Object>> queryByOrder()
{
	
	return jdbc.query("select * from dvd2 order by times",null);
}
//����id ��ѯDVD
 public List<List<Object>> queryById(int id)
 {
	 List<Object> list =new ArrayList<Object>();
	 list.add(id);
	 return jdbc.query("select *from dvd2 where id=?", list);
	 
 }
//����
 public int borrow(int id,String name,String date)
 {
	 List<Object> list =new ArrayList<Object>();
	 list.add(name);
	 list.add(date);
	 list.add(id);
	return jdbc.update("update dvd2 set state=1,borName=?,borData=?,times=times+1 where id=?", list);
	
 }
 //�黹
	public int returnDVD(int id)
	{
		List<Object> list =new ArrayList<Object>();
		list.add(id);
		return jdbc.update("update dvd2 set state=0,borName='',borData='' where id=?",list);
	}
	//����
	public int Insert(String Sname,Double price,String publish)
	{
		List<Object> list =new ArrayList<Object>();
		list.add(Sname);
		list.add(price);
		list.add(publish);
		return  jdbc.update("insert into dvd2 values(null,?,?,?,0,'','',0)", list);	
	}
	//ɾ��DVD
	public int Delete(int id)
	{
		List<Object> list =new ArrayList<Object>();
		list.add(id);
		return jdbc.update("delete from dvd2 where id=?", list);
	
	}
	public int DeleteAllDVD()
	{
		return jdbc.update("delete from dvd2", null);
	}
}
