//done using greedy approach, as its better than dp
//we go to each index and we check if its possible to reach the end and just increase our reach further so that we 
//can finally reach end.
public class JumpGame {
public boolean canJump(int[] nums) {
        
        int reach=0;
        for(int i=0;i<=reach;i++){
            reach=Math.max(reach,i+nums[i]);
            if(reach>=nums.length-1)
                return true;
        }
    return false;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
