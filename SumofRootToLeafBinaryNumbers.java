//Given a binary tree, each node has value 0 or 1. 
//Each root-to-leaf path represents a binary number
//starting with the most significant bit.  For example, 
//if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
//
//For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
//
//Return the sum of these numbers.




//EXPLANATION:-
//Every level of the tree describes the weight as we do in the Base-10.
//For example, 123 can be represented as 123 = 1 * 100 + 2 * 10 + 3
//Similarly
//
//          1 ----- Level 0 represents weight 2 raise to power 0
//         / \
//       0    1 ----- Level 1 represents weight 2 raise to power 1
//     /  \
//    1    0 ----- Level 2 represents weight 2 raise to power 2
//Root to Leaf Paths - 1 0 1 = 1 * (2^2) + 0 * (2^1) + 1 * (2^0) = 4 + 0 + 1 = 5,
//Similarly for 1 0 0 and 1 1.
//
//In Short words, with every level down, we are shifting bits to the left and thereby increasing their weight by k (where k is the base in which we're in, in this case k = 2)
//
//For Path -> 1 0 1
//At Level 0, curr = 0 + 1 = 1
//At Level 1, curr = (0 + 1) * 2 + 0 = 2
//At Level 2, curr = ((0 + 1) * 2 + 0) * 2 + 1 = 2 * 2 + 1 = 5
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
public class SumofRootToLeafBinaryNumbers {
	static int total=0;
public static int sumRootToLeaf(TreeNode root) {
	   if(root==null)
           return 0;
         helper(root,0);
   	        return total;
   }
     public static void helper(TreeNode root,int sum){
   	        if(root==null){
   	            return;
   	        }
   	    sum=sum*2+root.val;
   	        if(root.left==null&&root.right==null){
   	            total+=sum;
   	            return;
   	        }
   	        helper(root.left,sum);
   	        helper(root.right,sum);
   	        
   	    }    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.parseInt(String.valueOf(1),2));

	}

}
