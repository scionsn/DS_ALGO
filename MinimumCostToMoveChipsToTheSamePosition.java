
public class MinimumCostToMoveChipsToTheSamePosition {
	  public int minCostToMoveChips(int[] position) {
		  int odd=0,even=0;
	        for(int i=0;i<position.length;i++){
	            if(position[i]%2==0)
	                even++;
	            else
	                odd++;
	        }
	        return Math.min(even,odd);
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
