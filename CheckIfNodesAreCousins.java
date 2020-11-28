import java.util.LinkedList;

public boolean isCousins(TreeNode root, int x, int y) {
	if(root==null)
		return false;
	LinkedList<TreeNode> queue=new LinkedList<>();
	queue.addLast(root);
	while(!queue.isEmpty()){
		int size=queue.size();
		boolean x_exists=false;
		boolean y_exists=false;
		for(int i=0;i<size;i++){
			TreeNode rem=queue.removeFirst();
			if(rem.val==x)
				x_exists=true;
			if(rem.val==y)
				y_exists=true;
			if(rem.left!=null&&rem.right!=null){
				if((rem.left.val==x&&rem.right.val==y)||(rem.left.val==y&&rem.right.val==x))
					return false;
			}
			if(rem.left!=null)
				queue.addLast(rem.left);
			if(rem.right!=null)
				queue.addLast(rem.right);


		}
		if(x_exists&&y_exists)
			return true;
	}
	return false;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub

}

}
