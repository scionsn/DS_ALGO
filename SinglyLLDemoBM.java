package ds_algo;

import java.util.Stack;

class Node<T>{
	T data;
	Node<T> next;
	//boolean isVisited;
	Node(T data){
		this.data = data;
		//this.next = null;
	}
	@Override
	public String toString() {
		return "Node "+data+" Ref "+next;
	}
}
class LinkedListOperations<T>{
	Node<T> start;
	Node<T> tail;
	
	void detectLoop() {
		Node<T> slow;
		Node<T> fast;
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
	void findKthNode(int k){
		Node<T> p;
		Node<T> q;
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
		Node<T> temp;
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
		Node<T> previous = start;
		while(temp.next!=null) {
			if(temp.data == data) {
				Node<T> temp2 = temp;
				previous.next = temp.next;
				temp2= null;
			}
			previous = temp;
			temp = temp.next;
		}
	}
	
	// print
	void print() {
		Node<T> temp  = start;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	// insert by Position
	void insertAtPosition(Node<T> node, int position) {
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
			Node<T> temp = start;
			int i = 1;
			while(i<position) {
				temp = temp.next;
				i++;
			}
			node.next = temp.next;
			temp.next  = node;
		}
	}
	
	
	// insert at beg
	void insertAtBeg(Node<T> node) {
		if(start==null) {	
			start = node ;
			return ;
		}
		node.next = start;
		start = node;
	}
	
	
	// insertAtEnd
	void insertAtEnd(Node<T> node) {
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
//		Node<T> temp = start;
//		while(temp.next!=null) {
//			temp = temp.next;
//		}
//		temp.next = node;
	}
	Node<T> getNodeAtIndex(int index){
		int size = getSize();
		if(size==0) {
			throw new RuntimeException("Linked List is Blank");
		}
		if(index<0 || index>=size) {
			throw new RuntimeException("Invalid Index");
		}
		
		Node<T> temp = start;
		
		for(int i = 1; i<=index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	int getSize() {
		int size = 0;
		Node<T> temp = start;
		while(temp!=null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	int getSize(Node start) {
		int size = 0;
		Node<T> temp = start;
		while(temp!=null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
        void reverseDataUsingStack(){
            Stack<Integer> stack=new Stack<>();
            
        }
	void reverseData() {
		int left = 0;
		int right = getSize() - 1;
		while(left<right) {
			Node<T> leftNode = getNodeAtIndex(left);
			Node<T> rightNode = getNodeAtIndex(right);
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
		
		Node<T> prev = start;
		// 2. Current  = prev.next
		Node<T> current = prev.next;
		Node<T> ahead = null;
		
		while(current!=null) {
			 ahead = current.next;
			 current.next = prev;
			 prev = current;
			 current = ahead;
		}
		Node<T> temp = start;
		start = tail;
		tail = temp;
		tail.next = null;
		
	}
	boolean intersectionInTwoLL(Node<T> l1 , Node<T> l2) {
		Node<T> start = l1;
		Node<T> start2 = l2;
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
		Node<Integer> node1 = new Node<>(2);
		opr.insertAtEnd(node1);
		opr.insertAtEnd(new Node<Integer>(3));
		opr.insertAtEnd(new Node<Integer>(5));
		opr.insertAtEnd(new Node<Integer>(7));
		opr.print();
		
		LinkedListOperations<Integer> opr2 = new LinkedListOperations<>();
		Node<Integer> node2 = new Node<>(0);
		opr2.insertAtEnd(node2);
		opr2.insertAtEnd(new Node<Integer>(1));
		opr2.tail.next  = opr.getNodeAtIndex(2);
		opr2.intersectionInTwoLL(opr.start, opr2.start);
		System.out.println("**************** After Reverse ********************");
		//opr.reverseData();
		//opr.reversePointers();
		//opr.print();
		
		
		//LinkedListOperations<String>  linkedList = new LinkedListOperations<>();
//		Node<String> node = new Node<String>("amit");
//		linkedList.insertAtEnd(node);
//		linkedList.insertAtEnd(new Node<String>("ram"));
//		linkedList.insertAtEnd(new Node<String>("shyam"));
//		linkedList.insertAtEnd(new Node<String>("sohan"));
//		linkedList.insertAtBeg(new Node<String>("tim"));
//		int pos = 2;
//		linkedList.insertAtPosition(new Node<String>("rim"), pos -1);
//		linkedList.print();
//		linkedList.findKthNode(3);
//		System.out.println("********************************");
//		linkedList.deleteOnAnyPlace("shyam");
		
		//linkedList.print();
		

	}

}
