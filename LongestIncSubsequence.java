
public class LongestIncSubsequence {
	public static void meth(int nums[]){
		
	}
		
	public static int dp(int nums[]) {
		if(nums.length==0) {
			return 0;
		}
		int lis[]=new int[nums.length];
		for(int i=0;i<lis.length;i++) {
			lis[i]=1;
		}
		for(int i=1;i<lis.length;i++) {
			for(int j=0;j<i;j++) {
		if(nums[i]>nums[j]&&lis[i]<=lis[j]) {
			lis[i]=1+lis[j];
		}
		}
		}
		for(int i:lis) {
			System.out.println(i);
		}
		int max=lis[0];
		for(int i=1;i<lis.length;i++) {
			if(lis[i]>max)
				max=lis[i];
		}
		return max;
	}

	public static void main(String[] args) {
int nums[]= {5,7,8,1,9};
System.out.println("LIS is:-"+dp(nums));
	}

}
