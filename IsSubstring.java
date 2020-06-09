/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 */
public class IsSubstring {
    public static Boolean meth(String s,String t){
        int j=0;
       for(int i=0;i<t.length()&&j<s.length();i++){
           if(t.charAt(i)==s.charAt(j))
               j++;
           
           
       }
        return j==s.length();
}


    
    public static void main(String[] args) {
        String s="jne";
        String t="conjugation";
        System.out.println(meth(s,t)); 
    }
}
