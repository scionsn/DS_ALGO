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
    static void rotate_arr(int arr[],int shift_count,String direction){
        int temp=0;
        if(direction=="right"){
            while(shift_count>0){
                                     temp=arr[arr.length-1];
                for(int i=arr.length-1;i>0;i--){
                    arr[i]=arr[i-1];    
                }
                arr[0]=temp;
                shift_count--;
            }
        }
        else if(direction=="left"){
        while(shift_count>0){
                            temp=arr[0];

            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
            shift_count--;
        }
        }
        else{
            System.out.println("incorrect direction entered");
            return;
        }
        for(int i:arr){
            System.out.println(i);
    }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int shift_count=1;//rotates the array n times, depending on its value.
        String direction;
        rotate_arr(arr,1,"left");
        
    }
   
}
