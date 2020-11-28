
public class MaximumNodeLevel {
	  public static int maxNodeLevel(Node root)
	    {
	if(root==null)
	        return 0;
	int max=Integer.MIN_VALUE,lvl=0,res=0;
	LinkedList<Node> queue=new LinkedList<>();
	queue.addLast(root);
	while(!queue.isEmpty()){
	    int size=queue.size();
	    if(size>max){
	        max=size;
	        res=lvl;
	    }
	        for(int i=0;i<size;i++){
	        Node rem=queue.removeFirst();
	        if(rem.left!=null)
	        queue.addLast(rem.left);
	        if(rem.right!=null)
	        queue.addLast(rem.right);
	    }
	    lvl++;
	}
	return res;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
