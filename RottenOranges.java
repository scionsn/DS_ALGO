	import java.util.LinkedList;
//in this question we have to give the time taken(in min) for the oranges to rot.
	class RPair{
		int row;
		int col;
		RPair(int row, int col){
			this.row= row;
			this.col = col;
		}
	}
public  class RottenOranges {

		
	
		public static int orangesRotting(int[][] grid) {
	        int timeTaken =-1;
	        int rows = grid.length;
	        int cols = grid[0].length;
	        int freshOranges = 0;
	        LinkedList<RPair> queue = new LinkedList<>();
	        for(int i = 0 ; i<rows; i++) {
	        	for(int  j = 0 ; j<cols; j++) {
	        		// Store the Rotton Oranges in the Queue
	        		if(grid[i][j]==2) {
	        			queue.addLast(new RPair(i, j));
	        		}
	        		else
	        		if(grid[i][j]==1) {	
	        			freshOranges++;
	        		}
	        	}
	        }
	        int up [] = {-1,0};
	        int right [] = {0,1};
	        int down[] = {1,0};
	        int left [] = {0,-1};
	        int directions[][] = {up, right, down, left};
	        queue.addLast(new RPair(-1, -1));
//	        -1,-1 acts as a delimiter that indicates the end of a position. 
//	        it is like a fullstop.
	        while(!queue.isEmpty()) {
	        	RPair pair = queue.removeFirst();
	        	if(pair.row==-1) {
	        		timeTaken++;
	        		if(!queue.isEmpty()) {
	        			queue.addLast(new RPair(-1, -1));
	        		}
	        	}
	        	// Pair Rotton Orange Location (Row, Col)
	        	for(int direction = 0; direction<directions.length; direction++) {
	        		int neighbourRow = pair.row + directions[direction][0];
	        		int neighbourCol = pair.col + directions[direction][1];
//	        		the below if condition handles the corner cases.
	        		if((rows>neighbourRow && neighbourRow>=0) &&
	        				(cols>neighbourCol && neighbourCol>=0)) {
	        			if(grid[neighbourRow][neighbourCol]==1) {
	        				grid[neighbourRow][neighbourCol]=2;
	        				freshOranges--;
	        				queue.addLast(new RPair(neighbourRow, neighbourCol));
	        			}
	        		}
	        	}
	        	
	        }
	        return freshOranges==0?timeTaken:-1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {{2,1,1},{1,1,0},{0,1,1}};
		int result = orangesRotting(grid);
		System.out.println(result);

	}
}

