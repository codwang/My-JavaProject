
package practice;


public class Demo01 {
	//�ҳ�һ��������ֻ����һ�ε�����
	public static int findNum(int[]arr) {
		int ret = 0;
		for (int i = 0;i < arr.length;i++) {
			ret ^= arr[i];
		}
		return ret;
	}
	public static void main(String[] args) {
		int[]arr = {1,3,1,5,3};
		System.out.println(findNum(arr));
	}
}
