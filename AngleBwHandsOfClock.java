
public class AngleBwHandsOfClock {
	 public static  double angleClock(int hour, int minutes) {
	        double hours= 30*hour+0.5*minutes;
	        double min=6*minutes;
	        double res=hours-min;
	        if(hours-min>180) {
	        	return 360-res;
	        }
	        return res;
	        
	        	
	    }
	public static void main(String[] args) {
		System.out.println(angleClock(3, 10));
		
	}

}
