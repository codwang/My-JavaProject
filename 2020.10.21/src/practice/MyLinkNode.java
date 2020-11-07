/**
 * 
 */
package practice;
/**
 * 单向不带头结点单链表
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
	 * 显示单链表1
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
	 * 显示单链表2
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
	 *  头插法
	 *  不需要判空
	 */
	public void addFirst(int data) {
		Node node = new Node(data); //创建一个新的节点
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
	 *  尾插法
	 *  需要判断是否为空
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
	 * 获取单链表的长度
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
	  * 获取单链表的长度
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
	  * 检查下标是否合法
	  */
	 public boolean checkIndex(int index) {
		 if(index < 0||index > this.size_1()) {
			 return false;
		 }
		 return true;
	 }
	 /*
	  * 查找 (index-1)[前驱节点]的位置，找到返回引用
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
	  * 任意位置插入,第一个数据节点为0号下标
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
	  * 查找是否包含关键字key是否在单链表当中
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
	  * 找到关键值的前驱节点
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
	  * 按值删除
	  */
	 public void remove(int key) {
		Node prev = this.searchPrevNode(key);
		Node p = null;
		if(this.head==null) {
			return;
		}
		//头删
		if(this.head.data==key) { 
			this.head = this.head.next;
			 System.out.println("删除成功!");
			 return;
		}
		 if(prev==null) {
			 System.out.println("不存在该值!");
			 return;
		 }else {
					 p = prev.next;
					 prev.next = p.next;
					 //System.out.println("删除成功!");
			 }
	 }
	 /*
	  * 尾删
	  */
	 public void popBack() {
		 Node p = this.head;
		 Node prev = null;
		 if(this.head==null) {
			 return;
			 }
		 if(this.head.next==null) {
			 this.head = null;
			 System.out.println("尾删成功!");
			 return;
		 }
		 while(p.next!=null) {
			 prev = p;
			 p= p.next;
		 }
		 prev.next = null;
		 System.out.println("尾删成功!");
	 }
	 /*
	  *  删除所有值为key的节点
	  */
	 public void removeAllKey_1(int key) {
		 Node p = this.head;
		 if(!findVal(key)) {
			 System.out.println("不存在该值!");
			 return;
		 }
		 while(p!=null) {
			 if(p.data==key) {
				 remove(key);
			 }
			 p = p.next;
		 }
		 System.out.println("删除成功!");
	 }
	 /*
	  * 删除所有值为key的节点
	  */
	 public void removeAllKey_2(int key) {
		 if(head==null){
	            return;
	        }
		 Node p = this.head.next;
		 Node prev = this.head;
		 if(!findVal(key)) {
			 System.out.println("不存在该值!");
			 return;
		 }
		 //也可以对头节点的判断放到下面的while循环里
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
		 System.out.println("删除成功!");
	 }
	 /*
	  * 反转单链表
	  * 摘掉头节点后面的节点采用头插法
	  */
	 public void reverse_1() {
		 if(this.head==null||this.head.next==null) {
			 return;
		 }
		 //摘掉头节点
		 Node p = this.head.next;
		 this.head.next=null;
		 //进行前插
		 Node cur = p;
		 while(p!=null) {
			 p = p.next;
			 cur.next = this.head;
			 this.head = cur;
			 cur = p;
		 }
	 }
	 /*
	  * 反转单链表(就地反转)
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
	  * 链表的中间节点
	  * 快慢查找，定义一个fast节点每次走两步，slow节点每次走一步
	  */
	 
	public Node middleNode() {
		 if(this.head==null) {
			 return null;
		 }
		 Node fast = this.head;
		 Node slow = this.head;
		 //当fast为空或者fast的后继为空，则说明找到中间节点
		 while(fast!=null&&fast.next!=null) {
			 fast = fast.next.next;
			 slow = slow.next;
		 }
		 return slow;
	 }
	/*
	 * 输出链表倒数第K个节点
	 * 先求链表长度，然后遍历size-k次
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
	 * 输出链表倒数第K个节点
	 * 定义两个引用，一个先走k-1步，一个走一步，然后两个同时走
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
        	//对fast进行判空，如果为空则说明k值非法
        	if(fast==null) {
        		return null; 
        	}
        }
        while(fast.next != null) {
        	//更新条件
        	slow = slow.next;
        	fast = fast.next;
        }
        return slow;
    }
	/*
	 * 将两个升序链表合并为一个新的升序 链表并返回
	 */
//    public Node mergeTwoLists(Node l1, Node l2) {
//        
//    }
	/*
	 * 将所有小于x的结点排在其余结点之前，且不能改变原来的数据顺序，返回重新排列后的链表的头。
	 */
    public Node partition(int x) {
        if(this.head==null) {
        	return null;
        }
        Node p = this.head;
        //定义两个区间 p 和  s
        Node pleft = null;
        Node pright = null;
        
        Node sleft = null;
        Node sright = null;
        
        while(p != null) {
        	if(p.data < x) {
        		if(pleft==null) {
        			//第一次插入(尾插)
            		pleft = p;
            		pright = p;
            	}else {
            		pright.next = p;
            		pright = p;
            	}	
        	}else {
        		if(sleft == null) {
        			//第一次插入(尾插)
        			sleft = p;
        			sright = p;
        		}else {
        			sright.next = p;
        			sright = p;	
        		}
        	}
        	p = p.next;
        }
        //如果左区间为空，则直接返回右区间
        if(pleft == null) {
        	return sleft;
        }
        //否则将左区间和右区间连接起来
        pright.next = sleft;
        //在右区间不为空的情况下，将右区间的最后一个节点的后继指向空，否则打印链表会造成死循环
        if(sleft!=null) {
        	sright.next = null;
        }
        return pleft;
    }
    /*
     * 在一个排序的链表中，删除该链表中重复的结点，重复的结点不保留，返回链表头指针
     */
    public Node deleteDuplication() {
    	Node phead = new Node(-1); //傀儡节点
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
      * 判断链表是否为回文结构    
      */
    public boolean chkPalindrome() {
    	if(this.head == null) {
    		return false;
    	}
    	if(this.head.next==null) {
    		return true;
    	}
        Node p =this.head;
        Node mid = this.middleNode();//找到中间节点
        Node tmp = mid.next;
        //从中间节点反转一半链表
        while(tmp!=null) {
        	Node tmpnext = tmp.next;
        	tmp.next = mid;
        	mid = tmp;
        	tmp = tmpnext;
        }
        //判断节点的值是否相等，直到 p和mid相遇，奇数情况
        while(p != mid) {
        	if(p.data!=mid.data) {
        		return false;
        	}
        	//判断偶数情况
        	if(p.next==mid) {
        		return true;
        	}
        	p = p.next;
        	mid = mid.next;
        }
        return true;
    }
    /*
     * 判断链表中是否有环
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
     * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
     * 定义两个引用，快慢指针fast和slow，一个每次走2步，一个每次走一步，直到相遇。
     * 此时头节点对环入口的距离和相遇位置到环入口的距离一样
     * 然后将任意一个引用指向头节点，让两个引用每次走一步直到再次相遇此时就是环入口
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
    	//有两种情况
    	//无环
    	if(fast==null||fast.next==null) {
    		return null;
    	}
    	//反之有环，将两个引用任意一个指向头节点
    	slow = this.head;
    	while(slow!=fast) {
    		slow = slow.next;
    		fast = fast.next;
    	}
    	return slow;
    }
     /*
      * 输入两个链表，找出它们的第一个公共节点
      * 先求出两个链表的长度，如果相等，则遍历两个链表，如果两个引用相等，则此时就是第一个相交节点
      * 如果长度不想等，则让长的一个链表先走两个链表长度的差值步，再遍历两个链表
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
     * 两个升序链表合并为一个新的 升序 链表并返回
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
     * 两个升序链表合并为一个新的 升序 链表并返回
     * 创建一个傀儡节点作为新链表头节点
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
         //此时要么是链表1为空或者是链表2为空
         //如果链表1为空，则将链表2所剩于的节点都连接到p的后面
        if(l1==null) {
//            while(l2!=null){
//                p.next = l2;
//                p = p.next;
//                l2 = l2.next;
//            }
//            p.next = null;
            
            p.next = l2; 
        }
        //反之则将链表1所剩于的节点链接到p的后面
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
	  * 清空单链表
	  */
	 public void clear() {
		 if(this.head==null) {
			 return;
		 }
		this.head = null;	
	 }
}
