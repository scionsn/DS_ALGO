class Node
{
    int data;
    Node left, right;
   Node(int item)    
   {
        data = item;
        left = right = null;
    }
}
public class ConvertToItsMirrorTree {
	  void mirror(Node node)
	    {
	if(node==null)
	return ;
	if(node.left!=null||node.right!=null){
	Node temp=node.left;
	node.left=node.right;
	node.right=temp;
	}
	mirror(node.left);
	mirror(node.right);

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
