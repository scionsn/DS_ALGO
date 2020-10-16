import java.util.Arrays;
import java.util.Comparator;

public class MinNumberOfArrowsToBurstBallons {
	public int findMinArrowShots(int[][] points) {
		  if(points.length==0)
	            return 0;
//		  we sort based on the last value of the intrval since we will be able to hitmore 
//		  ballons of we start our arrow from the last index as compared to first.
	          Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
//	          we will atleast require 1 arrow in case of single ballon
	       int count=1;
	        int value=points[0][1];
	for(int i=1;i<points.length;i++){
//		if the ballons are not overlapping then move to next balloon and inc. the arrows
	    if(value>=points[i][0])
	        continue;
	    count++;
	    value=points[i][1];
	}
	

	      return count;
	    }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
