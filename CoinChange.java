
public class CoinChange {
	static void coinChange(int d[], int amount, String result, int lastIndex) {
		if(amount ==0) {
			System.out.println(result);
			return ;
		}
		for(int i= lastIndex ; i<d.length; i++) {
			if(amount>=d[i]) {
				coinChange(d, amount-d[i], result+d[i], i);
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d [] = {2,3,5,6};
		int amount = 10;
		coinChange(d, amount, "",0);
	}

}
