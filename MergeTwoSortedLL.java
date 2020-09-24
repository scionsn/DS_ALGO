class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
public class MergeTwoSortedLL {
	Node sortedMerge(Node headA, Node headB) {
	    Node res=new Node(-1);
	   Node temp3=res;
	    while(headA!=null&&headB!=null)
	    {
	        if(headA.data<headB.data){
	            temp3.next=headA;
	            headA=headA.next;
	        }
	        else{
	            temp3.next=headB;
	            headB=headB.next;
	        }
	        temp3=temp3.next;
	    }
	    if(headA==null)
	temp3.next=headB;

	else
	temp3.next=headA;

	    return res.next;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
