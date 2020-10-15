import java.util.ArrayList;
import java.util.HashSet;

public class BuddyStrings {
	public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length())
            return false;
//        if both strings are same then we should check that there must be a duplicate 
//        value in the string to swap, and since hashset doesnt contain duplicates
//        the hashset size should be less than the string size.
        if(A.equals(B)){
            HashSet<Character> unique=new HashSet<>();
            for(int i=0;i<A.length();i++){
                unique.add(A.charAt(i));
            }
            if(unique.size()<A.length())
                return true;
            return false;
        }
//        to perform a single swap only two indices should differ then only we can check for other conditions.
        ArrayList<Integer> different=new ArrayList<>();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!=B.charAt(i))
                different.add(i);
        }
        if(different.size()==2&&A.charAt(different.get(0))==B.charAt(different.get(1))
&&A.charAt(different.get(1))==B.charAt(different.get(0)))
           {
               return true;
           }
           return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
