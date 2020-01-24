/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 replace pi with 3.14 in the string.
 */
public class replace_pi {
    static String removechar(String str){
        if(str.length()==1){
            return "";
        }  
        String op="";
        if(str.charAt(0)=='p'&&str.charAt(1)=='i'){
            op=op+"3.14";//concat
        }
        else{
            op=op+str.charAt(0);     
        }  
        return op+removechar(str.substring(1));
    }
    public static void main(String[] args) {
         String res=removechar("piiipiiipii");
        System.out.println("the changed string is: " + res);
    }
}
