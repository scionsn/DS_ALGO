//For a given number N in base-10, return the complement of it's binary representation as a base-10 integer.


public class ComplementofBase10Integer {
	 public int bitwiseComplement(int N) {
		 String comp="";
	        String num=Integer.toBinaryString(N);
	   for(int i=0;i<num.length();i++) {
		   if(num.charAt(i)=='0') {
			  comp+="1";
		   }
			  else
				  comp+="0";
		   }
	   int res=Integer.parseInt(comp,2);
return res;
			  
				   
	   }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
