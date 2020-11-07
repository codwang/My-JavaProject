/**
 * 
 */
package practice;
/**
 * ���򲻴�ͷ��㵥����
 * @author CodWang
 *
 */
class Node{
	public int data;
	public Node next;
	public Node(int data) {
		this.data = data;
	}
}

public class MyLinkNode {
	public Node head;
	/*
	 * ��ʾ������1
	 */
	public void disPlay_1() {
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
	 * ��ʾ������2
	 */
	public void disPlay_2(Node head) {
		if(head==null) {
			System.out.println("Over!");
			return;
		}
		Node p = head;
		while(p!=null) {
			System.out.print(p.data+"->");
			p = p.next;
		}
		System.out.println("Over!");
	}
	/*
	 *  ͷ�巨
	 *  ����Ҫ�п�
	 */
	public void addFirst(int data) {
		Node node = new Node(data); //����һ���µĽڵ�
		if(this.head == null) {
			this.head = node;
		}else {
			node.next = this.head;
			this.head = node;
		}	
		// Node node = new Node(data);
		// node.next = this.head;
		// this.head = node;
	}
	/*
	 *  β�巨
	 *  ��Ҫ�ж��Ƿ�Ϊ��
	 */
	 public void addEnd(int data) {
		 Node node = new Node(data); 
		 if(this.head == null) {
			 this.head = node;
		 }else {
			 Node p = this.head;
			 while(p.next!=null) {
				 p = p.next;
			 }
			 p.next = node;
		 }
	 }
	/*
	 * ��ȡ������ĳ���
	 */
	 public int size_1() {
		 int count = 0;
		 if(this.head == null) {
			 return 0;
		 }else {
			 Node p = this.head;
			 while(p!=null) {
				 count++;
				 p = p.next;
			 }
		 }
		 return count;
	 }
	 /*
	  * ��ȡ������ĳ���
	  */
	 public int size_2(Node head) {
		 int count = 0;
		 if(head == null) {
			 return 0;
		 }else {
			 Node p = head;
			 while(p!=null) {
				 count++;
				 p = p.next;
			 }
		 }
		 return count;
	 }
	 /*
	  * ����±��Ƿ�Ϸ�
	  */
	 public boolean checkIndex(int index) {
		 if(index < 0||index > this.size_1()) {
			 return false;
		 }
		 return true;
	 }
	 /*
	  * ���� (index-1)[ǰ���ڵ�]��λ�ã��ҵ���������
	  */
	 public Node searchPrev(int index) {
		 Node prev = this.head;
		 int i = 0;
		 while(i<index-1) {
			 prev = prev.next;
			 i++;
		 }
		 return prev;
	 }
	 /*
	  * ����λ�ò���,��һ�����ݽڵ�Ϊ0���±�
	  */
	 public void addIndex(int index,int data) {
		 Node node = new Node(data);
		 Node prev = null;
		 //Node p = this.head;
		 if(!this.checkIndex(index))
		 {
			 return;
		 }
		 if(index==0) {
			 addFirst(data);
			 return;
		 }
		 if(index==this.size_1()) {
			 addEnd(data);
			 return;
		 }else {
//			 int i = 0;
//			 while(i<index) {
//				 prev = p;
//				 p = p.next;
//				 i++;
//			 }
//			 prev.next = node;
//			 node.next = p; 
			 prev = this.searchPrev(index);
			 node.next = prev.next;
			 prev.next = node;
		 }
	 }
	 /*
	  * �����Ƿ�����ؼ���key�Ƿ��ڵ�������
	  */
	 public boolean findVal(int data) {
		 Node p = this.head;
		 while(p!=null) {
			 if(p.data==data) {
				 return true;
			 }
			 p = p.next;
		 }
		 return false;
	 }
	 /*
	  * �ҵ��ؼ�ֵ��ǰ���ڵ�
	  */
	 public Node searchPrevNode(int key) {
		 Node prev = this.head;
		 if(findVal(key)) {
			 while(prev.next!=null) {
				 if(prev.next.data==key) {
					 return prev;
				 }
				 prev = prev.next;
			 }
		 }
		 return null;
	 }
	 /*
	  * ��ֵɾ��
	  */
	 public void remove(int key) {
		Node prev = this.searchPrevNode(key);
		Node p = null;
		if(this.head==null) {
			return;
		}
		//ͷɾ
		if(this.head.data==key) { 
			this.head = this.head.next;
			 System.out.println("ɾ���ɹ�!");
			 return;
		}
		 if(prev==null) {
			 System.out.println("�����ڸ�ֵ!");
			 return;
		 }else {
					 p = prev.next;
					 prev.next = p.next;
					 //System.out.println("ɾ���ɹ�!");
			 }
	 }
	 /*
	  * βɾ
	  */
	 public void popBack() {
		 Node p = this.head;
		 Node prev = null;
		 if(this.head==null) {
			 return;
			 }
		 if(this.head.next==null) {
			 this.head = null;
			 System.out.println("βɾ�ɹ�!");
			 return;
		 }
		 while(p.next!=null) {
			 prev = p;
			 p= p.next;
		 }
		 prev.next = null;
		 System.out.println("βɾ�ɹ�!");
	 }
	 /*
	  *  ɾ������ֵΪkey�Ľڵ�
	  */
	 public void removeAllKey_1(int key) {
		 Node p = this.head;
		 if(!findVal(key)) {
			 System.out.println("�����ڸ�ֵ!");
			 return;
		 }
		 while(p!=null) {
			 if(p.data==key) {
				 remove(key);
			 }
			 p = p.next;
		 }
		 System.out.println("ɾ���ɹ�!");
	 }
	 /*
	  * ɾ������ֵΪkey�Ľڵ�
	  */
	 public void removeAllKey_2(int key) {
		 if(head==null){
	            return;
	        }
		 Node p = this.head.next;
		 Node prev = this.head;
		 if(!findVal(key)) {
			 System.out.println("�����ڸ�ֵ!");
			 return;
		 }
		 //Ҳ���Զ�ͷ�ڵ���жϷŵ������whileѭ����
//		 while(this.head.data==key&&this.head.next!=null) {
//					this.head = this.head.next;
//					p = this.head.next;
//					prev = this.head;	
//		 }
//		 if(p==null&&this.head.data==key) {
//			 this.head=null;
//		 }
		 while(p!=null) {
			 if(p.data==key) {
				prev.next = p.next;
				p = p.next;
			 }else {
				 prev = p;
				 p = p.next;
			 }
			 if(this.head.data==key) {
				 this.head = this.head.next;
			 }
		 }
		 System.out.println("ɾ���ɹ�!");
	 }
	 /*
	  * ��ת������
	  * ժ��ͷ�ڵ����Ľڵ����ͷ�巨
	  */
	 public void reverse_1() {
		 if(this.head==null||this.head.next==null) {
			 return;
		 }
		 //ժ��ͷ�ڵ�
		 Node p = this.head.next;
		 this.head.next=null;
		 //����ǰ��
		 Node cur = p;
		 while(p!=null) {
			 p = p.next;
			 cur.next = this.head;
			 this.head = cur;
			 cur = p;
		 }
	 }
	 /*
	  * ��ת������(�͵ط�ת)
	  */
	 public void reverse_2() {
		 if(this.head==null||this.head.next==null) {
			 return;
		 }
		 Node p = this.head.next;
		 Node prev = this.head;
		 prev.next = null;
		 Node s = null;
		 while(p!=null) {
			 s = p.next;
			 p.next = prev;
			 prev = p;
			 p = s;
		 }
		 this.head = prev;
	 }
	 /*
	  * ������м�ڵ�
	  * �������ң�����һ��fast�ڵ�ÿ����������slow�ڵ�ÿ����һ��
	  */
	 
	public Node middleNode() {
		 if(this.head==null) {
			 return null;
		 }
		 Node fast = this.head;
		 Node slow = this.head;
		 //��fastΪ�ջ���fast�ĺ��Ϊ�գ���˵���ҵ��м�ڵ�
		 while(fast!=null&&fast.next!=null) {
			 fast = fast.next.next;
			 slow = slow.next;
		 }
		 return slow;
	 }
	/*
	 * �����������K���ڵ�
	 * ���������ȣ�Ȼ�����size-k��
	 */
	public Node findKthToTail_1(int k) {
		int size = this.size_1();
		if(this.head==null||k > size) {
			return null;
		}

        Node p = this.head;
        for(int i = 0;i<size-k;i++) {
        	p = p.next;
        }
        return p;
    }
	/*
	 * �����������K���ڵ�
	 * �����������ã�һ������k-1����һ����һ����Ȼ������ͬʱ��
	 */
	public Node findKthToTail_2(int k) {
		
		if(this.head==null||k <= 0) {
			return null;
		}	
		int i = 0;
        Node fast = this.head;
        Node slow = this.head;
        while(i<k-1) {
        		fast = fast.next;
        		i++;	
        	//��fast�����пգ����Ϊ����˵��kֵ�Ƿ�
        	if(fast==null) {
        		return null; 
        	}
        }
        while(fast.next != null) {
        	//��������
        	slow = slow.next;
        	fast = fast.next;
        }
        return slow;
    }
	/*
	 * ��������������ϲ�Ϊһ���µ����� ��������
	 */
//    public Node mergeTwoLists(Node l1, Node l2) {
//        
//    }
	/*
	 * ������С��x�Ľ������������֮ǰ���Ҳ��ܸı�ԭ��������˳�򣬷����������к�������ͷ��
	 */
    public Node partition(int x) {
        if(this.head==null) {
        	return null;
        }
        Node p = this.head;
        //������������ p ��  s
        Node pleft = null;
        Node pright = null;
        
        Node sleft = null;
        Node sright = null;
        
        while(p != null) {
        	if(p.data < x) {
        		if(pleft==null) {
        			//��һ�β���(β��)
            		pleft = p;
            		pright = p;
            	}else {
            		pright.next = p;
            		pright = p;
            	}	
        	}else {
        		if(sleft == null) {
        			//��һ�β���(β��)
        			sleft = p;
        			sright = p;
        		}else {
        			sright.next = p;
        			sright = p;	
        		}
        	}
        	p = p.next;
        }
        //���������Ϊ�գ���ֱ�ӷ���������
        if(pleft == null) {
        	return sleft;
        }
        //�������������������������
        pright.next = sleft;
        //�������䲻Ϊ�յ�����£�������������һ���ڵ�ĺ��ָ��գ������ӡ����������ѭ��
        if(sleft!=null) {
        	sright.next = null;
        }
        return pleft;
    }
    /*
     * ��һ������������У�ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ��
     */
    public Node deleteDuplication() {
    	Node phead = new Node(-1); //���ܽڵ�
    	Node p = this.head;
    	Node tmp = phead;
    	
    	while(p!=null) {
    		if(p.next!=null && p.data == p.next.data) {
    			while(p.next!=null && p.data == p.next.data) {
    				p = p.next;
    			}
    			p = p.next;
    		}else {
    			tmp.next = p;
    			tmp = p;
    			p = p.next;
    		}
    	}
    	tmp.next = null;
    	return phead.next;
    }
     /*
      * �ж������Ƿ�Ϊ���Ľṹ    
      */
    public boolean chkPalindrome() {
    	if(this.head == null) {
    		return false;
    	}
    	if(this.head.next==null) {
    		return true;
    	}
        Node p =this.head;
        Node mid = this.middleNode();//�ҵ��м�ڵ�
        Node tmp = mid.next;
        //���м�ڵ㷴תһ������
        while(tmp!=null) {
        	Node tmpnext = tmp.next;
        	tmp.next = mid;
        	mid = tmp;
        	tmp = tmpnext;
        }
        //�жϽڵ��ֵ�Ƿ���ȣ�ֱ�� p��mid�������������
        while(p != mid) {
        	if(p.data!=mid.data) {
        		return false;
        	}
        	//�ж�ż�����
        	if(p.next==mid) {
        		return true;
        	}
        	p = p.next;
        	mid = mid.next;
        }
        return true;
    }
    /*
     * �ж��������Ƿ��л�
     */
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast!=null&&fast.next!=null) {
        
        	fast = fast.next.next;
        	slow = slow.next;
        	if(fast == slow) {
        		break;
        	}
        }
        if(fast==null||fast.next==null) {
        	return false;
        }
        return true;
    } 
    /*
     * ����һ��������������ʼ�뻷�ĵ�һ���ڵ㡣 ��������޻����򷵻� null��
     * �����������ã�����ָ��fast��slow��һ��ÿ����2����һ��ÿ����һ����ֱ��������
     * ��ʱͷ�ڵ�Ի���ڵľ��������λ�õ�����ڵľ���һ��
     * Ȼ������һ������ָ��ͷ�ڵ㣬����������ÿ����һ��ֱ���ٴ�������ʱ���ǻ����
     */
    public Node detectCycle() {
        if(head==null) {
    		return null;
    	}
    	Node fast = this.head;
    	Node slow = this.head;
    	while(fast!=null && fast.next!=null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		if(fast==slow) {
    			break;
    		}
    	}
    	//���������
    	//�޻�
    	if(fast==null||fast.next==null) {
    		return null;
    	}
    	//��֮�л�����������������һ��ָ��ͷ�ڵ�
    	slow = this.head;
    	while(slow!=fast) {
    		slow = slow.next;
    		fast = fast.next;
    	}
    	return slow;
    }
     /*
      * �������������ҳ����ǵĵ�һ�������ڵ�
      * �������������ĳ��ȣ������ȣ���������������������������ȣ����ʱ���ǵ�һ���ཻ�ڵ�
      * ������Ȳ���ȣ����ó���һ�������������������ȵĲ�ֵ�����ٱ�����������
      */
    public Node getIntersectionNode(Node headA,Node headB) {
        if(headA==null||headB==null) {
        	return null;
        }
        int sizeA = size_2(headA);
        int sizeB = size_2(headB);
        Node p1 = headA;
        Node p2 = headB;
        if(sizeA==sizeB) {
        	while(p1!=null&&p2!=null) {
        		if(p1 == p2) {
        			return p1;
        		}
        		p1 = p1.next;
        		p2 = p2.next;
        	}
        	return null;
        }
        else if(sizeA < sizeB) {
        	int n = sizeB-sizeA;
        	while(n > 0) {
        		p2 = p2.next;
        		n--;
        	}
        	while(p1!=null && p2!=null) {
        		if(p1 == p2) {
        			return p1;
        		}
        		p1 = p1.next;
        		p2 = p2.next;
        	}
        	return null;
        }else {
        	int n = sizeA - sizeB;
        	while(n > 0) {
        		p1 = p1.next;
        		n--;
        	}
        	while(p1!=null && p2!=null) {
        		if(p1 == p2) {
        			return p1;
        		}
        		p1 = p1.next;
        		p2 = p2.next;
        	}
        	return null;
        }
        
    }
    /*
     * ������������ϲ�Ϊһ���µ� ���� ��������
     */
