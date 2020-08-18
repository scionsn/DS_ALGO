import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
class point{
	TreeNode root;
	int x;
	int y;
	point(TreeNode root,int x,int y){
		this.root=root;
		this.x=x;
		this.y=y;
	}
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      } 
      }
public class VerticalTraversalBT {
	 public List<List<Integer>> verticalTraversal(TreeNode root) {
	        List<List<Integer>> res=new ArrayList<>();
	        if(root==null)
	        	return null;
	        TreeMap<Integer,PriorityQueue<point>> map=new TreeMap<>();
//	        treemap so that our x i.e our key remains sorted
	        Queue<point> queue=new LinkedList<>();
	        Comparator<point> comp=(a,b)->{
	        	if(a.y==b.y)
	        		return a.root.val-b.root.val;
	        	
	        	else
	        		return b.y-a.y;
	        };
	        queue.add(new point(root,0,0));
while(!queue.isEmpty()) {
	point p1=queue.remove();
	root=p1.root;
	map.putIfAbsent(p1.x,new PriorityQueue<point>(comp) );
	map.get(p1.x).add(p1);
	if(root.left!=null) {
		queue.add(new point(root.left,p1.x-1,p1.y-1));
		
	}
	if(root.right!=null) {
		queue.add(new point(root.right,p1.x+1,p1.y-1));
		
	}
	
}
for(int key:map.keySet()) {
	PriorityQueue<point> heap=map.get(key);
	List<Integer> sublist=new ArrayList<>();
	while(!heap.isEmpty()) {
		sublist.add(heap.poll().root.val);
	}
	res.add(sublist);
}


return res;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
