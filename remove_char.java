/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 remove character from a string.
 * substring method is used which returns a string from the specified index to the end index.
 */
public class remove_char {
    static String removechar(String str,char remove){
        if(str.length()==0){
            return "";
        }
        String op="";
        if(str.charAt(0)!=remove){
            op=op+str.charAt(0);
        }
        return op+removechar(str.substring(1),remove);
    }
    public static void main(String[] args) {
     
        String res=removechar("santa singh",'s');
        System.out.println("the changed string is: " + res);
    }
}
