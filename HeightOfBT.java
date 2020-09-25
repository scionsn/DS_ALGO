class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}
public class HeightOfBT {
	 public static int maxDepth(Node root)
     {
//		 calc height of left and right subtree and the total height will be 1+ max(left,right), as root node will also be inc.
//		 whatever happens on a single node , happens on the entire tree. the result is just returned during calls.
		 if(root==null)
			 return 0;
		 int left=maxDepth(root.left);
		 int right=maxDepth(root.right);
		 return 1+Math.max(left,right);
     }
	public static void main(String[] args) {

	}

}
