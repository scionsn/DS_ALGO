class Node1<T>{
	T data;
	Node1<T> next;
	//boolean isVisited;
	Node1(T data){
		this.data = data;
		//this.next = null;
	}
	@Override
	public String toString() {
		return "Node "+data+" Ref "+next;
	}
}
class LinkedListOperations<T>{
	Node1<T> start;
	Node1<T> tail;
	public Node1 OddEvenList(Node1<T> head) {
		if(head==null){
			return head;
		}
		Node1 oddhead=head;
		Node1 evenhead=head.next;
		Node1 even=evenhead;
		//        evenhead.next!=null works only on the case when we  have an even index corresponding to an odd index,but adding evenhead!=null along with enenhead.next!=null
		// handles all the cases even when there is no evenn index for an odd index.
		//working on the indexes and not the data of the nodes,so it doesnt matter if the data is sorted or not.
		while(evenhead!=null&&evenhead.next!=null){
			oddhead.next=evenhead.next;
			oddhead=oddhead.next;
			evenhead.next=oddhead.next;
			evenhead=evenhead.next;
		}
		oddhead.next=even;
		return head;


	}
	void detectLoop() {
		Node1<T> slow;
		Node1<T> fast;
		slow = fast = start;
		boolean flag = false;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;//fast moves with twice the speed than slow.
			if(slow == fast) {
				System.out.println("Loop in LL Found");
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("No Loop in LL");
		}

	}
	Node1 MergeSortedLL(Node1<Integer> l1,Node1<Integer> l2) {
		Node1<Integer> l3=new Node1(-1);
		Node1<Integer> start=l3;
		while(l1!=null&&l2!=null) {
			if(l1.data<l2.data) {
				l3.next=l1;
				l1=l1.next;
			}
			else {
				l3.next=l2;
				l2=l2.next;
			}
			l3=l3.next;
		}
		if(l1!=null) {
			l3.next=l1;
		}
		else {
			l3.next=l2;
		}
		//	to print the  final list
		//	we added -1 to just set a beginning value, to avoid including
		//	-1 in the final list , just return start.next as it will
		//			point to the node after -1, which is our og list
		//	while(start.next!=null) {
		//		System.out.println(start.data);
		//		start=start.next;
		//	}
		return start.next;                  	
	}
	//	1->2->2->3 is input
	//	output should be 1->3
	void RemDupFromSortedLL2(Node1<T> head){
					
	}
	void findKthNode(int k){
		Node1<T> p;
		Node1<T> q;
		p= q = start;
		for(int i = 1; i<=k ; i++) {
			q = q.next;
		}
		while(q!=null) {
			p = p.next;
			q = q.next;
		}
		System.out.println("Kth node is "+p.data);
	}

	void deleteOnAnyPlace(T data) {
		Node1<T> temp;
		if(start == null) {
			System.out.println("Linked List is Empty !");
			return ;
		}
		if(start.data == data) {
			temp  = start;
			start = start.next;
			temp = null;
			return ;
		}
		temp = start;
		Node1<T> previous = start;
		while(temp!=null) {
			if(temp.data == data) {
				Node1<T> temp2 = temp;
				previous.next = temp.next;
				temp2= null;
			}
			previous = temp;
			temp = temp.next;
		}
	}

