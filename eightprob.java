/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;


public class eightprob {
  
    public static void main(String[] args) {
         
        String arr[]={"a","a","a","b","b","c","c","d","s","a",""};
        for(int i=0;i<arr.length-1;i++){
            int count=1;
            while(arr[i]==arr[i+1]){
                count++;
                i++;
            }
            if(count>=2){
            System.out.println(arr[i]+count);}
            else{
                System.out.println(arr[i]);}
        }
}
}  
       

