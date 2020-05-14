package leetcode;


import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

Note:
The length of num is less than 10002 and will be ≥ k.
The given num does not contain any leading zero.
 */
public class RemovKCharString {
     public static String removeKdigits(String num, int k) {
         if(num.length()==k){
             return "0";
         }
        Stack<Character> stack=new Stack<>();
      
        for(int i=0;i<num.length();i++){
            while(k>0&&!stack.isEmpty()&&stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
                System.out.println("normal algo");
        }
        stack.push(num.charAt(i));
         
        
    }
         for(int i=0;i<stack.capacity();i++){
            System.out.println(stack);
        }
         while(k>0){
            stack.pop();
            k--;
             System.out.println("test case handle condition");
        }
      
        for(int i=0;i<stack.capacity();i++){
            System.out.println(stack);
        }
       
                 StringBuilder ss=new StringBuilder();            

while(!stack.isEmpty()){
    char c=stack.pop();
ss.append(c);
        }
        ss.reverse();
        while(ss.length()>1&&ss.charAt(0)=='0'){
            ss.deleteCharAt(0);
        }
     return ss.toString();
     }
    public static void main(String[] args) {
        String s="112";
    String res= removeKdigits(s,1);
        System.out.println(res);
       
    }
}
