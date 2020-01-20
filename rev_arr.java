/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 reverse an array.
 */
public class rev_arr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i=0;
        int j=arr.length-1;
        for(int c=1;c<arr.length;c++){
            if(i<j){
            int temp=arr[i];
           arr[i]=arr[j]; 
           arr[j]=temp;
        }
        i++;
        j--;}
        for(int v:arr){
            System.out.println(v);
        }
    }
}
