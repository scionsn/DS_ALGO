class Node
{
	int data;
	Node next;
	Node(int d) {data = d; next = null; }
}
public class GetNthNodeFromEnd {
	int getNthFromLast(Node head, int n)
	{
		int length=getSize(head);
		if(n>length)
			return -1;
		Node temp=head;
		int position=length-n;
		int i=0;
		while(i<position){
			temp=temp.next;
			i++;
		}
		return temp.data;
	}
	int getSize(Node head){
		int size=0;
		Node temp=head;
		while(temp!=null){
			size++;
			temp=temp.next;
		}
		return size;
	}
	public static void main(String[] args) {		

	}

}
