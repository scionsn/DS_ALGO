/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

import java.util.ArrayList;

/**
 * @author SCION
 to find the all possible substring of a given string say abc
 */
public class substring_prob {
    //the below method returns an array list
    static ArrayList<String > subsequence(String str){
        if(str.length()==0){
            ArrayList<String> emptystring=new ArrayList<>();
            emptystring.add("");
            return emptystring;
        }
        char currentchar=str.charAt(0);
        String remainingstring=str.substring(1);
                    ArrayList<String> result=new ArrayList<>();
                                ArrayList<String> temp=subsequence(remainingstring);
                                for(String s:temp){
                                    result.add(s);
                                    result.add(currentchar+s);
                                }
                                return result;


    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(subsequence(str));
    }
   
}
