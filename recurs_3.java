
package ds_algo;

/**
program to find the factorial of a no.
 */
public class recurs_3 {
    static   int fact(int n){
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            fact=fact*i;
//        }
//        System.out.println(fact);
        if(n>=1){
            return n*fact(n-1);
        }
        else return 1;
        
    }
    public static void main(String[] args) {
       
       int result= fact(4);
        System.out.println(result);
    }
}
