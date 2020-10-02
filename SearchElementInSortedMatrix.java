//Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
////
//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.
//we always check  the elem at last pos. of each row, if it is greater than target then col-- else row++
public class SearchElementInSortedMatrix {
		 public boolean searchMatrix(int[][] matrix, int target) {
		        if(matrix.length==0||matrix[0].length==0)
		            return false;
		    int i=0,j=matrix[0].length-1;
		        
		        while(i<matrix.length&&j>=0){
		            if(matrix[i][j]==target)
		                return true;
		          else  if(matrix[i][j]>target)
		                j--;
		else
		    i++;
		        }
		    return false;
		    }   
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
