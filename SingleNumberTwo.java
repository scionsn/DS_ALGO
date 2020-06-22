import java.util.HashMap;

//public claGiven a non-empty array of integers, 
//every element appears three times except for one,
//which appears exactly once. Find that single one.

class SingleNumberTwo {
	 public static int singleNumber(int[] nums) {
		    HashMap<Integer,Integer> mp=new HashMap<>();
for(int i=0;i<nums.length;i++) {
	mp.put(nums[i],mp.getOrDefault(nums[i], 0)+1);
}
for(int i:mp.keySet()){
	if(mp.get(i)==1) {
return i;
}
}
return -1;

	 }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,1,0,1,0,1,99};
		System.out.println(singleNumber(arr));
	}

}
