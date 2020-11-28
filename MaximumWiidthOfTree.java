import java.util.LinkedList;

public class MaximumWiidthOfTree {
	 int getMaxWidth(Node root)
	    {
	        if(root==null)
	        return 0;
	int res=1;
	LinkedList<Node> queue=new LinkedList<>();
	queue.addLast(root);
	while(!queue.isEmpty()){
	    int size=queue.size();
	    res=Math.max(res,size);
	    for(int i=0;i<size;i++){
	        Node rem=queue.removeFirst();
	        if(rem.left!=null)
	        queue.addLast(rem.left);
	        if(rem.right!=null)
	        queue.addLast(rem.right);
	        
	    }
	}
	return res;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
