
public class WindowSliding {
	static void dynamic() {
		int arr [] = {3,10,2,1,5,6,2,1,9,7};
		int target = 7;
		int windowStart  = 0;
		int currentSum = 0;
		int minWindowSize = Integer.MAX_VALUE;
		for(int i = 0 ; i<arr.length; i++) {
			currentSum+= arr[i];
			while(currentSum>=target) {
				int currentWindowSize = i - windowStart + 1;
				minWindowSize = Math.min(minWindowSize, currentWindowSize);
				currentSum = currentSum - arr[windowStart];
				windowStart++;
				
			}
		}
		System.out.println("Min Window Size Sum "+minWindowSize);
	}
	static void fixed(int windowSize) {
		// TODO Auto-generated method stub
				int arr [] = {3,10,2,1,5,6,2,1,9,7};
				int max = Integer.MIN_VALUE;
				int currentSum = 0;
				int windowRange = windowSize;
				for(int i =0 ;i<arr.length; i++) {
					currentSum+= arr[i];
					if(i>=windowRange-1) {
						max = Math.max(max, currentSum);
						currentSum = currentSum - arr[i- (windowRange-1)];
					}
				}
				System.out.println("Max Sum is "+max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fixed(4);
//		fixed(3);
//		fixed(2);
		dynamic();
	}

}
