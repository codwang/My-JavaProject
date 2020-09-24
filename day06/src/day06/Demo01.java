/**
 * 
 */
package day06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * @author 13093
 *JDBC：
 *1.加载驱动
 *2.获取连接（java连接mysql数据库）
 *3.预执行（准备好SQL语句）
 *4.执行
 *5.释放资源（关闭预执行，关闭连接）
 */
class Demo01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		//1.加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","123456");
			//3.预执行（准备SQL语句）
				System.out.println("请输入dvd的名字：");
				String name=sc.next();
				System.out.println("请输入dvd的价格：");
				double price=sc.nextDouble();
				System.out.println("请输入dvd的出版社：");
				String publish=sc.next();
				System.out.println("请输入该dvd的借阅者：");
				String borName=sc.next();
				System.out.println("请输入借阅该dvd的日期");
				String borData=sc.next();
				PreparedStatement ps=conn.prepareStatement("insert into dvd2 values(null,?,?,?,0,?,?,0)");
				ps.setString(1, name);//将name的值放在第一个问号处
				ps.setDouble(2,price);//将priced的值放入第二个问号处
				ps.setString(3, publish);//将publish的值放在第三个问号处
				ps.setString(4, borName);
				ps.setString(5, borData);
				//4.执行
				int row=ps.executeUpdate();//执行sql:只能执行增删改，返回值为影响函数
				if (row==1)
				{
					System.out.println("新增成功!");
					
				}
				else {
					System.out.println("新增失败!");
				}
//			if(conn!=null)
//			{
//				System.out.println("java连接mysql成功!");
//			}
//			else {
//				System.out.println("java连接mysql失败!");
//			}
			//5.释放资源
			sc.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}


}
