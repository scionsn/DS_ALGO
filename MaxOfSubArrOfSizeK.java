import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
//imp question
//dequeue is used we have to remove and insert elements from both sides of a queue.
//a dequeue uses doubly linked list for its implementation
public class MaxOfSubArrOfSizeK {
	 static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
	    {
		   ArrayList<Integer> res=new ArrayList<>();
		   Deque<Integer> dqueue=new LinkedList<>();
		   for(int i=0;i<k;i++){
		       while(!dqueue.isEmpty()&&arr[dqueue.getLast()]<arr[i]){
		           dqueue.removeLast();
		       }
		       dqueue.addLast(i);
		   }
		   for(int i=k;i<n;i++){
		       res.add(arr[dqueue.getFirst()]);
		       while(!dqueue.isEmpty()&&dqueue.getFirst()<=i-k){
		           dqueue.removeFirst();
		       }
		       while(!dqueue.isEmpty()&&arr[dqueue.getLast()]<arr[i]){
		                   dqueue.removeLast();

		       }
		           dqueue.addLast(i);
		       
		   }
//		  to add the final element in the result which is left in dqueue.
		       res.add(arr[dqueue.getFirst()]);


		   return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
