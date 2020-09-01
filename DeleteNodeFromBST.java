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
public class DeleteNodeFromBST {
	 public TreeNode deleteNode(TreeNode root, int key) {
         if(root==null)
	        return root;
	        if(key<root.val){
	        root.left=	deleteNode(root.left,key);
            }
	        else if(key>root.val){
	        	root.right=deleteNode(root.right,key);
            }
        else{
	        if(root.left==null&&root.right==null)
	        	return null;
	        else if(root.left!=null&&root.right==null)
	        	return root.left;
	       else if(root.left==null&&root.right!=null)
	        	return root.right;
	       else{
	        	int maxleft=maxvalue(root.left);
               System.out.println(maxleft);
	        	root.val=maxleft;
                              // System.out.println(maxleft==root.left.val);
	        	root.left=deleteNode(root.left,maxleft);
	        }
        }
	        return root;
	        
	        }
	 static  int maxvalue(TreeNode root ) {
		 if(root.right==null)
			 return root.val;
		 return maxvalue(root.right);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
