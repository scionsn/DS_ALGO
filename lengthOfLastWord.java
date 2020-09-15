import java.util.LinkedList;

//Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
//return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
//
//If the last word does not exist, return 0.
//
//Note: A word is defined as a maximal substring consisting of non-space characters only.


public class lengthOfLastWord {
	public static int lengthOfLastWord(String s) {
	    int count = 0;
        int i = s.length()-1;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
            } else {
                break;
            }
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord(" "));
	}

}
