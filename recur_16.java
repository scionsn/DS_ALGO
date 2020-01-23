/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 replace character from a string.
 */
public class recur_16 {
    static String removechar(String str,char remove,char replace){
        if(str.length()==0){
            return "";
        }
        String op="";
        if(str.charAt(0)!=remove){
            op=op+str.charAt(0);
        }
        else
            op=op+replace;
        return op+removechar(str.substring(1),remove,replace);
    }
    public static void main(String[] args) {
         String res=removechar("bell",'l','t');
        System.out.println("the changed string is: " + res);
    }
}
