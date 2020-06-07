/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author SCION
 * Suppose you have a random list of people standing in a queue. 
 * Each person is described by a pair of integers (h, k), 
 * where h is the height of the person and k is the number of people 
 * in front of this person who have a height greater than or equal to h.
 * Write an algorithm to reconstruct the queue.
 */
public class QueueReconstructByHeight {
    static int[][] meth(int arr[][]){
       Arrays.sort(arr,new Comparator<int[]>(){
           @Override
           public int compare(int a[],int b[]){
               if(b[0]==a[0])
                   return a[1]-b[1];
               else 
                   return 
                           b[0]-a[0];
           }
       });
       List<int[]> lis=new ArrayList<>();
     for(int i[]:arr){
lis.add(i[1],i);

        }
     int n=arr.length;
     
return lis.toArray(new int[n][2]);
//    for(int i=0;i<arr.length;i++){
//        System.out.println(arr[i][0]+ "  "+arr[i][1]);
//    }
   
    
    }
   
    public static void main(String[] args) {
            int arr[][]={
                {7,0},
                {4,4},
                {7,1},
                {5,0},
                {6,1},
                {5,2}
            };
           for(int i[]:meth(arr))
           {
               System.out.println(i[0]+" "+i[1]);
           }
            
    }
}
