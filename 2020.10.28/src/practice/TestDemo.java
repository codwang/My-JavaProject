/**
 * 
 */
package practice;

/**
 * @author 13093
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		MyDoubleLinkNode myDoubleLinkNode = new MyDoubleLinkNode();
//		myDoubleLinkNode.addFirst(1);
//		myDoubleLinkNode.addFirst(2);
//		myDoubleLinkNode.addFirst(3);
//		myDoubleLinkNode.display();
		myDoubleLinkNode.addLast(2);
		myDoubleLinkNode.addLast(3);
		myDoubleLinkNode.addLast(4);
		myDoubleLinkNode.addLast(2);
		myDoubleLinkNode.addLast(2);
//		myDoubleLinkNode.addLast(2);
		myDoubleLinkNode.display();
//		System.out.println(myDoubleLinkNode.size());
//		myDoubleLinkNode.addIndex(0, 4);
//		myDoubleLinkNode.remove(4);
		myDoubleLinkNode.removeAllKey(2);
		myDoubleLinkNode.clear();
		myDoubleLinkNode.display();
		
	}
}
