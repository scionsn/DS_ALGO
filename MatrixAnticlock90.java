package ds_algo;

import <any?>;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 * rotate the matrix anticlockwise by 90 deg.
 * 123    369
 * 456--> 258
 * 789    147
 */
public class MatrixAnticlock90 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
                int arr2[][]=new int[3][3];
                int temp;
 System.out.println("matrix before transform  ");
        for(int i[]:arr){
            for(int z:i){
                System.out.print(z);
            }
            System.out.println();
        }
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                              arr2[i][j]=arr[j][i];
            }
        }
         outer:
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                             temp=arr2[i][j];
                             arr2[i][j]=arr2[arr.length-1][j];
                             arr2[arr.length-1][j]=temp;
                             
                             
            }
            break outer;
            //we provide a label so as to break out from the outer loop. here neither return nor continue nor simple break would have worked.
        }
         System.out.println("matrix after transform  ");
        for(int i[]:arr2){
            for(int z:i){
                System.out.print(z);
            }
            System.out.println();
        }
        
    }
   
}
