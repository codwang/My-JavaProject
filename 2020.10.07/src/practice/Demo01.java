
package practice;

import java.util.Arrays;

public class Demo01 {
	/**
	 * 
	 * @param ģ��ʵ��toString ����
	 * @return
	 */
	public static String myString(int []arr) {
		if(arr == null) {
			return null;
		}
		if(arr.length == 0) {
			return "[]";
		}
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				str += arr[i]+"]";
				break;
			}
			str += arr[i] + ", ";
		}
		return str;
	}
	/**
	 * ���鿽��
	 * 1.native��˵���˷�����һ�����ط���
	 * 2.src��Դ����   srcPos: ��Դ�����posλ�ÿ�ʼ����
	 *   dest��������Ŀ������ destPos��������Ŀ�������posλ��
	 *   length�� ��������
	 * 3.arraycopy �����ٶ����     
	 * @param args
	 */
	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		//int []dest = new int[arr.length];
		
		//���ط���
		//System.arraycopy(arr, 0, dest, 0, arr.length);
		//System.out.println(Arrays.toString(arr));
		
		
		//int []dest = Arrays.copyOf(arr, arr.length);
		
		int []dest = arr.clone();
		System.out.println(Arrays.toString(dest));
		//System.out.println(myString(arr));
	
		
	}
}
