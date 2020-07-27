
public class AddDigits {
//	working but bad code because high time complexity
//	 public static int addDigits(int num) {
//		 int res=0;
//		 if(num<10) {
//			 return num;
//		 }
//	int one=num%10;
//	       int  two=num/10;
//	        if(two!=0) {
//	       int  sum=one+two;
//	         num=sum;
//	         System.out.println(num);
//	      res=    addDigits(num);
//	        }
//	        
//	        return res;
//		 
//	        
//	    }

//	optimized O(1) time and space
	static int addDigits(int num) {
		if(num==0)
return 0;
		if(num%9==0)
			return 9;
		else {
			return num%9;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(1234567891));
	}

}
