/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 Q:-to find the first occurrence of a character
 * we get the output during pre-processing(i.e during stack building).
 */
public class recur_6 {
    static int firstoccur(int arr[],int data,int index){
        if(index==arr.length){
            return 0;
        }
        if(arr[index]==data){
            return index;
            
        }
        else
            System.out.println("func. called");
            return firstoccur(arr,data,index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,2,3};
       int res= firstoccur(arr,5,0);
        System.out.println(res);
    }
  
}
