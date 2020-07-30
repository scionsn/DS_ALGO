//Say you have an array for which the ith element
//is the price of a given stock on day i.
//
//Design an algorithm to find the maximum profit.
//You may complete as many transactions as you like 
//(ie, buy one and sell one share of the stock
//multiple times) with the following restrictions:
//
//You may not engage in multiple transactions at the same
//time (ie, you must sell the stock before you buy again).
//After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
public class BuySellWithCooldown {
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
			 
			 int sell=recur(index+2,0,prices,memo)+prices[index];
			 int dontsell=recur(index+1,1,prices,memo);
			 profit=Math.max(sell, dontsell);
		 }
		 memo[decidebuyorsell][index]=profit;
return memo[decidebuyorsell][index];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,0,2};
		System.out.println(maxProfit(arr));

	}

}
