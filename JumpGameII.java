//can be solved using greedy or dp, though greedy is shorter

//Given an array of non-negative integers,
//you are initially positioned at the first index of the array.
//
//Each element in the array represents
//your maximum jump length at that position.
//
//Your goal is to reach the last index
//in the minimum number of jumps.
public class JumpGameII {
//public static int rec(int[] nums) {
//        return helper(0,nums);
//    }
//static int helper(int index,int nums[]) {
//	if(index>=nums.length)
//return 0;
//	int range=index+nums[index];
//	if(range>=nums.length) {
//		return 1;
//	}
//	for(int i=index+1;i<range;i++) {
//		int jumps=helper(i,nums);
//		
//		
//	}	
//}
static int dp(int nums[]) {
	if(nums.length==0)
		return 0;
	int dp[]=new int[nums.length];
	dp[0]=0;
	int j=0;
	for(int i=1;i<dp.length&&j<dp.length;i++) {
		if(nums[j]+j>i) {
			dp[i]=Math.min(dp[i],dp[j]+1);
		}
		j++;
		
	}
	return dp[nums.length-1];
}
public int greedy(int nums[]) {
	 
    int reach=0,pos=0,steps=0;
    for(int i=0;i<nums.length-1;i++){
        reach=Math.max(reach,i+nums[i]);
if(pos==i){
pos=reach;
steps++;
}
    }
return steps;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1,1,4};
//		System.out.println(rec(arr));
		System.out.println(dp(arr));


	}

}
