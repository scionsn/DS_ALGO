import java.util.HashSet;
import java.util.Set;

class Node
{
	int data;
	Node next;
	Node(int d) {
		data = d; 
		next = null;
	}
}
public class DeleteDupUnsortedLL {
	public Node removeDuplicates(Node head) 
	{
		//		hashset doesnt allow duplicate values. this can work for both sorted as well as unsorted LL
		Set<Integer> set=new HashSet<>();
		Node temp=head;
		Node helper=null;

		while(temp!=null){
			//			the add meth of hashset gives false if we are adding a value that already exists in set.
			if(!set.add(temp.data)){
				helper.next=temp.next;
			}
			else
				helper=temp;
			temp=temp.next;
		}
		return head;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
