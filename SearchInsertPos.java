

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 * Given a sorted array and a target value, 
 * return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
* should be solved using binary search
 */
public class SearchInsertPos {
      public static int searchInsert(int[] nums, int target) {
      if(target>nums[nums.length-1]){
        return nums.length;
    }
          
          int i=0;
       int j=nums.length-1;
while(i<=j){
   int mid=(i+j)/2;
   if(nums[mid]==target)
       return mid;
    if(nums[mid]<target)
        i=mid+1;
    else
        j=mid-1;
    
}
         
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==target)
//                return i;
//            else if(nums[i]==target-1){
//               return i+1;
//            }

            
            
        
        return i;
        
    }
    public static void main(String[] args) {
        int arr[]={3,6,7,8,10};
        int target=5;
       int res= searchInsert(arr,target);
        System.out.println(res);
    }
}
