
public class StringCharOddEven {
public static String oddeven(String s,int flag) {
	String res="";
	for(int i=0;i<s.length();i++) {
		if(flag==0) {
			if(i%2==0) {
				res=res+s.charAt(i);
			}
		}
		else
			if(i%2!=0)
			res=res+s.charAt(i);
	}
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="feedbyme";
int flag=0;
System.out.println(oddeven(s,flag));
	}

}
