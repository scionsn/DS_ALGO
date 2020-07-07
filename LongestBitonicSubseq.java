
public class LongestBitonicSubseq {
public static int dp(int nums[]) {
	int fwd[]=new int[nums.length];
	int rev[]=new int[nums.length];
	int res[]=new int[nums.length];
	for(int i=0;i<nums.length;i++) {
		fwd[i]=1;
		rev[i]=1;
	}
	for(int i=1;i<fwd.length;i++) {
		for(int j=0;j<i;j++) {
			if(nums[i]>nums[j]&&fwd[i]<=fwd[j]) {
				fwd[i]=1+fwd[j];
			}
		}
	}
	for(int i:fwd) {
		System.out.println("fwd "+i);
	}
	for(int i=rev.length-2;i>=0;i--) {
		for(int j=rev.length-1;j>i;j--) {
			if(nums[i]>nums[j]&&rev[i]<=rev[j]) {
				rev[i]=1+rev[j];
			}
		}
	}
	for(int i:rev) {
		System.out.println("rev "+i);
	}
//	we do this step because the middle elem 10 appears twice in both inc. and dec array
//	eg.- 1,5,10(inc). 10,4,3(dec)
	for(int i=0;i<res.length;i++) {
		res[i]=fwd[i]+rev[i]-1;
	}
	int max=res[0];
	for(int i=0;i<res.length;i++) {
		if(res[i]>max)
			max=res[i];
	}
	return max;

	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,5,2,10,4,3,9};
System.out.println(dp(arr));

	}

}
