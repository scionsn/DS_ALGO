/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 rotate an array n number of times either in left or right direction.
 */
public class rotate_arr {
//  the approach is a good approach,since it solves it in better time.
	/*This approach is based on the fact that when we rotate the
	 *  array k times, k%nk elements from the back end of the array 
	 *  come to the front and the rest of the elements from the front shift backwards.

In this approach, we firstly reverse all the elements of the array. Then, reversing 
the first k elements followed by reversing the rest n-kn−k elements gives us the required result.
	 * Let n = 7 and k = 3

Original List                   : 1 2 3 4 5 6 7
After reversing all numbers     : 7 6 5 4 3 2 1
After reversing first k numbers : 5 6 7 4 3 2 1
After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
  
	 */
	static void rotate(int arr[],int k) {
		k=k%arr.length;
//		the above condition helps us when k is greater than arr.length, and also works absolutely fine when k <arr.length
//		as k when divided by a bigger number would always give k itself and would give something less when 
//		k is greater than that number
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length);
		
	}
    static void reverse(int arr[], int start, int end){
		int temp = 0;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
                }       
	}
// the approach below is correct for all test cases but takes too much time.
    static void reverse2(int arr[],int k) {
    	int dummy[]=new int[arr.length];
    	while(k>0) {
        	int last=arr[arr.length-1];
    	for(int i=0;i<arr.length-1;i++) {
    	dummy[i+1]=arr[i];
    	
    	}
    	dummy[0]=last;
    	k--;
    	for(int i=0;i<arr.length;i++) {
    		arr[i]=dummy[i];
    	}
    	
    	}
    	for(int i:dummy) {
    		System.out.println(i);
    	}
    }
	
        //the below code gives a time complexity of O(n2). thus it is a naive approach.
//    static void rotate_arr(int arr[],int shift_count,String direction){
//        int temp=0;
//        if(direction=="right"){
//            while(shift_count>0){
//                                     temp=arr[arr.length-1];//temp changes with each rotation.
//                for(int i=arr.length-1;i>0;i--){
//                    arr[i]=arr[i-1];    
//                }
//                arr[0]=temp;
//                shift_count--;
//            }
//        }
//        else if(direction=="left"){
//        while(shift_count>0){
//                            temp=arr[0];
//
//            for(int i=0;i<arr.length-1;i++){
//                arr[i]=arr[i+1];
//            }
//            arr[arr.length-1]=temp;
//            shift_count--;
//        }
//        }
//        else{
//            System.out.println("incorrect direction entered");
//            return;
//        }
//        for(int i:arr){
//            System.out.println(i);
//    }
//    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
		rotate(arr,2);
//		print();
//        reverse2(arr,2);




//        int shift_count=2;//rotates the array n times, depending on its value.
//        String direction;
        
    }
   
}
