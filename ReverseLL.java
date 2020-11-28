
public class ReverseLL {
	 public ListNode reverseList(ListNode head) {
         
		 ListNode prev=null;
		 ListNode curr=head;
		 ListNode ahead=null;
		 while(curr!=null){
		     ahead=curr.next;
		     curr.next=prev;
		     prev=curr;
		     curr=ahead;
		 }
		 return prev;
		     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
