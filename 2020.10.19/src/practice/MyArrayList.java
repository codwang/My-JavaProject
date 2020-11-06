
package practice;

import java.util.Arrays;

/**
 * ˳���
 * @author 13093
 *
 */

public class MyArrayList {

	public int[]list; //�ɱ䳤����
	public int size; //Ԫ�ظ���
	MyArrayList(){
		this.list = new int[5];
		this.size = 0;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyArrayList [list=" + Arrays.toString(list) + ", size=" + size + "]";
	}
	/*
	 * ��ӡ˳���
	 */
	public void display() {
		for (int i = 0; i < this.size; i++) {
			System.out.print(this.list[i]+" ");
		}
	}
	
	/*
	 * β��
	 */
	public void pushBack(int data) {
		if(this.size == this.list.length) {
			this.list = Arrays.copyOf(this.list, 2*this.list.length);
		}
		this.list[size++] = data;	
	}
	/*
	 * βɾ
	 */
	public void popBack() {
		if(this.size==0) {
			return;
		}
		this.size--;
	}
	/*
	 * ��posλ�ò���Ԫ��
	 */
	public void add(int pos,int data) {
		if(pos < 0 || pos > this.size) {
			System.out.println("����λ�÷Ƿ�!");
			return ;
		}
		if(this.size == this.list.length) {
			this.list = Arrays.copyOf(this.list, 2*this.list.length);
		}
		for (int i = this.size-1; i >= pos; i--) {
			this.list[i+1] = this.list[i];
		}
		this.list[pos] = data;
		this.size++;
	}
	 /*
	  * ����ĳһ��Ԫ�ض�Ӧ��λ��
	  */
	 public int search(int x) {
		 for (int i = 0; i < this.size; i++) {
			if(this.list[i] == x) {
				return i;
			}
		}
		 return -1;
	 }
	 /*
	  * �ж��Ƿ����ĳ��Ԫ��
	  */
	 public boolean contains(int x) {
		 for (int i = 0; i < this.size; i++) {
			 if(this.list[i] == x) {
					return true;
				}
		}
		 return false;
	 }
	/*
	 * ��ȡposλ�õ�Ԫ��
	 */
	 public int getPos(int pos) {
		 if(pos<0||pos>=this.size) {
			 System.out.println("posλ�÷Ƿ�");
			 return -1;
		 }
		 return this.list[pos];
	 }
	 /*
	  * ��posλ�õ�Ԫ����Ϊvalue
	  */
	 public void setPos(int pos,int value) {
		 if(pos<0||pos>=this.size) {
			 System.out.println("posλ�÷Ƿ�");
			 return;
		 }
		 this.list[pos] = value;
	 }
	 /*
	  * ��ȡ˳��� ����
	  */
	 public int size() {
		 return this.size;
	 }
	 /*
	  * ɾ����һ�γ��ֵĹؼ���key
	  */
	 public void remove(int toRemove) {
		/* if(this.size==0) {
			 return;
		 }
		 for (int i = 0; i < this.size; i++) {
			if(this.list[i]==toRemove) {
				for(int j = i;j < this.size;j++) {
					this.list[j] = this.list[j+1];
				}
				this.size--;
				break;
			}
		} */
		 
		int index = search(toRemove);
		if(index == -1) {
			System.out.println("û�иùؼ���");
			return;
		}
		for(int i = index;i < this.size;i++) {
			this.list[i] = this.list[i+1];
		}
		this.size--;
	 }
	 /*
	  * ���˳���
	  */
	 public void clear() {
		 this.size = 0;
	 }
}
