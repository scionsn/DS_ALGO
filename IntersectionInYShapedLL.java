 class ListNode {
   int val;
    ListNode next;
    ListNode(int d)  { val = d;  next = null; }
}
public class IntersectionInYShapedLL {
	ListNode intersectPoint(ListNode headA, ListNode headB)
	{
		 ListNode first=headA;
	        ListNode sec=headB;
	       int len1=getSize(headA);
	        int len2=getSize(headB);
	    if(len1>len2){
	        int diff=len1-len2;
	    for(int i=0;i<diff;i++){
	        first=first.next;
	    }
	    }
	        else{
	            int diff=len2-len1;
	            for(int i=0;i<diff;i++){
	                sec=sec.next;
	            }
	        }
	        while(first!=sec){
	            first=first.next;
	            sec=sec.next;
	        }
	        return first;        
	        
	    }
	        private static int getSize(ListNode head){
	            int size=0;
	            ListNode temp=head;
	            while(temp!=null){
	                temp=temp.next;
	                size++;
	            }
	            return size;
	            
	        }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
