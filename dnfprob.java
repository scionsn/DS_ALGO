/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 * dutch national flag problem 
 balls of three colors are arranged randomly in a line, v have to arrange  the balls
 * such that the balls of same color are together.
 */
public class dnfprob {
    public static void main(String[] args) {
        int arr[]={0,1,2,1,2,0,1};
        int j=0;
        int dup[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                dup[j++]=arr[i];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                dup[j++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                dup[j++]=arr[i];
            }
        }
        for(int i:dup){
            System.out.println(i);
        }
    }
}
