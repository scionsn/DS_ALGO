package ds_algo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 */
public class QuickSort {
   static  void quicksort(int arr[],int low,int high){
		if(low>high) { // Base case
			return ;
		}
		int mid = (low + high)/2;
		int pivot  = arr[mid];
		int left = low;
		int right = high;
		// Processing Logic
		while(left<=right) {
			while(arr[left]<pivot) {
				left++;
			}
			while(arr[right]>pivot) {
				right--;
			}
			if(left<=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quicksort(arr, low, right); // Small Problem
		quicksort(arr, left, high);
	}

    
    public static void main(String[] args) {
        int arr[] = {40,20,50,30,60,10};
        quicksort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
     
    }
}
