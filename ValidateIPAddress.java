//Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither.


public class ValidateIPAddress {
	 public  String validIPAddress(String IP) {
	if(checkipv4(IP)) {
		return "IPv4";		
	}
	if(checkipv6(IP)) {
		return "IPv6";	
	}
	else
		return "Neither";

	    }
	boolean checkipv4(String ip){
//		integer.parseint throws a runtime xception, to handle it   try catch block is added
		try {
		String s[]= ip.split("\\.");
		if(s.length!=4)
			return false;
		if(ip.charAt(ip.length()-1)=='.') {
			return false;
		}
		for(int i=0;i<s.length;i++) {
			int num=Integer.parseInt(s[i]);
			if(num>255)
				return false;
			if(num<10&&s[i].length()>1||num<100&&s[i].length()>2)
				return false;
		}
		return true;
		}
		catch(Exception e) {
			return false;
		}
	 }
		 public boolean checkipv6(String IP){
		        String[] str = IP.split(":");
		        // Check if String length is less thn 8
		        if(str.length != 8) return false;
		        // Check if last char is not :
		        if(IP.charAt(IP.length()-1) == ':')return false;
		        for(int i = 0; i < str.length; i++){
		        	if(str[i].length()>4||str[i].length()<1)
		        		return false;
		        	for(int j=0;j<str[i].length();j++) {
		        		char c=str[i].charAt(j);
		                if(!(c>='0' && c <='9') && !(c>='a' && c <='f') && !(c>='A' && c <='F') ) 
		                	return false;

		        	}
		        }
		        return true;
		    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateIPAddress ob=new ValidateIPAddress();
	System.out.println(ob.validIPAddress("172.16.254.1"));	
		System.out.println(ob.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));

	}

}
