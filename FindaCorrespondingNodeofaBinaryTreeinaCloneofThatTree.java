import java.util.HashMap;
//use a hashmap to keep a track of the node in oog tree and corresponding node in cloned tree
public class FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree {
	 HashMap<TreeNode ,TreeNode> map=new HashMap<>();
	    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
	        mapping(original,cloned);
	        return map.get(target);
	        
	    }
	    public void mapping(TreeNode og,TreeNode clone){
	        if(og==null)
	            return;
	        map.put(og,clone);
	        mapping(og.left,clone.left);
	        mapping(og.right,clone.right);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
