/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
rev the string by recursion.
* here two pointer approach is used, where 1 pointer is at the beginning
* and other at the end of array.
 */
public class recur_13 {
    static void revstring(String arr[],int i,int j)
    {
        if(i==j){
            for(String v:arr){
                System.out.println(v);
            }
            return;
        }
   if(i<j){
       String temp=arr[i];
           arr[i]=arr[j]; 
           arr[j]=temp;
   }
   revstring(arr,i+1,j-1);
      
    }
    public static void main(String[] args) {
        
          String arr[]={"h","e","l","l","o"};
          revstring(arr,0,arr.length-1);
//int i=0;
//        int j=arr.length-1;
//        for(int c=1;c<arr.length;c++){
//            if(i<j){
//            String temp=arr[i];
//           arr[i]=arr[j]; 
//           arr[j]=temp;
//        }
//        i++;
//        j--;}
//        for(String v:arr){
//            System.out.println(v);
//        }          
        
    }
}
