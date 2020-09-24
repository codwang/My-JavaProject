/**
 * 
 */
package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 13093
 *
 */
class DemoDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		JDBCUtil jdbc=new JDBCUtil();
		List list=new ArrayList();
		System.out.println("请输入要删除的dvd的id");
		int id=sc.nextInt();
		list.add(id);
		int row=jdbc.update("delete from dvd2 where id=?",list);
		System.out.println(row>=1?"删除成功!":"删除失败!");
		sc.close();
	}

}
