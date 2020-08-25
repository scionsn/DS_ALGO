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
public class SumOfLeftLeaves {
	int sum=0;


	 public int sumOfLeftLeaves(TreeNode root) {
	        if(root==null) {
	        	
	        	return 0;
	        }
	       return helper(root);
	    }
	 int helper(TreeNode root) {
		 if(root==null)
			 return 0;
		 if(root.left==null&&root.right==null)
			 sum+=root.left.val;
		 helper(root.left);
		 helper(root.right);

		 
		 return sum;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
