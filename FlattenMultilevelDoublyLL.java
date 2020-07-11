import java.util.Stack;

// Definition for a Node.
class Node {
	public int val;
	public Node prev;
	public Node next;
	public Node child;
};

public class FlattenMultilevelDoublyLL {
	public Node flatten(Node head) {
		Node curr=head;
		Node tail=head;
		Stack<Node> stack=new Stack<>();
		while(curr!=null){
			if(curr.child!=null){
				Node bacha=curr.child;
				if(curr.next!=null){
					stack.push(curr.next);
					curr.next.prev=null;
				}
				curr.next=bacha;
				bacha.prev=curr;
				curr.child=null;


			}
			tail=curr;
			curr=curr.next;
		}
		while(!stack.isEmpty()){
			curr= stack.pop();
			tail.next=curr;
			curr.prev=tail;
			while(curr!=null){
				tail=curr;
				curr=curr.next;
			}

		}
		return head;

	}
}