	// print
	void print() {
		Node1<T> temp  = start;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	// insert by Position
	void insertAtPosition(Node1<T> node, int position) {
		if(start == null) {
			start = node;
			return ;
		}
		// if position 0 
		if(position==0) {
			node.next = start;
			start = node;
			return ;
		}
		if(position>0) {
			Node1<T> temp = start;
			int i = 1;
			while(i<position) {
				temp = temp.next;
				i++;
			}
			node.next = temp.next;
			temp.next  = node;
		}
	}
	void DeleteAtIndex(int index) {
	int size=getSize();
	if(size==0) {
		throw new RuntimeException("List is blank");
		
	}
	if(index==0) {
		Node1<T> temp=start;
		start=start.next;
		temp=null;
	}
	else if(index>=size) {
		throw new RuntimeException("Index out of bounds");

	}
	
	else {
		Node1<T> temp = start;
		Node1<T> prev=start;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		prev=temp;
		temp=temp.next;
		prev.next=temp.next;
		temp=null;
	}
	
	}
	


	// insert at beg
	void insertAtBeg(Node1<T> node) {
		if(start==null) {	
			start = node ;
			return ;
		}
		node.next = start;
		start = node;
	}


	// insertAtEnd
	void insertAtEnd(Node1<T> node) {
		// no node present
		if(start==null) {
			tail = start = node;
			return ;
		}
		else {
			tail.next = node;
			tail = node;
		}
		//		// one node present
		//		if(start.next==null) {
		//			start.next = node;
		//			return ;
		//		}
		//		// more than one node present
		//		Node1<T> temp = start;
		//		while(temp.next!=null) {
		//			temp = temp.next;
		//		}
		//		temp.next = node;
	}
	Node1<T> getNodeAtIndex(int index){
		int size = getSize();
		if(size==0) {
			throw new RuntimeException("Linked List is Blank");
		}
		if(index<0 || index>=size) {
			throw new RuntimeException("Invalid Index");
		}

		Node1<T> temp = start;

		for(int i = 1; i<=index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	int getSize() {
		int size = 0;
		Node1<T> temp = start;
		while(temp!=null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	int getSize(Node1 start) {
		int size = 0;
		Node1<T> temp = start;
		while(temp!=null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	void reverseDataUsingStack(){
//		Stack<Integer> stack=new Stack<>();

	}
	void reverseData() {
		int left = 0;
		int right = getSize() - 1;
		while(left<right) {
			Node1<T> leftNode = getNodeAtIndex(left);
			Node1<T> rightNode = getNodeAtIndex(right);
			// Swapping
			T temp = leftNode.data;
			leftNode.data = rightNode.data;
			rightNode.data = temp;
			left++;
			right--;
		}
	}
	void reversePointers() {
		if(start== null) {
			System.out.println("Linked List is Empty Can't Reverse");
			return ;
		}
		if(start.next==null) {
			System.out.println("Only One Node Can't Reverse");
			return ;
		}
		// Maintain 3 Pointers 
		// 1 . Previous = start

		Node1<T> prev = start;
		// 2. Current  = prev.next
		Node1<T> current = prev.next;
		Node1<T> ahead = null;

		while(current!=null) {
			ahead = current.next;
			current.next = prev;
			prev = current;
			current = ahead;
		}
		Node1<T> temp = start;
		start = tail;
		tail = temp;
		tail.next = null;

	}
	Node1 reversePointers2(Node1<T> node) {	
		Node1<T> prev = null;
		// 2. Current  = prev.next
		Node1<T> current = node;
		Node1<T> ahead = null;

		while(current!=null) {
			ahead = current.next;
			current.next = prev;
			prev = current;
			current = ahead;
		}
		
		node=prev;
		Node1 temp=node;

return node;

	}
	
	Node1 reorderList(Node1 node){
	if(node==null||node.next==null||node.next.next==null) {
		return node;
	}
		Node1<T> slow=node;
		Node1<T> fast=node;
		
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}		
		
//		divide the linked list into two linked list each having a head.
		Node1<T> node1=node;
		Node1<T> node2=slow.next;
		slow.next=null;
		node2=reversePointers2(node2);
		Node1<T> finallist=new Node1(-1);
		Node1 node3=finallist;
		while(node1!=null) {
			if(node1!=null) {
				node3.next=node1;
				node3=node3.next;
				node1=node1.next;
			}
			if(node2!=null) {
				node3.next=node2;
				node3=node3.next;
				node2=node2.next;
			}
		}
		
//		while(finallist.next!=null) {
//			System.out.println(finallist.data);
//			finallist=finallist.next;
//		}
		return finallist.next;		
	}
	void testfunc(Node1 node) {
		Node1 temp=node;
		Node1 temp2=node;
		temp2.next=null;
		
	
		System.out.println("og data is "+node.data+" "+node.next.data);
		
	}
	boolean intersectionInTwoLL(Node1<T> l1 , Node1<T> l2) {
		Node1<T> start = l1;
		Node1<T> start2 = l2;
		int diff = 0;
		if(l1== null || l2 ==null) {
			return false;
		}
		if(l1.next==null && l2.next==null) {
			return false;
		}
		int n = getSize(start);
		System.out.println("n is "+n);
		int m = getSize(start2);
		System.out.println("m is "+m);

		if(n<m) {
			diff = m - n;
			start  = l2;
			start2 = l1;
		}
		else {
			diff = n - m;
			start = l1;
			start2 = l2;
		}
		for(int i = 1; i<=diff ; i++) {
			start = start.next;
		}
		while(start!=null && start2!=null) {
			if(start==start2) {
				System.out.println("Intersection Point ");
				return true;
			}
			start = start.next;
			start2 =start2.next;

		}
		return false;

	}
}
public class SinglyLLDemoBM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LinkedListOperations<Integer> opr = new LinkedListOperations<>();
		Node1<Integer> node1 = new Node1<>(1);
		opr.insertAtEnd(node1);
		opr.insertAtEnd(new Node1<Integer>(2));
		opr.insertAtEnd(new Node1<Integer>(3));
		opr.insertAtEnd(new Node1<Integer>(4));
		opr.insertAtEnd(new Node1<Integer>(5));

//		opr.OddEvenList(node1);
		LinkedListOperations<Integer> opr2 = new LinkedListOperations<>();

		Node1<Integer> node2 = new Node1<>(1);
		opr2.insertAtEnd(node2);
		opr2.insertAtEnd(new Node1<Integer>(3));
		opr2.insertAtEnd(new Node1<Integer>(5));

		LinkedListOperations<Integer> opr3 = new LinkedListOperations<>();
		Node1<Integer> node3 = new Node1<>(1);
		opr3.insertAtEnd(node3);
		opr3.insertAtEnd(new Node1<Integer>(2));
		opr3.insertAtEnd(new Node1<Integer>(7));
		opr3.insertAtEnd(new Node1<Integer>(9));


		//		opr.print();
		//        		opr2.print();
		//		opr3.print();
		opr3.MergeSortedLL(node2, node3);
		//	opr3.print();
		LinkedListOperations<Integer> opr4 = new LinkedListOperations<>();

		Node1<Integer> node4 = new Node1<>(1);
		opr4.insertAtEnd(node4);
		opr4.insertAtEnd(new Node1<Integer>(2));
		opr4.insertAtEnd(new Node1<Integer>(3));
		opr4.insertAtEnd(new Node1<Integer>(4));
		opr4.insertAtEnd(new Node1<Integer>(5));
//System.out.println(opr4.getNodeAtIndex(4).data);
//System.out.println(opr4.getSize());
//opr4.DeleteAtIndex(5);
//		opr4.reversePointers();
		opr4.reorderList(node4);
//		opr4.testfunc(node4);
				opr4.print();
//		opr4.RemDupFromSortedLL2(node4);

		//		LinkedListOperations<Integer> opr2 = new LinkedListOperations<>();
		//		Node1<Integer> node2 = new Node1<>(0);
		//		opr2.insertAtEnd(node2);
		//		opr2.insertAtEnd(new Node1<Integer>(1));
		//		opr2.tail.next  = opr.getNodeAtIndex(2);
		//		opr2.intersectionInTwoLL(opr.start, opr2.start);
		//		System.out.println("**************** After Reverse ********************");
		//opr.reverseData();
		//opr.reversePointers();
		//opr.print();


		//LinkedListOperations<String>  linkedList = new LinkedListOperations<>();
		//		Node1<String> node = new Node1<String>("amit");
		//		linkedList.insertAtEnd(node);
		//		linkedList.insertAtEnd(new Node1<String>("ram"));
		//		linkedList.insertAtEnd(new Node1<String>("shyam"));
		//		linkedList.insertAtEnd(new Node1<String>("sohan"));
		//		linkedList.insertAtBeg(new Node1<String>("tim"));
		//		int pos = 2;
		//		linkedList.insertAtPosition(new Node1<String>("rim"), pos -1);
		//		linkedList.print();
		//		linkedList.findKthNode(3);
		//		System.out.println("********************************");
		//		linkedList.deleteOnAnyPlace("shyam");

		//linkedList.print();


	}

}
