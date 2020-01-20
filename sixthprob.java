
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
to count the maximum occurence of a character in a string.
*/
package ds_algo;
public class sixthprob {
    public static void main(String[] args) {
        String arr1="abcababbaaa";
       int arr2[]=new int [256];
       
       for(int i=0;i<arr1.length();i++){
           arr2[ (int)arr1.charAt(i) ]++;
       }

           int max = arr2[0];
           int character = 0;
           for(int i=0;i<256 ;i++){
               if(max<arr2[i]){
                   max = arr2[i];
                   character = i;
               }
           }
           
           System.out.println("Character  = "+(char)character+"  Times = "+max);

    
    
    
    
    }
}