/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

import java.util.PriorityQueue;

/**
 *
 * @author SCION
 */
public class MinCostRopes {
    public static int mincost(int arr[]){
    PriorityQueue<Integer> q = new PriorityQueue<>();
    for(int i=0;i<arr.length;i++){
q.add(arr[i]);
    }
    int cost=0;
    while(q.size()>1){
        int temp=q.poll() +q.poll();

         cost+=temp;
                          q.add(temp);

    }
    return cost;
    }
    public static void main(String[] args) {
        int arr[]={20,4,8,2};
        
        System.out.println(mincost(arr)); 
    }
}
