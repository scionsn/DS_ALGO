package ds_algo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
      String s="acbabaczzf";
       char dup[]=new char[124];
       for(int i=0;i<s.length();i++){
       int b=s.charAt(i);
dup[b]=s.charAt(i);
       }
       for(int i=97;i<123;i++)
       {
           System.out.println(dup[i]);
       }
      
    }
}
