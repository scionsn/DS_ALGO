// preorder traversal
public class SubtreeOfAnotherTree {
	 public boolean isSubtree(TreeNode s, TreeNode t) {
		 if(s==null)
             return false;
     if(helper(s,t)){
         return true;
     }
boolean res1= isSubtree(s.left,t);
 boolean res2=isSubtree(s.right,t);
    if(res1||res2)
        return true;
     return false;
     
 }
	 boolean helper(TreeNode s,TreeNode t){
//	     if both are null then we return true else false, since then our tree becomes diff.
	      if(s==null||t==null)
	         return s==null&&t==null;
	      if(s.val==t.val)
	     {
	          return (helper(s.left,t.left)&&helper(s.right,t.right));
	     }
	     return false;
	     
	       
	 } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
