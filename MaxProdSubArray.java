
public class MaxProdSubArray {
	 public static int maxProduct(int[] nums) {
int product=1;
int maxprod=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++) {
	product*=nums[i];
	if(product>maxprod)
		maxprod=Math.max(product, maxprod);
//	we make product 1 when it gets zero to take into consideration if other number greater than zero exists, in the array
//	because if we muktiply any number with zero the product gets zero only.
	if(product==0)
		product=1;
}
product=1;
for(int i=nums.length-1;i>=0;i--) {
	product*=nums[i];
	if(product>maxprod)
		maxprod=Math.max(product, maxprod);
	if(product==0)
		product=1;
}
return maxprod;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {-3,-1,0,-2,6};
System.out.println(maxProduct(arr));
	}

}
