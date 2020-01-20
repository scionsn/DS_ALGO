/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 bubble sort using recursion.
 */
public class bubble_sort {
    static void bubble(int arr[],int first,int last){
        if(last==0){
            return;
        }
        if(first==last){
//            here we call till last-1 because the last elemnt is the greatest, i.e alredy sorted.
            bubble(arr,0,last-1);
        }
        if(arr[first]>arr[first+1]){
            int temp=arr[first];
            arr[first]=arr[first+1];
            arr[first+1]=temp;
        }
        bubble(arr,first+1,last);
    }
    public static void main(String[] args) {
       int arr[]={90,20,10,6};
       bubble(arr,0,arr.length-1);
    }
}
