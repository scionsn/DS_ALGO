import java.util.ArrayList;
import java.util.List;

//Find all possible combinations of k numbers that add up
//to a number n, given that only numbers from 1 to 9 can 
//be used and each combination should be a unique set of numbers.
 
public class CombinationSumIII {
//	code with duplicates
	 public static List<List<Integer>> combinationSum3Duplic(int k, int n) {
		
	        List<List<Integer>> res=new ArrayList<>();
	        List<Integer> sub=new ArrayList<>();
	       helper(res,sub,k,n);
	        
	        
	        return res;
	    }
	 static void helper(List<List<Integer>> res,List<Integer> sub,int k,int n) {
		 if(n<0) {
			 return ;
		 }
		 if(n==0&&k==0) {
			 res.add(new ArrayList<>(sub));
		 }
		 for(int i=1;i<10;i++) {
			 sub.add(i);
			 helper(res,sub,k-1,n-i);
//			 backtrack by removing last val , to get other possible values
			 sub.remove(sub.size()-1);
		 }
	 }
//	 code w/o duplicates
	 public static List<List<Integer>> combinationSum3(int k, int n) {
			
	        List<List<Integer>> res=new ArrayList<>();
	        List<Integer> sub=new ArrayList<>();
	       helper2(res,sub,k,n,1);
	        
	        
	        return res;
	    }
	 static void helper2(List<List<Integer>> res,List<Integer> sub,int k,int n,int start) {
		 if(n<0) {
			 return ;
		 }
		 if(n==0&&k==0) {
			 res.add(new ArrayList<>(sub));
		 }
//		 we use start value here since we dont need any duplicates and start value always increases with each iteration.
		 for(int i=start;i<10;i++) {
			 sub.add(i);
			 helper2(res,sub,k-1,n-i,i+1);
//			 backtrack by removing last val , to get other possible values
			 sub.remove(sub.size()-1);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(combinationSum3(3,9));
		System.out.println(combinationSum3Duplic(3,9));

		
	}

}
