import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
String s="";
	 List<String> res=new ArrayList<>();
     for(int i=1;i<=n;i++){
         if(i%3==0&&i%5==0){
             res.add("fizzbuzz");
         }
        else if(i%3==0)
         {
             res.add("fizz");
         }
         else if(i%5==0){
             res.add("buzz");
         }
         else
res.add(s.valueOf(i));
     }
     return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="";
System.out.println(s.valueOf(1));
	}

}
