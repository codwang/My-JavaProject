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
class DemoFind {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List list=new ArrayList();
		JDBCUtil jdbc=new JDBCUtil();
		jdbc.Find("select * from dvd2");
		sc.close();
	}

}
