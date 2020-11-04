
public class InsertionSortList {
	  public ListNode insertionSortList(ListNode head) {
		     ListNode res=new ListNode(-1);
		        res.next=head;
		        ListNode prev=res, curr=head;
		        while(curr!=null){
		            if(curr.next!=null&&curr.next.val<curr.val){
		                while(prev.next!=null&&prev.next.val<curr.next.val)
		                    prev=prev.next;
		                ListNode temp=prev.next;
		                prev.next=curr.next;
		                curr.next=curr.next.next;
		                prev.next.next=temp;
		                prev=res;
		                    
		            }
		            else
		                curr=curr.next;
		        }
		        return res.next;
		    }
public static void main(String args[]) {
	
}
}
