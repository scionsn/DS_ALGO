import java.util.Arrays;

public class MergeTwoSortedArrays {
	  public void merge(int[] nums1, int m, int[] nums2, int n) {
		  int j=0;
	        for(int i=m;i<nums1.length&&j<nums2.length;i++){
	          nums1[i]=nums2[j];
	            j++;
	      }  
	        Arrays.sort(nums1);   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
