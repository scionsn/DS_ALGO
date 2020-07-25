//You are a professional robber planning to rob houses along a street. 
//Each house has a certain amount of money stashed, the only constraint
//stopping you from robbing each of them is that adjacent houses have 
//security system connected and it will automatically contact the
//police if two adjacent houses were broken into on the same night.

//Given a list of non-negative integers representing the amount of 
//money of each house, determine the maximum amount of money
//you can rob tonight without alerting the police.
//google interview ques
public class HouseRobber {
	public static int recur(int[] nums) {
		int dp[]=new int[nums.length];
	return helper(0,nums,dp);
    }
	public static int helper(int current,int[] arr,int[] dp) {
		if(current>=arr.length)
			return 0;
		if(dp[current]!=0)
			return dp[current];
		int include=arr[current]+helper(current+2,arr,dp);
		int exclude=helper(current+1,arr,dp);
		dp[current]=Math.max(include,exclude);
		System.out.println(dp[current]);
		return dp[current];
	}
	public static int dp(int nums[]) {
		  if(nums.length==0)
	            return 0;
	        if(nums.length==1)
	            return nums[0];
	         if(nums.length==2)
	            return Math.max(nums[0],nums[1]);
		int dp[]=new int[nums.length];
//		we created an array with length equal to nums since v dont want xtra calculation after the last index.
		dp[0]=nums[0];
		dp[1]=Math.max(nums[0], nums[1]);
		for(int i=2;i<dp.length;i++) {
			dp[i]=Math.max(dp[i-1], nums[i]+dp[i-2]);
			
		}
		return dp[nums.length-1];
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,7,9,3,1};
//System.out.println(recur(arr))
System.out.println(dp(arr));
	}

}
