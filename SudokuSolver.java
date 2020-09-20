
public class SudokuSolver {
	public static void solveSudoku(char[][] board) {
		solveSudokuhelper(board,board.length);
	}
	public static boolean solveSudokuhelper(char[][] board,int n) {
		int row=-1;
		int col=-1;
		boolean isempty=true;
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				if(board[i][j]=='.') {
					row=i;
					col=j;
					isempty=false;
					break;
				}
			}
//			this condition is used to break out of loop when it finds an empty space
			if(!isempty) {
				break;	
			}
		}
		//        this condition runs when all the matrix is filled
		if(isempty) {
			return true;
		}
		for(int i=1;i<=n;i++) {
			char value=(char)(i+'0');
			if(IsSafeToPut(board,row,col,value)) {
				board[row][col]=value;
				//        		after putting the value in one blank, we are looking for next blank to fill the space, but say if we dont find 
				//        		any such value then we backtrack to change the prev. val since it was giving us wrong soln,
				//        	and then proceed further.
				if(solveSudokuhelper(board,n)) {
					return true;
				}
				else {
					board[row][col]='.';
				}
			}

		}
		return false;
	}
	static boolean IsSafeToPut(char board[][],int row,int col,char value) {
		//	for rows
		for(int i=0;i<board.length;i++) {
			if(board[row][i]==value) {
				return false;
			}
		}
		//	for cols
		for(int i=0;i<board.length;i++) {
			if(board[i][col]==value) {
				return false;
			}
		}
		//	for submatrices
		int sqrt=(int)Math.sqrt(board.length);
		int rowbegin=row-row%sqrt;
		int colbegin=col-col%sqrt;
		for(int i=rowbegin;i<rowbegin+sqrt;i++) {
			for(int j=colbegin;j<colbegin+sqrt;j++) {
				if(board[i][j]==value)
					return false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][]= {
				{'.','2','3','.'},
				{'.','.','.',1},
				{'.',1,'.','.'},
				{2,4,1,'.'}};
		solveSudoku(arr);
	}

}
