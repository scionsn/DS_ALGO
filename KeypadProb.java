import java.util.ArrayList;

public class KeypadProb {
    static String keys []= {"-","!","abc","def","ghi","jkl","mno","pqrs","tvu","wxyz"};
    static void keyPad(String number, String result){

    }
	  static ArrayList<String> keyPad(String number){
	        if(number.length()==0) {
	            ArrayList<String> blank = new ArrayList<>();
	            blank.add("");
	            return blank;
	        }
	        char firstChar = number.charAt(0);
	        String remainingNumber = number.substring(1);
	        int index = firstChar - '0';
	        String keyPadKey = keys[index];
	        ArrayList<String> finalResult = new ArrayList<>();
	        for(char currentChar : keyPadKey.toCharArray()) {
	            ArrayList<String> temp = keyPad(remainingNumber);
	            for(String str : temp) {
	                finalResult.add(currentChar + str);

	            }
	        }
	        return finalResult;
	    }
public static void main(String args[]) {
	String str="23";
    ArrayList<String> result= keyPad(str);
    System.out.println(result);
}
}
