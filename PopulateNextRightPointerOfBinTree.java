import java.util.LinkedList;
import java.util.Queue;

class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
}
public class PopulateNextRightPointerOfBinTree {
	public Node connect(Node root) {
		  if(root==null)
	            return root;
		Queue<Node> q1=new LinkedList<>();
		Queue<Node> q2=new LinkedList<>();
		q1.add(root);
		while(!q1.isEmpty()||!q2.isEmpty()) {
			while(!q1.isEmpty()) {
				Node rem=q1.remove();
				if(!q1.isEmpty())
					rem.next=q1.peek();
				else
					rem.next=null;
				if(rem.left!=null) 
					q2.add(rem.left);
				if(rem.right!=null)
					q2.add(rem.right);
			}
			while(!q2.isEmpty()) {
				Node rem=q2.remove();
				if(!q2.isEmpty())
					rem.next=q2.peek();
				else
					rem.next=null;
				if(rem.left!=null)
					q1.add(rem.left);
				if(rem.right!=null)
					q1.add(rem.right);    
			}
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
