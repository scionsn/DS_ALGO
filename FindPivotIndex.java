//keep a left array which keeps the sum of elements from left to right.
//then we find the sum from right to left if the value in left array and our sum matches ,
//then we have found our pivot index.
public class FindPivotIndex {
	  public int pivotIndex(int[] nums) {
		   if(nums.length==0)
	            return -1;
	        if(nums.length==1)
	            return 0;
	       int index=-1;
	        int sum=0;
	        int left[]=new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            left[i]=sum;
	        }
	        // for(int i:left){
	        //     System.out.println(i);
	        // }
	        sum=0;
	        for(int i=nums.length-1;i>=0;i--){
	            sum+=nums[i];
	             if(left[i]==sum) 
	            index=i;

	        }
	        return index;
	    
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
