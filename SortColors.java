/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author SCION
 * Given an array with n objects colored red, white or blue, sort them in-place 
 * so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

 You are not suppose to use the library's sort function for this problem.
 */
public class SortColors {
      public static void sortColors(int[] nums) {
          int count0=0;
          int count1=0;
     for(int i=0;i<nums.length;i++){
         if(nums[i]==0){
             count0++;
         }
         if(nums[i]==1){
             count1++;
         }
     }
          System.out.println(count1+" "+count0);
          for(int i=0;i<count0;i++){
              nums[i]=0;
          }
          for(int i=count0;i<nums.length;i++){
              nums[i]=1;
          }
          for(int i=count0+count1;i<nums.length;i++){
              nums[i]=2;
          }
      for(int i:nums){
          System.out.println(i);
      }

  }
  
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,0,0,0,1,1};
        sortColors(arr);
    }
}
