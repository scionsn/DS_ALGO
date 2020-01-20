/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;
import java.util.*;
//1) Count the number of 0s. Let count be C.
//2) Once we have count, we can put C 0s at the beginning and 1s at the remaining n – C positions in array.
public class fourthprob {

    public static void main(String[] args) {
        int arr[]={0,1,0,1,1,0,1,0};
        int count=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            count++;
        }}
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=(arr.length)-count;i<arr.length;i++){
            arr[i]=1;
        }
        System.out.println("array: ");
        for(int i:arr){
            System.out.println(i);
        }
    }}
  
