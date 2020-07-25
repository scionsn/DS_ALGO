
public class BestTimeToBuyAndSell {
	 public static int maxProfit(int[] prices) {
	   
	   if(prices.length==0)
		   return 0;
	   int minstock=prices[0];
	   int maxprofit=0;
	   for(int i=0;i<prices.length;i++) {
		   minstock=Math.min(minstock,prices[i]);
		   maxprofit=Math.max(maxprofit, Math.abs(prices[i]-minstock));
	   }
	   return maxprofit;

	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,1,5,6,3,4};
		System.out.println(maxProfit(arr));

	}

}
