import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 * A word is defined as a sequence of non-space characters.
Input string may contain leading or trailing spaces.
 However, your reversed string should not
  contain leading or trailing spaces.
You need to reduce multiple spaces between two
 words to a single space in the reversed string.
 */
public class ReverseWords {
	 public static String reverseWords(String s) {
	      Stack<String> stack=new Stack<>();
	      String temp="";
	      String res="";
	      for(int i=0;i<s.length();i++) {
	    	 
	    	  if(s.charAt(i)==' ') {
		    	  if(temp.length()>0) {
	    		  stack.push(temp);
		    	  }
	    		  temp="";		    	  

	    	  }
		    	  else {
		    		  temp=temp+s.charAt(i);
		    	  }
	    	  
	      }
	      res+=temp;
	      while(!stack.isEmpty()) {
    		  res=res+" "+stack.pop();
    	  }
    	  if(res.length()!=0&&res.charAt(0)==' ') {
    		  return res.substring(1);
    	  }
	      
return res;
	    }
    public static void main(String[] args) {
    	System.out.println(reverseWords("  "));
    	System.out.println(args.length);
       

}
}
