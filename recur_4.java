
 
package ds_algo;

public class recur_4 {
  static int a=0,b=1,c=0;
    static int fibb(int n){
//        the code below only prints the nth term of a fibb. series.  
    if(n==1)
        return 0;
    else if(n==2)
    return 1;
    else
    return fibb(n-1)+fibb(n-2);
  
//the code below prints the fibb. series till nth term
//if(n>=1){
//    c=a+b;
//        System.out.println(c);
//        a=b;
//        b=c;
//        fibb(n-1);
//    } 
//    
    } 
    
    public static void main(String[] args) {
       
        System.out.println(fibb(6));
    }
}
