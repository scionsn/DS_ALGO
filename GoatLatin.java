// sentence S is given, composed of words separated by spaces.
// Each word consists of lowercase and uppercase letters only.
//
//We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
//
//The rules of Goat Latin are as follows:
//
//If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
//For example, the word 'apple' becomes 'applema'.
// 
//If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
//For example, the word "goat" becomes "oatgma".
//  
//Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
//For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
//Return the final sentence representing the conversion from S to Goat Latin. 

//Example 1:
//
//Input: "I speak Goat Latin"
//Output: "Imaa peak smaaa oatGmaaaa atinLmaaaaa"
//Example 2:
//
//Input: "The quick brown fox jumped over the lazy dog"
//Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 
public class GoatLatin {
	 public static String toGoatLatin(String S) {
		 if(S.length()==0) {
			 return "";
		 }
		 StringBuilder res=new StringBuilder();
		 StringBuilder ma=new StringBuilder("ma");
	      String arr[]= S.split(" ");
	    for(int i=0;i<arr.length;i++) {
	    	ma.append("a");
	    	if(isvowel(arr[i].charAt(0))) {
	    		arr[i]=arr[i].concat(ma.toString());
	    	}
	    	else {
	arr[i]=arr[i].substring(1)+arr[i].charAt(0)+ma.toString();	
	    	}

	    res.append(arr[i]+" ");
	    }
//	    deleting space at last index since we are adding spaces after adding each word in final string
	    res.deleteCharAt(res.length()-1);
	      
	    
return res.toString();	       
	    
	    }
	 public static boolean isvowel(char s) {
		 if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||
				 s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
			 return true;
		 return false;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="I am iron man";
System.out.println(toGoatLatin(s));
	}

}
