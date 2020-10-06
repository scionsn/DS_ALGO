
import static java.lang.Integer.max;
//here we take the maximum of simple kadens and the special kadens for circular arr
//circular array is calculated by negating the entire arr and then calc its max which is
//actually the min for original arr and then subtract from the total. 
public class MaxSumCircularArr {
	  private static int helper(int[] arr){
	        int msf=Integer.MIN_VALUE;
	        int mth=0;
	        for(int i=0;i<arr.length;i++){
	            mth+=arr[i];
	            if(arr[i]>mth)
	                mth=arr[i];
	            if(msf<mth)
	                msf=mth;
	        
	        }
	        return msf;
	    }
	    public static int maxSubarraySumCircular(int[] A) {
	        int x=helper(A);
	        int sum=0;
	        for(int i=0;i<A.length;i++){
	            sum+=A[i];
	            A[i]*=-1;
	        }
	        int neg=helper(A);
	        neg=-neg;
	        int circular=sum-neg;
//	        we return x since there might be a case of all negative integers.
	if(circular==0)
	    return x;
	        return Math.max(circular,x);
	        }
	  
    public static void main(String[] args) {
        int[] arr={-2,-2,-3,-4};
        int size=arr.length;
       int res= maxSubarraySumCircular(arr);
        System.out.println(res);
    }
}
