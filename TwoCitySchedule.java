package leetcode;
//
//
import java.util.Arrays;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author SCION
// */
public class TwoCitySchedule {
     public static int twoCitySchedCost(int[][] costs) {
        int countA=0,countB=0;
        int n=costs.length;
        int sum=0;
        Arrays.sort(costs, (a, b) ->  Math.abs(b[0]-b[1]) - Math.abs(a[0] - a[1]));  
        for(int i=0;i<n;i++)
        {
            if(costs[i][0]<costs[i][1])
            {
                if(countA!=n/2)
                {
                    countA++;
                    sum+=costs[i][0];
                   
                }
                else
                {
                    countB++;
                    sum+=costs[i][1];
                   
                }
   
            }
            else
            {
               
                if(countB!=n/2)
                {
                    countB++;
                    sum+=costs[i][1];
                   
                }
                else
                {
                    countA++;
                    sum+=costs[i][0];
                   
                }
               
            }
           
        }
       
        return sum;     
    }
    public static void main(String[] args) {
        int inp[][]={
             {10,20},
            {30,200},
            {400,50},
            {30,20}
        };
        
        System.out.println(twoCitySchedCost(inp));
    }
}
