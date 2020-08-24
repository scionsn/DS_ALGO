  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class SortedArrToBST {
	 public static TreeNode sortedArrayToBST(int[] nums) {
return helper(nums,0,nums.length-1);
	    }
	public static TreeNode helper(int arr[],int i,int j) {
//		base case
		if(i>j)
			return null;
		 int mid=(i+j)/2;
		 TreeNode root=new TreeNode(arr[mid]);
//		 if i==j => that my array only has one element which i and j are pointing to ,so just return that.
		 if(i==j)
			 return root;
		 root.left=helper(arr,0,mid-1);
		 root.right=helper(arr,mid+1,arr.length-1);
		 return root;
		 
		 
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
