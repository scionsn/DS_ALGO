/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 rotate an array n number of times either in left or right direction.
 */
public class rotate_arr {
    //the below code gives a time complexity of O(n).
    //and is only used to reverse the array in the left direction.
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
	static void print(int arr[]) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
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
        int arr[]={90,1,20,2,4,6,100};
		int rotateTimes = 2;
		reverse(arr, 0,rotateTimes-1);
		//1 90 20 2 4 6 100 
		print(arr);
		reverse(arr, rotateTimes, arr.length-1);
		// 1 90 100 6 4 2 20 
		print(arr);
		reverse(arr, 0, arr.length-1);
		print(arr);




//        int shift_count=2;//rotates the array n times, depending on its value.
//        String direction;
        
    }
   
}
