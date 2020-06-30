import java.util.Arrays;

//Students are asked to stand in non-decreasing
//order of heights for an annual photo.
//
//Return the minimum number of students that must
//move in order for all students to be standing in non-decreasing order of height.
//
//Notice that when a group of students is selected they
//can reorder in any possible way between themselves 
//and the non selected students remain on their seats.
public class HeightChecker {
	 public static int heightChecker(int[] heights) {
	     int dup[]=new int[heights.length];
	     for(int i=0;i<heights.length;i++) {
	    	 dup[i]=heights[i];
	     }
	     Arrays.sort(heights);
	     int count=0;
	     for(int i=0;i<heights.length;i++) {
	    	 if(dup[i]!=heights[i])
	    		 count++;
	     }
	     return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5,1,2,3,4};
System.out.println(heightChecker(arr));
	}

}
