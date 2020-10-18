import java.util.HashMap;
//hashmap can be used insted of   a 3d matrix
public class BuyAndSell2Transac {
	 public static int maxProfit(int[] prices) {
		 int k=2;
         // int memo[][][]=new int[k+1][prices.length+1][2];
HashMap<String,Integer> memo=new HashMap<>();
    return recur(0,0,prices, memo,k);
	    }
	    static int recur(int index,int decidebuyorsell,int prices[],HashMap<String,Integer> memo,int k) {
		 if(index>=prices.length||k==0)
			 return 0;
		 // if(memo[k][index][decidebuyorsell]!=0) {
		 // return memo[k][index][decidebuyorsell];
		 // }
//        as the state is three therefore three variables seperatd by string
        String keys=index+"something"+decidebuyorsell+"different"+k;
        if(memo.containsKey(keys))
            return memo.get(keys);
		 int profit=0;
//		we used 0 and 1 as a flag for buy and sell
		 if(decidebuyorsell==0) {
//			 because when we buy our profit decreases by that val
//			 recur(index+1,1,prices,memo,k) returns the value if we sell at that day and then we subtract it
//			 since we are buying at that day.
			 int buy=recur(index+1,1,prices,memo,k)-prices[index];
			 int dontbuy=recur(index+1,0,prices,memo,k);
			 profit=Math.max(buy,dontbuy);
		 }
			 // memo[k][index][decidebuyorsell]=profit;
		 else {
//			 because when we sell our profit inc. by that val
			 
			 int sell=recur(index+1,0,prices,memo,k-1)+prices[index];
			 int dontsell=recur(index+1,1,prices,memo,k);
			 profit=Math.max(sell, dontsell);
			 // memo[k][index][decidebuyorsell]=profit;
		 }
		 memo.put(keys,profit);
		 return memo.get(keys);
	    }
public static void main(String args[]) {
	// TODO Auto-generated method stub
	int arr[]= {2,1,4,5,2,9,7};
	System.out.println(maxProfit(arr));
}
}
