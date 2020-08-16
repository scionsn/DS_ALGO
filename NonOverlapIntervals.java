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
        int endtime=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
        	if(intervals[i][0]<endtime) {
        		count++;
        		endtime=Math.min(endtime, intervals[i][1]);
        				}
        	else {
        		endtime=intervals[i][1];
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
