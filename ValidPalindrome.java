
public class ValidPalindrome {
	 public static boolean isPalindrome(String s) {
int start=0;
int end=s.length()-1;
while(start<end) {
	char startchar=s.charAt(start);
	char endchar=s.charAt(end);
	boolean startcond=Character.isAlphabetic(startchar)||Character.isDigit(startchar);
	boolean endcond=Character.isAlphabetic(endchar)||Character.isDigit(endchar);
	if(startcond&&endcond) {
	if(Character.toLowerCase(startchar)==Character.toLowerCase(endchar)){
		start++;
		end--;
		return true;

	}
	}
//	ignoring spaces and special chars.
	if(!startcond) {
		start++;
	}
	else {
		end--;
	}
	
}
return false;

	 }
	public static void main(String[] args) {
		String s="car";
		System.out.println(isPalindrome(s));
		// TODO Auto-generated method stub
char c=' ';
int v=c;
System.out.println(v);
	}

}
