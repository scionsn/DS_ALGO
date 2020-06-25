import java.util.HashMap;

//Given an array nums containing n + 1 integers where each 
//integer is between 1 and n (inclusive), prove that at
//least one duplicate number must exist. Assume that there
//is only one duplicate number, find the duplicate one.


public class FindDuplicateNumber {
	 public static int findDuplicate(int[] nums) {
		    HashMap<Integer,Integer> mp=new HashMap<>();
		    for(int i=0;i<nums.length;i++) {
		        mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
		    }
		    for(int key:mp.keySet()) {
		    	if(mp.get(key)>1) {
		    		return key;
		    	}
		    }
		    return -1;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,2,2};
		System.out.println(findDuplicate(arr));
	}

}
