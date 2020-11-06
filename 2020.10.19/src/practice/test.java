
package practice;

public class test {
	
	public static void main(String[] args) {
		boolean flag;
		int ret = 0;
		MyArrayList mylist = new MyArrayList();
		mylist.pushBack(1);
		mylist.pushBack(2);
		mylist.pushBack(3);
		mylist.pushBack(4);
		mylist.pushBack(5);
		mylist.pushBack(6);
		mylist.display();
		mylist.remove(0);
		System.out.println(mylist);
		mylist.display();
	}
}
