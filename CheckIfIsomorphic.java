class Node{
	Node left;
	Node right;
int data;
Node(int data){
	this.data=data;
	left=null;
	right=null;
}
}
public class CheckIfIsomorphic {
	 boolean isIsomorphic(Node root1, Node root2)  
	    { 
//		 if the two trees are exactly same or if they are mirror images of each other , then they are isomorphic.
		 if(root1==null&&root2==null)
			 return true;
//		 if only one root is null
			 if(root1==null||root2==null)
			 return false;
			 if(root1.data!=root2.data)
			 return false;
			 return (isIsomorphic(root1.left,root2.left)&&isIsomorphic(root1.right,root2.right))
			 ||(isIsomorphic(root1.left,root2.right)&&isIsomorphic(root1.right,root2.left));

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
