
public class ConsecutiveCharacters {
	public int maxPower(String s) {
        int max=1;
        int curr=1;
        
          
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                curr++;
                if(curr>max)
                    max=curr;
            }
            else
                curr=1;
        }

    return max;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
