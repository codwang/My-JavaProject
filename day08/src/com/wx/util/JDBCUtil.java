/**
 * 
 */
package com.wx.util;
//    工具类 增删改的封装，查的封装
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtil {

	//实现增删改功能 封装：参数sql，列表  返回值int 影响的行数
	public int update(String sql,List<Object> list)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			PreparedStatement ps=conn.prepareStatement(sql);
			if(list!=null)
			{
				//说明有？号
				for(int i=0;i<list.size();i++)
				{
					ps.setObject(i+1, list.get(i));
				}
			}
			int row=ps.executeUpdate();//row 影响的行数
			ps.close();
			conn.close();
			return row;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}
	//实现查的封装：参数：sql，列表。返回值：List<List<Object>> 二维列表(数组)
	public List<List<Object>> query(String sql,List<Object> list)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			PreparedStatement ps=conn.prepareStatement(sql);
			
			if(list!=null)
			{
				//说明有？号
				for(int i=0;i<list.size();i++)
				{
					ps.setObject(i+1, list.get(i));
				}
			}
			//二维数组，一张表格
			ResultSet rs =ps.executeQuery();
			List<List<Object>>table=new ArrayList<List<Object>>();
			while(rs.next())
			{
				//定义一维数组，一行
				List<Object>row =new ArrayList<Object>();
				//获取结果集中列的个数
				int ColumnCount	=rs.getMetaData().getColumnCount();
				for(int i=1;i<=ColumnCount;i++)//将一行填充完成 ，执行次数为列数
				{
					row.add(rs.getObject(i));
				}
				//将当前行放入表格
				table.add(row);
			}
			
        	ps.close();
			conn.close();
			return table;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}

}
