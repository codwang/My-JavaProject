/**
 * 
 */
package practice;

import java.util.Scanner;

public class TestDemo {

	
	public static void main(String[] args) {
		MyLinkNode myLinkNode = new MyLinkNode();
		Scanner sc = new Scanner(System.in);
		System.out.println("«Î≤Â»Î ˝æ›:");
		int n = 0;
		while(true) {
			n = sc.nextInt();
			if(n!=-1) {
				myLinkNode.addEnd(n);
			}else {
				break;
			}
		}
		
//		myLinkNode.addEnd(1);
//		myLinkNode.addEnd(1);
//		myLinkNode.addEnd(4);
//		myLinkNode.addEnd(2);
//		myLinkNode.addEnd(1);
//		myLinkNode.addEnd(3);
//		myLinkNode.addEnd(3);
		myLinkNode.disPlay_1();
//		System.out.println(myLinkNode.size());
//		myLinkNode.removeAllKey_2(3);
//		System.out.println(myLinkNode.findVal(3));
//		myLinkNode.clear();
//		myLinkNode.popBack();
//		myLinkNode.reverse_2();
//		Node p = myLinkNode.findKthToTail_2(2);
//		if(p!=null) {
//			System.out.println(p.data);
//		}else {
//			System.out.println("null");
//		}
//		System.out.println(myLinkNode.chkPalindrome());
//		System.out.println(myLinkNode.hasCycle());
//        myLinkNode.clear();
//		myLinkNode.disPlay_2(myLinkNode.deleteDuplication());
//		myLinkNode.disPlay_2(myLinkNode.partition(12));
	}

}
