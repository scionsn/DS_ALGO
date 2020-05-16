/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import static java.lang.Integer.max;

/**
 *
 * @author SCION
 * the solution is implemented without actually considering circular arr.
 * the sol. just focuses on simple array traversing.
 */
public class MaxSumCircularArr {
  static int calcsum(int arr[],int size){
      int max_straightsum=Integer.MIN_VALUE;
      int min_straightsum=Integer.MAX_VALUE;
      int temp_maxsum=0;
      int temp_minsum=0;
      int arr_sum=0;
      for(int i=0;i<size;i++){
      arr_sum+=arr[i];
      temp_maxsum+=arr[i];
      
max_straightsum=temp_maxsum>max_straightsum? max_straightsum=temp_maxsum:max_straightsum;  
temp_maxsum=temp_maxsum<0?0:temp_maxsum;
//        if(temp_maxsum>max_straightsum){
//          max_straightsum=temp_maxsum;
//      }
//      if(temp_maxsum<0){
//          temp_maxsum=0;
//      }
      temp_minsum+=arr[i];
      min_straightsum=temp_minsum<min_straightsum? min_straightsum=temp_minsum:min_straightsum;
      temp_minsum=temp_minsum>0?0:temp_minsum;
//      if(temp_minsum<min_straightsum){
//          min_straightsum=temp_minsum;
//      }
//      if(temp_minsum>0){
//          temp_minsum=0;
//      }
     }
       if(arr_sum==min_straightsum){
          return max_straightsum;
      }
       return max(max_straightsum,(arr_sum-min_straightsum));
      
   }
    public static void main(String[] args) {
        int[] arr={-2,-2,-3,-4};
        int size=arr.length;
       int res= calcsum(arr,size);
        System.out.println(res);
    }
}
