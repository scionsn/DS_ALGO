import java.util.Arrays;
import java.util.HashMap;

//Given a set of intervals, for each of the interval i, check if
//there exists an interval j whose start point is bigger than or 
//equal to the end point of the interval i, which can be called that j is on the "right" of i.
//
//For any interval i, you need to store the minimum interval j's index, 
//which means that the interval j has the minimum start point to build the
//"right" relationship for interval i. If the interval j doesn't exist,
//store -1 for the interval i. Finally, you need output the stored value of each interval as an array.
//
//Note:
//
//You may assume the interval's end point is always bigger than its start point.
//You may assume none of these intervals have the same start point.
// 
public class FindRightInterval {
//	brute force  O n^2
public int[] findRightInterval2(int[][] intervals) {
	int res[]=new int[intervals.length];

	for(int i=0;i<intervals.length;i++) {
		int min=Integer.MAX_VALUE;
		int index=-1;
        	for(int j=0;j<intervals.length;j++) {
        		if(intervals[j][0]>=intervals[i][1]&&min>intervals[j][0]) {
        			index=j;
        			min=intervals[j][0];
        		}
        	}
        	res[i]=index;
        }
	return res;
    }
//optmized using binary search since we are given that the first element of each interval is differnet, so we can maintain a hashmap
// that consists of the first elem and its position in the array.  O nlogn
public int[] findRightInterval(int[][] intervals) {
//	HashMap<Integer,Integer> map=new HashMap<>();
//	int first[]=new int[intervals.length];
//	int res[]=new int[intervals.length];
//	
//for(int i=0;i<first.length;i++) {
//	map.put(intervals[i][0], i);
//	first[i]=intervals[i][0];
//}
//Arrays.sort(first);
//	
//	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
