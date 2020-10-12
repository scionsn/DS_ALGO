//Given a collection of intervals, find the minimum number of 
//intervals you need to remove to make the rest of the intervals non-overlapping.
import java.util.Arrays;
import java.util.Comparator;

public class NonOverlapIntervals {
public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
        	public int compare(int a[],int b[]) {
        		return a[0]-b[0];
        	}
        });
        int count=0;
      int left=0;
      int right=1;
      int n=intervals.length;
      while(right<n) {
//    	  for non overlapping intervals
    	  if(intervals[left][1]<=intervals[right][0]) {
              left=right;

    		  right++;
    	  }
//    	  for intervals that are completely overlapped by another interval, in this casee
//    	  we just remove the bigger interval as it might cover other intervals
    	  else if(intervals[left][1]>intervals[right][1]) {
    		 count++;
    		  left=right;
    		  right++;
    	  }
    	  
//    	  for simple overlapping intervals
    	  else if(intervals[left][1]<=intervals[right][1]) {
    		  count++;
    		  right++;
    	  }
    	  
      }
      
        return count;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int intervals[][]= {{1,2},{1,3},{2,3},{3,4}};
System.out.println(eraseOverlapIntervals(intervals));
}

}
