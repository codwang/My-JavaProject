/**
 * 
 */
package day07;


import java.awt.peer.SystemTrayPeer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 13093
 *
 */
class DemoInsert {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		JDBCUtil jdbc=new JDBCUtil();
		List list=new ArrayList();
		System.out.println("������dvd���ƣ�");
		String name=sc.next();
		list.add(name);
		System.out.println("������۸�");
		Double price=sc.nextDouble();
		list.add(price);
		System.out.println("����������磺");
		String publish=sc.next();
		list.add(publish);
		int row= jdbc.update("insert into dvd2 values(null,?,?,?,0,'','',0)", list);
		System.out.println(row>=1?"�����ɹ�!":"����ʧ��!");
		sc.close();
	}


}
