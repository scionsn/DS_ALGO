
public class ReverseLL2 {
	 public ListNode reverseBetween(ListNode head, int m, int n) {
	        if(head==null)
	            return head;
	        if(head.next==null)
	            return head;
	        while(m<n){
	        ListNode left=getnode(head,m);
	        ListNode right=getnode(head,n);
	        int temp=left.val;
	            left.val=right.val;
	            right.val=temp;
	            m++;
	            n--;
	        
	        }
	        return head;
	        }
	    ListNode getnode(ListNode head,int i){
	        ListNode temp=head;
	        int j=1;
	        while(j!=i){
	            temp=temp.next;
	            j++;
	        }
	        return temp;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
