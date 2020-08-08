//You are given a binary tree in which each node contains an integer value.
//
//Find the number of paths that sum to a given value.
//
//The path does not need to start or end at the root or a leaf,
//but it must go downwards (traveling only from parent nodes to child nodes).
//
//The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
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
public class PathSumIII {
	  int count=0;

	 public int pathSum(TreeNode root, int sum) {
		     if(root==null)
		         return 0;
		     
		        helper(root,sum);
		        pathSum(root.left,sum);
		        pathSum(root.right,sum);
		        return count;
		        
		    }
		   void helper(TreeNode root,int sum){
		       if(root==null)
		            return ;
		     
		   sum-=root.val;
		       if(sum==0)
		           count++;
		        helper(root.left,sum);
		        helper(root.right,sum);
		        }        
		    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
