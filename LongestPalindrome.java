import java.util.HashMap;
//Given a string s which consists of lowercase or uppercase letters, 
//return the length of the longest palindrome that can be built with those letters.
//
//Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
public class LongestPalindrome {
	 public static int longestPalindrome(String s) {
	    int length=0;
	    boolean firstodd=true;
	    if(s.length()==1)
	    	return 1 ;
	    HashMap<Character,Integer> map=new HashMap<>();
	    for(int i=0;i<s.length();i++) {
	    	map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
	    }

	
	for(char c:map.keySet()) {
		
	    	if(map.get(c)%2==0) {
	    		length+=map.get(c);
	    	}
	    	if(map.get(c)%2!=0) {
	    		if(firstodd==true) {
		    		length+=map.get(c);
		    	firstodd=false;

	    		}
	    		else {
		    		length+=map.get(c)-1;

	    		}
	    	}
	    	
	    	
	    }
	    
	    
		 
		 
		return length;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(longestPalindrome("aabeeefffff"));
	}

}
