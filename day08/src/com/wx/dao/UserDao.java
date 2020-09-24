
package com.wx.dao;
import java.util.ArrayList;
import java.util.List;
import com.wx.util.JDBCUtil;

public class UserDao {
//登录功能 参数：用户名和密码。返回值：查询的二维数组
	public List<List<Object>> login(String name,String password)
	{
		JDBCUtil jdbc=new JDBCUtil();
		List<Object> list=new ArrayList<Object>();
		list.add(name);
		list.add(password);
		List<List<Object>> query=jdbc.query("select * from user where name=? and password=?", list);
		return query;
	}
	

}
