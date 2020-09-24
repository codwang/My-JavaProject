/**
 * 
 */
package com.wx.util;
//    ������ ��ɾ�ĵķ�װ����ķ�װ
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtil {

	//ʵ����ɾ�Ĺ��� ��װ������sql���б�  ����ֵint Ӱ�������
	public int update(String sql,List<Object> list)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			PreparedStatement ps=conn.prepareStatement(sql);
			if(list!=null)
			{
				//˵���У���
				for(int i=0;i<list.size();i++)
				{
					ps.setObject(i+1, list.get(i));
				}
			}
			int row=ps.executeUpdate();//row Ӱ�������
			ps.close();
			conn.close();
			return row;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}
	//ʵ�ֲ�ķ�װ��������sql���б�����ֵ��List<List<Object>> ��ά�б�(����)
	public List<List<Object>> query(String sql,List<Object> list)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			PreparedStatement ps=conn.prepareStatement(sql);
			
			if(list!=null)
			{
				//˵���У���
				for(int i=0;i<list.size();i++)
				{
					ps.setObject(i+1, list.get(i));
				}
			}
			//��ά���飬һ�ű��
			ResultSet rs =ps.executeQuery();
			List<List<Object>>table=new ArrayList<List<Object>>();
			while(rs.next())
			{
				//����һά���飬һ��
				List<Object>row =new ArrayList<Object>();
				//��ȡ��������еĸ���
				int ColumnCount	=rs.getMetaData().getColumnCount();
				for(int i=1;i<=ColumnCount;i++)//��һ�������� ��ִ�д���Ϊ����
				{
					row.add(rs.getObject(i));
				}
				//����ǰ�з�����
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
