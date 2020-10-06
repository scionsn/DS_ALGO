
public class RemoveCoveredIntervals {
	 public int removeCoveredIntervals(int[][] intervals) {
	        int count=0;
	        for(int i=0;i<intervals.length;i++){
	            int a=intervals[i][0];
	            int b=intervals[i][1];
	            for(int j=0;j<intervals.length;j++){
	               int c= intervals[j][0];
	                int d=intervals[j][1];
//	                we check if i!=j so that we dont check the interval with itself.
	                if(i!=j&&a>=c&&d>=b){
	                    count++;
	                    break;
//	                    we break from the loop if we find an interval that covers a particular interval,
//	                    and move to the next interval in the array.
	                }
	            }
	        }
	        return intervals.length-count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
