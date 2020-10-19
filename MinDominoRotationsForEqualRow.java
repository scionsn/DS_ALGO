//imp google question
public class MinDominoRotationsForEqualRow {
//	we always check from the first value of the two arrays since
// we need to check if either of the two values can make an entire row
//	as for an entire row we must have these values too .
	 public int minDominoRotations(int[] A, int[] B) {
	        int minswaps=Math.min(numofswaps(A[0],A,B),numofswaps(B[0],A,B));
	        minswaps=Math.min(minswaps, numofswaps(A[0],B,A));
	        minswaps=Math.min(minswaps,numofswaps(B[0],B,A));
	        return minswaps==Integer.MAX_VALUE?-1:minswaps;
	    }
	static int numofswaps(int target,int a[],int []b) {
		int numswaps=0;
		for(int i=0;i<a.length;i++) {
//			if both the elements in array dont match target,that means that 
//			swaps isnt possible, therefore we cant have a row of all equal values
//			so we return a max value as it is
			if(a[i]!=target&&b[i]!=target) {
				return Integer.MAX_VALUE;
			}
			else if(a[i]!=target) {
				numswaps++;
			}
		}
		return numswaps;
	}
	public static void main(String[] args) {

	}

}
