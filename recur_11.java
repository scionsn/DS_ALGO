/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 palindrome using recursion
 * two pointer technique is used here.
 */
public class recur_11 {
    static boolean ispalind(String name,int start,int end){
        if(start==end){
            return true;
        }
        if(start>end){
            return true;
        }
        if(name.charAt(start)!=name.charAt(end)){
            return false;
        }
        return ispalind(name,start+1,end-1);
    }
    public static void main(String[] args) {
        String s1="radar";
       boolean res= ispalind(s1,0,s1.length()-1);
        System.out.println(res);
//        int i=0;
//        int j=s1.length()-1;
//        for( int c=0;c<s1.length();c++){
//            if(i<j){
//           if(s1.charAt(i)==s1.charAt(j)){
//               System.out.println("palindrome");
//           }
//            }
//            i++;
//            j--;
//    }
}
}
