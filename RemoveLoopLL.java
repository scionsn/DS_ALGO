class Node
{
    int data;
    Node next;
}

public class RemoveLoopLL {
	 public static void removeLoop(Node head){
		 Node fast=head;
		 Node slow=head;
		 while(fast!=null&&fast.next!=null){
		     fast=fast.next.next;
		     slow=slow.next;
		     if(fast==slow){
		         removeloop(slow,head);
		     }
		 }
		     }
		    static  void removeloop(Node ptr,Node head){
		     int res=1;
		     Node temp=ptr;
		     while(temp.next!=ptr){
		         temp=temp.next;
		         res++;
		     }
		   Node ptr1=head;
		   Node ptr2=head;
		 //   ptr2 is res steps ahead of head
		   for(int i=0;i<res;i++){
		       ptr2=ptr2.next;
		   }
		 //   this loop gives us the starting node of the loop in ll
		   while(ptr2!=ptr1){
		       ptr2=ptr2.next;
		       ptr1=ptr1.next;
		   }
		 //   moving ptr2 to the last node of the loop
		   while(ptr2.next!=ptr1){
		       ptr2=ptr2.next;
		   }
		   ptr2.next=null;
		  
		     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
