/**
 * 
 */
package practice;

/**
 * @author 13093
 *����ͷ�ڵ��˫���ѭ������
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
	public Node head;//ͷ�ڵ�
	public Node tail;//β�ڵ�
	/*
	 * ��ʾ����
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
	 * ��������
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
	 * ͷ�巨
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
	 * β�巨
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
	 * ����λ�ò���,��һ�����ݽڵ�Ϊ0���±�
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
	  * �����Ƿ�����ؼ���key�Ƿ��ڵ�������
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
	  * ɾ����һ�γ��ֹؼ���Ϊkey�Ľڵ�
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
						 //ɾ���Ĳ���β�ڵ�
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
	  * ɾ������ֵΪkey�Ľڵ�
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
						 //ɾ���Ĳ���β�ڵ�
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
	  * ��յ�����
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
