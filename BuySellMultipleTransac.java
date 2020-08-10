//2) Write a program in C language Given a list containing future prediction of share prices, find maximum profit that can be earned by buying and selling shares any number of times with constraint that a new transaction can only start after previous transaction is complete. i.e. we can only hold at-most one share at a time.
//Stock Prices:   {100,108,260,310,40,535,695}
//
//output:
// Buy on - 5 sell on - 7 Profit = 655
public class BuySellMultipleTransac {
	 public static int maxProfit(int[] prices) {
//		 our state is two as it depends on flag and index
		 int memo[][]=new int[2][prices.length];
	        return recur(0,0,prices, memo);
	    }
	static int recur(int index,int decidebuyorsell,int prices[],int memo[][]) {
		 if(index>=prices.length)
			 return 0;
		 if(memo[decidebuyorsell][index]!=0) {
			 return memo[decidebuyorsell][index];
		 }
		 int profit=0;
//		we used 0 and 1 as a flag for buy and sell
		 if(decidebuyorsell==0) {
//			 because when we buy our profit decreases by that val
			 int buy=recur(index+1,1,prices,memo)-prices[index];
			 int dontbuy=recur(index+1,0,prices,memo);
			 profit=Math.max(buy,dontbuy);
			 
		 }
		 else {
//			 because when we sell our profit inc. by that val
			 
			 int sell=recur(index+1,0,prices,memo)+prices[index];
			 int dontsell=recur(index+1,1,prices,memo);
			 profit=Math.max(sell, dontsell);
		 }
		 memo[decidebuyorsell][index]=profit;
return memo[decidebuyorsell][index];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,108,260,310,40,535,695};
		System.out.println(maxProfit(arr));
	}

}
