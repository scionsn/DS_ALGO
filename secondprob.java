package ds_algo;

import java.util.*;
public class secondprob {
    public static void main(String[] args) {
        System.out.println("enter no. of test cases");
        Scanner loop=new Scanner(System.in);
                int loops=loop.nextInt();
        for(int i=1;i<=loops;i++){
            System.out.println("enter the values");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();    
        if(n%2==0||n==1){
            System.out.println("true");}
        else{
        System.out.println("false");}
    }

    }
}
