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
	//查询所有DVD
public List<List<Object>> queryAllDVD()
{
		
		List<List<Object>> table=jdbc.query("select * from dvd2 ", null);
		return table;
}
//根据借阅次数从大到小排序，查询所有dvd
public List<List<Object>> queryByOrder()
{
	
	return jdbc.query("select * from dvd2 order by times",null);
}
//根据id 查询DVD
 public List<List<Object>> queryById(int id)
 {
	 List<Object> list =new ArrayList<Object>();
	 list.add(id);
	 return jdbc.query("select *from dvd2 where id=?", list);
	 
 }
//借阅
 public int borrow(int id,String name,String date)
 {
	 List<Object> list =new ArrayList<Object>();
	 list.add(name);
	 list.add(date);
	 list.add(id);
	return jdbc.update("update dvd2 set state=1,borName=?,borData=?,times=times+1 where id=?", list);
	
 }
 //归还
	public int returnDVD(int id)
	{
		List<Object> list =new ArrayList<Object>();
		list.add(id);
		return jdbc.update("update dvd2 set state=0,borName='',borData='' where id=?",list);
	}
	//新增
	public int Insert(String Sname,Double price,String publish)
	{
		List<Object> list =new ArrayList<Object>();
		list.add(Sname);
		list.add(price);
		list.add(publish);
		return  jdbc.update("insert into dvd2 values(null,?,?,?,0,'','',0)", list);	
	}
	//删除DVD
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
