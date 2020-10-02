import java.util.Comparator;
import java.util.PriorityQueue;
//done using max heap
//can be done using quick select algo as well in lesser time
public class KthLargestInArray {
	  public int findKthLargest(int[] nums, int k) {
		  int n=nums.length;
		    PriorityQueue<Integer> heap=new PriorityQueue<>(  new Comparator<Integer> () {
		    public int compare(Integer a, Integer b) {
		       return b - a;
		    }
		  });
		for(int i=0;i<n;i++){
		    heap.add(nums[i]);
		}
		        for(int i=0;i<k-1;i++){
		            heap.poll();
		        }
		        return heap.peek();
		    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