//    public Node mergeTwoLists_1(Node l1, Node l2) {
//        if(l1==null&&l2!=null){
//            return l2;
//        }
//        if(l1!=null&&l2==null){
//            return l1;
//        }
//        if(l1==null&&l2==null){
//            return null;
//        }
//        Node phead = new ListNode(-1);
//        Node p = phead;
//        Node s = l1;
//        while(s!=null){
//            p.next = s;
//            p = s;
//            s = s.next;
//        }
//        s = l2;
//         while(s!=null){
//            p.next = s;
//            p = s;
//            s = s.next;
//        }
//   
//        return phead.next;
//    }
    
    /*
     * ������������ϲ�Ϊһ���µ� ���� ��������
     * ����һ�����ܽڵ���Ϊ������ͷ�ڵ�
     */
    public Node mergeTwoLists_2(Node l1, Node l2) {
    	 if(l1==null&&l2!=null){
             return l2;
         }
         if(l1!=null&&l2==null){
             return l1;
         }
         if(l1==null&&l2==null){
             return null;
         }
         Node phead = new Node(-1);
         Node p = phead;
         while(l1!=null&&l2!=null){
             if(l1.data < l2.data){
                 p.next = l1;
                 p = p.next;
                 l1 = l1.next;
             }else{
                 p.next = l2;
                 p = p.next;
                 l2 = l2.next;
             }
         }
         //��ʱҪô������1Ϊ�ջ���������2Ϊ��
         //�������1Ϊ�գ�������2��ʣ�ڵĽڵ㶼���ӵ�p�ĺ���
        if(l1==null) {
//            while(l2!=null){
//                p.next = l2;
//                p = p.next;
//                l2 = l2.next;
//            }
//            p.next = null;
            
            p.next = l2; 
        }
        //��֮������1��ʣ�ڵĽڵ����ӵ�p�ĺ���
        if(l2==null){
//              while(l1!=null){
//                p.next = l1;
//                p = p.next;
//                l1 = l1.next;
//            }
//            p.next = null;
            p.next = l1;
        }
         return phead.next;
     }
    	
	 /*
	  * ��յ�����
	  */
	 public void clear() {
		 if(this.head==null) {
			 return;
		 }
		this.head = null;	
	 }
}
