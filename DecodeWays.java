//A message containing letters from A-Z is being encoded to numbers using the following mapping:
//
//'A' -> 1
//'B' -> 2
//...
//'Z' -> 26
//Given a non-empty string containing only digits, determine the total number of ways to decode it.
public class DecodeWays {
public static int numDecodings(String s) {
	int arr[]=new int[s.length()+1];
//      int res= recur(s,0,arr);
    int res= tabul(s,0);

      
      return res;
       
    }
static int recur(String s,int index,int arr[]) {
	if(index==s.length())
return 1;
	if(s.charAt(index)=='0')
		return 0;
	if(index==s.length()-1)
		return 1;
	if(arr[index]!=0) {
		return arr[index];
	}
	int way1=recur(s,index+1,arr);
	int way2=0;
	if(Integer.parseInt(s.substring(index,index+2))<=26) {
		way2=recur(s,index+2,arr);
	}
	arr[index]=way1+way2;
	return arr[index];
}
public static int tabul(String s,int index) {
	int dp[]=new int[s.length()+1];
	if(s.length()==0) {
		return 0;
	}
	dp[0]=1;
dp[1]=s.charAt(0)!='0'?1:0;
for(int i=2;i<dp.length;i++) {
	int first=Integer.parseInt(s.substring(i-1,i));
	int second=Integer.parseInt(s.substring(i-2,i));
	if(first>=1&&first<=9) {
		dp[i]+=dp[i-1];
	}
	if(second>=10&&second<=26) {
		dp[i]+=dp[i-2];
	}
}
return dp[dp.length-1];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numDecodings("023"));
	}

}
