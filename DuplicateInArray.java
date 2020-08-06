import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DuplicateInArray {
	 public static List<Integer> findDuplicates(int[] nums) {
	        List<Integer> res=new ArrayList<Integer>();
	        if(nums.length==1){
	            return res;
	        }
	        HashMap<Integer,Integer> mp=new HashMap<>();
	        for(int i=0;i<nums.length;i++) {
	        	mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
	        }
	        for(int key:mp.keySet()) {
	        	if(mp.get(key)>1) {
	        		res.add(key);
	        	}
	        }
	        return res;
	 }
public static void main(String args[]) {
	int nums[]= {4,3,2,7,8,2,3,1};
	System.out.println(findDuplicates(nums));
}
}
