import java.util.HashMap;
import java.util.PriorityQueue;

//Given a non-empty array of integers, return the k most frequent elements.


public class TopKFreqElem {
	public static void topKFrequent(int[] nums, int k) {
		int res[]=new int[k];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
		PriorityQueue<Integer> q=new PriorityQueue<>((a,b)-> mp.get(b)-mp.get(a));
//		the heap works in descending order
        System.out.println(mp);
        for(int i:mp.keySet()) {
               	q.add(i);
        }
        int i=0;
       while(k>0) {
    	res[i++]=   q.poll();
    	k--;
       }
      for(int j:res) {
    	  System.out.println(j);
      }
        
    }
	public static void main(String[] args) {
		int arr[]= {1,1,1,2,2,3};
		topKFrequent(arr,2);
	}

}
