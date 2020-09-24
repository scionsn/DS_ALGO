class Node
{
	int data;
	Node next;
	Node(int d) {
		data = d; 
		next = null;
	}
}
//create a parent node 0 to the head node . and then check if its next and second next are not null and after 
//swapping , move two steps ahead i.e now on the end of the swapped nodes and repeat
public class SwapNodesInPairs {
	public Node pairwiseSwap(Node head)
	{
		Node temp=new Node(0);
		temp.next=head;
		Node curr=temp;
		while(curr.next!=null&&curr.next.next!=null){
			Node first=curr.next;
			Node sec=curr.next.next;
			first.next=sec.next;
			curr.next=sec;
			curr.next.next=first;
			curr=curr.next.next;
		}
		return temp.next;
	}
	public static void main(String[] args) {

	}

}
