//Given an integer array nums, find the contiguous subarray
//(containing at least one number) which has the largest sum and return its sum.
//		Input: [-2,1,-3,4,-1,2,1,-5,4],
//		Output: 6
//		Explanation: [4,-1,2,1] has the largest sum = 6.
//done using kadene's algorithm
		public class MaximumSubarray {
			 public static int maxSubArray(int[] nums) {
			        int meh=0;
			        int msf=Integer.MIN_VALUE;
			        int start=0;
			        int end=0;
			        for(int i=0;i<nums.length;i++) {
			        	meh+=nums[i];
			        	if(meh<nums[i]) {
			        		meh=nums[i];
			        	start=i;
			        	}
			        	
			        	if(msf<meh) {
			        		msf=meh;
			        	end=i;
			        	}
			        }
//			        printing the subarray
for(int i=start;i<=end;i++) {
	System.out.print(nums[i]+" ");
}
			        
			        
			        return msf;
			        
			    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,-1,-2,-2,4,-1,6};
		System.out.println("the sum is "+maxSubArray(arr));
		

	}

}
