/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * @author SCION
 */
public class FirstUniqChar {
 static    public int firstUniqChar(String s) {
     if(s.length()>0){
        int arr[]=new int[255];
        int c=0;
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i);
            arr[val]++;
            System.out.println(val);
        }
         System.out.println(Arrays.toString(arr));
        for(int i=0;i<s.length();i++){
//            System.out.println(arr[i]);
int res=s.charAt(i);
            if(arr[res]==1){
               c=i;
break; 
            }
            
           
        }
       

//        for(int i=0;i<s.length();i++){
//          int val=  s.charAt(i);
////            System.out.println(val);
//            System.out.println(arr[val]);
////          if(arr[val]==0){
////              System.out.println(i);
////             
////          }
//        }
    return c;
     }
     else return -1;
     
 }
    public static void main(String[] args) {
        String s="loveleetcode";
       int res= firstUniqChar(s);
        System.out.println(res);
    }
}
