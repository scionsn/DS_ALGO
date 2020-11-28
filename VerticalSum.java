import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
 class Node{
int data;
Node left, right;
Node(int item)
{
    data = item;
    left = right = null;
}
}
class point{
		Node root;
			int x;
			int y;
			point(Node root,int x,int y){
				this.root=root;
				this.x=x;
				this.y=y;
			}
		}
public class VerticalSum {
		    public ArrayList <Integer> verticalSum(Node root) {
		         ArrayList <Integer> res=new ArrayList<>();
		if(root==null)
			        	return null;
			        TreeMap<Integer,PriorityQueue<point>> map=new TreeMap<>();
//			        treemap so that our x i.e our key remains sorted
			        Queue<point> queue=new LinkedList<>();
			        Comparator<point> comp=(a,b)->{
			        	if(a.y==b.y)
			        		return a.root.data-b.root.data;
			        	
			        	else
			        		return a.y-b.y;
			        };
			        queue.add(new point(root,0,0));
		while(!queue.isEmpty()) {
			point p1=queue.remove();
			root=p1.root;
			map.putIfAbsent(p1.x,new PriorityQueue<point>(comp) );
			map.get(p1.x).add(p1);
			if(root.left!=null) {
				queue.add(new point(root.left,p1.x-1,p1.y+1));
				
			}
			if(root.right!=null) {
				queue.add(new point(root.right,p1.x+1,p1.y+1));
				
			}
			
		}
		for(int key:map.keySet()) {
			PriorityQueue<point> heap=map.get(key);
			int sum=0;
				while(!heap.isEmpty()) {
				sum+=heap.poll().root.data;
			}
			res.add(sum);

		}


		return res;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
