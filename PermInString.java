/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 *
 * @author SCION
 */
public class PermInString {
    static  public boolean checkInclusion(String s1, String s2) {
      int hash1[]=new int[26];
      int hash2[]=new int[26];
      if(s1.length()>s2.length()){
          return false;
      }
      for(int i=0;i<s1.length();i++){
          hash1[s1.charAt(i)-'a']++;
      }
      for(int i=0;i<s2.length();i++){
          hash2[s2.charAt(i)-'a']++;
          if(i>=s1.length()){
              hash2[s2.charAt(i-s1.length())-'a']--;
          }
           if(Arrays.equals(hash1,hash2)){
          return true;
      }
      }
     
return false;     
    }
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo")?"true":"false"); 
    }
}
