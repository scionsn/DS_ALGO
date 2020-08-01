//Given a word, you need to judge whether the usage of capitals in it is right or not.
//
//We define the usage of capitals in a word to be right when one of the following cases holds:
//
//All letters in this word are capitals, like "USA".
//All letters in this word are not capitals, like "leetcode".
//Only the first letter in this word is capital, like "Google".
//Otherwise, we define that this word doesn't use capitals in a right way.
public class DetectCapital {
	 public static boolean detectCapitalUse(String word) {
		 if(word.length()==0) {
			 return false;
		 }
		 int count=0;
		
for(int i=0;i<word.length();i++) {
	char c=word.charAt(i);
	if(c>=65&&c<=90) {
		count++;
	}
}
		 if(count==word.length()||count==0||count==1&&word.charAt(0)>=65&&word.charAt(0)<=90) {
			return true;

	    }
		 
		 return false;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detectCapitalUse("FlaG"));
	}

}
