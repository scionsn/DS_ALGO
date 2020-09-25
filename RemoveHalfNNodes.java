class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class RemoveHalfNNodes {
	 public static Node RemoveHalfNodes(Node root)
	    {
//		 half nodes are nodes with only a single child
//		 we do postorder traversal since we need to check the left and right nodes only. so we do this
//		 starting from bottom and return the result to the root node.
//		 leaf nodes are included as they are not half node.
	if(root==null)
	return null;
	root.left=RemoveHalfNodes(root.left);
	root.right=RemoveHalfNodes(root.right);
//for leaf nodes
	if(root.right==null&&root.left==null)
	return root;
//	if it is a half node whose left child is null then we have to return its right child
	 if(root.left==null)
	return root.right;

	if(root.right==null)
	    return root.left;

	return root;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
