import java.util.HashMap;

//Given a pattern and a string str, find if str follows the same pattern.

//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.


public class WordPattern {
	 public static boolean wordPattern(String pattern, String str) {
		 HashMap<Character,String> map=new HashMap<>();
		 
		 String arr[]=str.split(" ");System.out.println();
		 if(arr.length!=pattern.length())
	            return false;
		 for(int i=0;i<pattern.length();i++) {
			 if(!map.containsKey(pattern.charAt(i))) {
				 if(map.containsValue(arr[i])) {
					 return false;
				 }
				 map.put(pattern.charAt(i),arr[i]);
			 }
			 else {
				
				 if(!map.get(pattern.charAt(i)).equals(arr[i])) {
					 return false;
				 }
			 }
		 }
		 return true;
	    }
	public static void main(String[] args) {
		System.out.println(wordPattern("abba","dog cat cat dog"));
	}

}
