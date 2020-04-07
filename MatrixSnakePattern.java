/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 *
 * @author SCION
 * print the matrix in a snake pattern
 */
public class MatrixSnakePattern {
    public static void main(String[] args) {
        int []arr[]={{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<arr.length;i++){
        if(i%2==0){
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[i][j]);
        }
        }
        else{
            for(int j=arr.length-1;j>=0;j--){
                System.out.println(arr[i][j]);
            }
        }
    }
    
    }
}
