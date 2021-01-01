import java.util.HashMap;

public class CheckArrayFormationThroughConcatenation {
	  public boolean canFormArray(int[] arr, int[][] pieces) {
//		  we store the first elem of pieces array as key and the whole subsequent array as the value
//		  we iterate thru the arr and compare if the key matches the elem in the array and if it does
//		  then we check if the subarray in the pieces array are in the same order as the 1d array.
//		  this is as simple as flatenning a 2d array and comparing to the 1d array
	        HashMap<Integer , int[]> map=new HashMap<>();
	        for(int piece[]:pieces){
	            map.put(piece[0],piece);
	        }
	        int i=0;
	        while(i<arr.length){
	            if(map.containsKey(arr[i])){
	                int piece[]=map.get(arr[i]);
	for(int j=0;j<piece.length;j++){
	    if(arr[i]!=piece[j])
	        return false;
	    else
	i++;
	}
	                    }
	            else
	                return false;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
