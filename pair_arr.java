/*
 */
package ds_algo;

/**
 given an array,find a pair whose sum is equal to k.
 */
public class pair_arr {
    
    public static void main(String[] args) {
    int arr[]={2,9,6,3,1,10,4};
    int k=9;
    int j=0;
    for(int i=0;i<arr.length-1;i++)
    {
      int find=k-arr[i];
     for(j=i+1;j<arr.length;j++)
    {
     if(find==arr[j]){
    System.out.println(arr[i]+ " "+arr[j]);   
    }       
    }
    }
    }
    }
