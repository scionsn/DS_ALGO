/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

import java.util.ArrayList;

/**
 *
 * @author SCION
 * to find all the permutations a string can have using recursion.
 */
public class perm_of_string {
    static ArrayList<String> perm(String str){
 if(str.length()==0){
     ArrayList<String> blank=new ArrayList<>();
    //it is important to add a blank string in the arraylist,so as to make the loop traversal possible, as 
    //by adding blank ,the arraylist has one value ,  therefore the loop will traverse one time initially and then some no. of times.
     blank.add("");
     return blank;
 }
 char currentchar=str.charAt(0);
 String remainingstring=str.substring(1);
           ArrayList<String> result=new ArrayList<>();
                 ArrayList<String> temp=perm(remainingstring);
//         post processing
                 for(String s:temp){
               for(int i=0;i<=s.length();i++){
                   StringBuffer sb=new StringBuffer(s);//we use string buffer because here the string  itsef is getting changed.
                   sb.insert(i, currentchar);
                   System.out.println(sb);
                   result.add(sb.toString());
               }
           }
           return result;

    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(perm(str));
    }
   
}
