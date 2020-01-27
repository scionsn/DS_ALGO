/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 *
 * @author SCION
 */
public class recurs_10 {
/**
 find the sum of elements 
 */

    static int sumofelem(int num){
        if(num==0)
        {
            return 0;
        }
        else
            return (num%10+sumofelem(num/10));
      }
    
    public static void main(String[] args) {
//        this code is much simpler as compared to  array
        int num=23456;
        int res=sumofelem(num);
        System.out.println("the sum is:  "+res);
//        the below code finds the sum of elements using an array.
//        int arr[]={1,2,3,5};
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);
    }
}


