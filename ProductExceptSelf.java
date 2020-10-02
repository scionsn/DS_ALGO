
public class ProductExceptSelf {
	public static int[] productExceptSelf(int nums[]) 
	{ 
		 int res[]=new int[nums.length];
	        int prod=1;
//	        traversing from left to right and updating the output arr.
	        for(int i=0;i<nums.length;i++){
	prod=prod*nums[i];
	            res[i]=prod;
	        
	        }
	        prod=1;
//	        traversing from right to left with product variable that maintains the total value of the product in the array
//	        the total value will be placed in the first position in the answer array as there are no elements to its left and
//	        only right elements and product contains the total anser of the right elements.
	        for(int i=nums.length-1;i>0;i--){
	            res[i]=res[i-1]*prod;
	            prod*=nums[i];
	        }
	res[0]=prod;
	        
	        
	        return res;
}
	public static void main() {
	// TODO Auto-generated method stub

}
}
