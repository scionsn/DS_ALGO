import java.util.HashMap;
//Given a column title as appear in an Excel sheet, return its corresponding column number.
public class ExcelSheetColNumber {
	  public static int titleToNumber(String s) {
	        HashMap<Character,Integer> map=new HashMap<>();
	        int res=0,pow=0;
//	        ascii of @ is 64.
	        for(int i=0;i<s.length();i++) {
	        	map.put(s.charAt(i),s.charAt(i)-'@');
	        }
	        for(int i=s.length()-1;i>=0;i--) {
	        	res+=map.get(s.charAt(i))*Math.pow(26, pow);
	        	pow++;
	        }
	        System.out.println(map);
	        return res;
	    }
	  public static int optimized(String s) {
	        int res=0,pow=0;	        
	        for(int i=s.length()-1;i>=0;i--) {
//	        	instead of hashmap , val is calculated manually
	        int val=s.charAt(i)-65+1;
	        res+=val*Math.pow(26, pow);
	        pow++;
	        }
	        return res;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="AB";
System.out.println(titleToNumber(s));
System.out.println(optimized(s));
	}

}
