import java.util.PriorityQueue;

class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
public class MergeKSortedLL {
	 Node mergeKList(Node[]a,int N)
	    {
		 PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(); 
         for(int i=0;i<N;i++){
           Node list=a[i];
           while(list!=null){
               minheap.add(list.data);
               list=list.next;
           }
       }
       Node res=new Node(-1);
       Node temp=res;
       while(!minheap.isEmpty()){
       temp.next=new Node(minheap.remove());
       temp=temp.next;
       }
       return res.next;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
