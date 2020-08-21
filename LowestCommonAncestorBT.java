//Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
//
//According to the definition of LCA on Wikipedia: “The lowest common ancestor is 
//defined between two nodes p and q as the lowest node in T that has both p and q 
//as descendants (where we allow a node to be a descendant of itself).”

//
//All of the nodes' values will be unique.
//p and q are different and both values will exist in the binary tree.

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class LowestCommonAncestorBT {

	  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	      if(root==null)
	    	  return root;
//	      if p or q is my root then obv. it will be the lowest common ancestor as either of p or q will be the child of  it.
	      if(p==root||q==root) {
	    	  return root;
	      }
	      TreeNode left=lowestCommonAncestor(root.left,p,q);
	      TreeNode right=lowestCommonAncestor(root.right,p,q);
	      if(left!=null&&right!=null) {
	    	  return root;
	      }
	      else if(left!=null)
	    	  return left;
	      return right;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
