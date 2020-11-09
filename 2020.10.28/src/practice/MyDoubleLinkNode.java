/**
 * 
 */
package practice;

/**
 * @author 13093
 *不带头节点的双向非循环链表
 */

class Node{
	public int data;
	public Node next;
	public Node prev;
	public Node(int data) {
		this.data = data;
	}
}
public class MyDoubleLinkNode {
	public Node head;//头节点
	public Node tail;//尾节点
	/*
	 * 显示链表
	 */
	public void display() {
		if(this.head==null) {
			System.out.println("Over!");
			return;
		}
		Node p = this.head;
		while(p!=null) {
			System.out.print(p.data+"->");
			p = p.next;
		}
		System.out.println("Over!");
	}
	/*
	 * 单链表长度
	 */
	public int size() {
		int count = 0;
		Node p = this.head;
		while(p!=null) {
			count++;
			p = p.next;
		}
		return count;
	}
	/*
	 * 头插法
	 */
	public void addFirst(int data) {
		Node node = new Node(data);
		if(this.head==null) {
			this.head = node;
			this.tail = node;
		}else {
			node.next = this.head;
			this.head.prev = node;
			this.head = node;
		}
	}
	/*
	 * 尾插法
	 */
	public void addLast(int data) {
		Node node = new Node(data);
		if(this.head==null) {
			this.head = node;
			this.tail = node;
		}
		this.tail.next = node;
		node.prev = this.tail;
		this.tail = node;
	}
	/*
	 * 任意位置插入,第一个数据节点为0号下标
	 */
	 public boolean addIndex(int index,int data) {
		 if(index < 0) {
			 return false;
		 }
		 int size = this.size();
		 if(index == 0) {
			 this.addFirst(data);
			 return true;
		 }
		 if(index == size) {
			 this.addLast(data);
			 return true;
		 }
		 Node p = this.head;
		 Node node = new Node(data);
		 int n = index - 1;
		 while(n>0) {
			 p = p.next;
			 n--;
		 }
		 p.next.prev = node;
		 node.next = p.next;
		 node.prev = p;
		 p.next = node;
		 return true;
	 }
	 /*
	  * 查找是否包含关键字key是否在单链表当中
	  */
	 public boolean contains(int key) {
		 if(this.head==null) {
			 return false;
		 }
		 Node p = this.head;
		 while(p!=null) {
			 if(p.data == key) {
				 return true;
			 }
			 p = p.next;
		 }
		 return false;
	 }
	 /*
	  * 删除第一次出现关键字为key的节点
	  */
	 public void remove(int key) {
		 if(!this.contains(key)) {
			 return;
		 }
		 Node p = this.head;
		 while(p!=null) {
			 if(p.data==key) {
				 if(p == this.head) {
					 this.head = this.head.next;
					 this.head.prev = null;
				 }else {
					 p.prev.next = p.next;
					 if(p.next!=null) {
						 //删除的不是尾节点
						 p.next.prev = p.prev;
					 }else {
						 this.tail = p.prev;
					 }
				 }
				 return;
			 }else {
				 p = p.next;
			 }
		 }
	 }
	 /*
	  * 删除所有值为key的节点
	  */
	 public void removeAllKey(int key) {
		 if(this.head==null) {
			 return;
		 }
		 Node p = this.head;
		 while(p!=null) {
			 if(p.data==key) {
				 if(p == this.head) {
					 this.head = this.head.next;
					 this.head.prev = null;
				 }else {
					 p.prev.next = p.next;
					 if(p.next!=null) {
						 //删除的不是尾节点
						 p.next.prev = p.prev;
					 }else {
						 this.tail = p.prev;
					 }
				 }
			 }
				 p = p.next;
		 }	
	 }
	 /*
	  * 清空单链表
	  */
	 public void clear() {
		 if(this.head == null) {
			 return;
		 }
	 	 Node p = this.head;
		 while(p!=null) {
			 Node s = p.next;
			 p.next = null;
			 p.prev = null;
			 p = s;
		 }
		 this.head = null;
		 this.tail = null;
	 }
}
