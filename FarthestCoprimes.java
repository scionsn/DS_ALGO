//microsoft interview ques.
//find farthest coprimes in the range of [2,250]
public class FarthestCoprimes {
	public static int[] coprimes(int arr[]) {
		int res[]=new int[arr.length];
		int k=0;
		int maxcoprime=0;
		int mid=250/2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<mid) {
				for(int j=240;j<=250;j++) {
					if(coprimes(arr[i],j)) {
						maxcoprime=Math.max(maxcoprime, j);
					}
				}
				res[k]=maxcoprime;
				k++;
				maxcoprime=0;
			}
			else {
				maxcoprime=Integer.MAX_VALUE;
				for(int j=20;j>=2;j--) {
					if(coprimes(arr[i],j)) {
						maxcoprime=Math.min(maxcoprime, j);
					}
					
				}
				res[k]=maxcoprime;
				k++;
			}
		}
		return res;
	}
	static int gcd(int a,int b) {
		if(a==0||b==0)
			return 0;
		if(a==b)
			return a;
		if(a>b)
			return gcd(a-b,b);
		return gcd(a,b-a);
	}
	static boolean coprimes(int a,int b) {
		if(gcd(a,b)==1)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,210,70,420};
		for(int i:coprimes(arr)) {
			System.out.println(i);
		}
//		System.out.println(coprimes(2,249));
	}

}
