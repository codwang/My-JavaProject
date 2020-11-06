
package practice;

import java.util.Arrays;

/**
 * 顺序表
 * @author 13093
 *
 */

public class MyArrayList {

	public int[]list; //可变长数组
	public int size; //元素个数
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
	 * 打印顺序表
	 */
	public void display() {
		for (int i = 0; i < this.size; i++) {
			System.out.print(this.list[i]+" ");
		}
	}
	
	/*
	 * 尾插
	 */
	public void pushBack(int data) {
		if(this.size == this.list.length) {
			this.list = Arrays.copyOf(this.list, 2*this.list.length);
		}
		this.list[size++] = data;	
	}
	/*
	 * 尾删
	 */
	public void popBack() {
		if(this.size==0) {
			return;
		}
		this.size--;
	}
	/*
	 * 在pos位置插入元素
	 */
	public void add(int pos,int data) {
		if(pos < 0 || pos > this.size) {
			System.out.println("插入位置非法!");
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
	  * 查找某一个元素对应的位置
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
	  * 判定是否包含某个元素
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
	 * 获取pos位置的元素
	 */
	 public int getPos(int pos) {
		 if(pos<0||pos>=this.size) {
			 System.out.println("pos位置非法");
			 return -1;
		 }
		 return this.list[pos];
	 }
	 /*
	  * 给pos位置的元素设为value
	  */
	 public void setPos(int pos,int value) {
		 if(pos<0||pos>=this.size) {
			 System.out.println("pos位置非法");
			 return;
		 }
		 this.list[pos] = value;
	 }
	 /*
	  * 获取顺序表 长度
	  */
	 public int size() {
		 return this.size;
	 }
	 /*
	  * 删除第一次出现的关键字key
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
			System.out.println("没有该关键字");
			return;
		}
		for(int i = index;i < this.size;i++) {
			this.list[i] = this.list[i+1];
		}
		this.size--;
	 }
	 /*
	  * 清空顺序表
	  */
	 public void clear() {
		 this.size = 0;
	 }
}
