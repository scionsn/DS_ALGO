//no of islands is similar to this question
public class SurroundedRegions {
public  void solve(char[][] board) {
	if(board.length==0)
		return;
//	loop for boundaries on x axis i.e first and last row
        for(int i=0;i<board[0].length;i++) {
     if(board[0][i]=='O') {
dfs(0,i,board);
}
     if(board[board.length-1][i]=='O') {
    	 dfs(board.length-1,i,board);

     }
        }
//        loop for boundary on y axis i.e first and last col
        for(int j=0;j<board.length;j++) {
     if(board[j][0]=='O') {
dfs(0,j,board);
}
     if(board[j][board.length-1]=='O') {
    	 dfs(board.length-1,j,board);

     }
        }
//        loop for complete array
        for(int i=0;i<board.length;i++) {
   for(int j=0;j<board[0].length;j++) {
	    if(board[i][j]=='$') {
		   board[i][j]='O';
	   }
	    else if(board[i][j]=='O') {
		   board[i][j]='X'
;	   }
	   
   }
        }
        return;
//        for(char i[]:board) {
//        	System.out.println(i[0]+" "+i[1]+" "+i[2]+" "+i[3]);
//        }
    }
    
    
void dfs(int row,int col,char grid[][]){
	if(row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]!='O') {
		return;
	}
grid[row][col]='$';
//recursive calls for traversing in four directions
dfs(row+1,col,grid);
dfs(row-1,col,grid);
dfs(row,col+1,grid);
dfs(row,col-1,grid);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i[][]= {{'X','X','X','X'},
				     {'X','O','O','X'},
				     {'X','X','O','X'},
				     {'X','O','X','X'}};
		SurroundedRegions ob=new SurroundedRegions();
		ob.solve(i);
		System.out.println( );
		for(char c[]:i) {
			System.out.println(c[0]+" "+c[1]+" "+c[2]+" "+c[3]);
		}

	}

}
