/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 */
public class insertion_sort {
	public static int[] insertion(int arr[]) {
		int i=0,j=0,temp=0;
		for( i=0;i<arr.length;i++) {
			 temp=arr[i];
			for( j=i-1;j>=0&&temp<arr[j];j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		
		}
		return arr;
	}
    public static void main(String args[]) {
    	int arr[]= {10,11,1,5,2,4};
    	for(int i:insertion(arr)) {
    		System.out.println(i);
    	}
    }
}
