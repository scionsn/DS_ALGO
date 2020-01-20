/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;
//note: if we dont get an answer when moving from left to right then we should try to find the answer from right to left.
//in this step we compare 2 with the items left to it, and make them the leader subsequently. 
//and we should compare the leader with another leader only.
public class seventhprob {
    public static void main(String[] args) {
        int arr[]={300,40,60,90,100,12,16,17,4,3,5,2};
        int n=arr.length;
        int leader=arr[n-1];
        System.out.println(leader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>leader){
                leader=arr[i];
                  System.out.println(leader);
               
                
            }
             
        }
       
    }
}
