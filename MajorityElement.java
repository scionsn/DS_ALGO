/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 *
 * @author SCION
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.
 */
//solve using hashtable
public class MajorityElement {
    public static int majorityElement(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(); 
  
        for(int i = 0; i < nums.length; i++) { 
            if (map.containsKey(nums[i])) { 
                    int count = map.get(nums[i]) +1; 
                    if (count > nums.length /2) { 
                        return nums[i];
                    } else
                        map.put(nums[i], count); 
  
            } 
            else
                map.put(nums[i],1); 
            } 
return nums[0];
        }
    public static void main(String[] args) {
        int arr[]={2147483647};
       int val= majorityElement(arr);
        System.out.println("max occur "+val);
    }
}
