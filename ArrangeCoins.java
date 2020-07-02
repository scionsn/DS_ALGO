//You have a total of n coins that you want to form
//in a staircase shape, where every k-th row must have exactly k coins.
//
//Given n, find the total number of full staircase rows that can be formed.
public class ArrangeCoins {
	 public static int arrangeCoins(int n) {
		int i=0;
		do {
			i++;
			n-=i;
		}while(n>i);
	      return i;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrangeCoins(5));
	}

}
