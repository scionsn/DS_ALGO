/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 count no. of 0's in a number
 */
public class recur_12 {
        static void countzero(int arr[],int index,int count){
            if(index==arr.length){
                System.out.println(count);
                return;
            }
            if(arr[index]==0){
                countzero(arr,index+1,count+1);
            }
            else countzero(arr,index+1,count);
        }
    public static void main(String[] args) {
        int arr[]={0,1,0,1};
        countzero(arr,0,0);
    }
    
}
