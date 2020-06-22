import java.util.HashMap;
import java.util.LinkedList;
//it is an undirected and an unweighted graph ,to find shortest path we use bfs
class knight{
	int x;
	int y;
	int steps;
	public knight(int x,int y,int steps) {
		this.x=x;
		this.y=y;
		this.steps=steps;
	}
	public knight(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
public class MinStepsKnight {
public static int knightpath(knight src,knight dest,int n) {
	HashMap<knight,Boolean> visited=new HashMap<>();
	LinkedList<knight> queue=new LinkedList<>();
	int row[]= {2, 2, -2, -2, 1, 1, -1, -1};
	int col[]= {-1, 1, 1, -1, 2, -2, 2, -2 };
	queue.addLast(src);
	while(!queue.isEmpty()) {
		knight p=queue.removeFirst();
	    int x=p.x;
	    int y=p.y;
	    int steps=p.steps;
	    if(x==dest.x&&y==dest.y) {
	    	return steps;
	    }
	    if(!visited.containsKey(p)) {
	    	visited.put(p,true);
//	    	we mov the loop 8 times because the 
//	    	row and col to which the knight can mov have 8 values.
	    	for(int i=0;i<8;i++) {
	    		int x2=x+row[i];
	    		int y2=y+col[i];
	    		
	    		knight p2=new knight(x2,y2,steps+1);
	    		if(!(x2<0||y2<0||x2>=n||y2>=n)) {
	    			queue.addLast(p2);
	    		}
	    	}
	    	
	    }
	}

	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;//this specifies an n*n matrix
		knight ob1=new knight(1,5);
		knight ob2=new knight(14,6);
		long start=System.currentTimeMillis();
	 System.out.println("min number of steps are: "+knightpath(ob1,ob2,n));
	 long end=System.currentTimeMillis();
	 System.out.println(end-start);
	
		

		
	}

}
