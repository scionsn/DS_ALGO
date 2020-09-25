import java.util.ArrayList;
import java.util.LinkedList;

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
public class DiagnolSum {
	public static ArrayList <Integer> diagonalSum(Node root) 
	{
		//		 all the diagnols begin from the left children of any node be it any diagnol number.
		//		 the right children are only part of the diagnol sum if they exist.
		//		 we only add the left child in  the queue as they would be only responsible for the diagnol.
		//		 we use a queue so that the node that enters first can be removed first since it makes a diagnol
		ArrayList<Integer> res=new ArrayList<>();
		if(root==null)
			return res ;
		LinkedList<Node> queue=new LinkedList<>();
		queue.add(root);
		while(true){
			int sum=0;
			int size=queue.size();
			if(size==0)
				break;
			while(size>0){
				Node temp= queue.removeFirst();
				while(temp!=null){
					sum+=temp.data;
					if(temp.left!=null){
						queue.addLast(temp.left);
					}
					temp=temp.right;
				}
				size--;
			}
			res.add(sum);
		}
		return res;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
