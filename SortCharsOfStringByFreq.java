package leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 */
public class SortCharsOfStringByFreq {
    public static String meth(String str){
       char c[]= str.toCharArray();
               HashMap<Character,Integer> mp=new HashMap<>();

       for(char cc:c){
           mp.put(cc,mp.getOrDefault(cc, 0)+1);
       }
      
       List<Character>[] li = new List[str.length() + 1];
for(char n:mp.keySet()){
    int freq=mp.get(n);
   if(li[freq]==null){
     li[freq]=new ArrayList<>();  
   }
   li[freq].add(n);
    
}
StringBuilder s= new StringBuilder();
for(int i=str.length()-1;i>=0;i--){
    if(li[i]!=null){
        for(char v:li[i]){
            for(int j=0;j<mp.get(v);j++){
                s.append(v);
            }
        }
    }
}
return s.toString();

             
    }
    public static void main(String[] args) {
        String s="mississippi";
        System.out.println( meth(s));

            }
}
