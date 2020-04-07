/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 *
 * @author SCION
 * find the sum of the boundary elem of a matrix
 */
public class MatrixBoundarySum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}}; 
        int sum=0;
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
        if(i==0||i==arr.length-1||j==0||j==arr.length-1){
            System.out.print(arr[i][j]);
            sum=sum+arr[i][j];
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
        System.out.println("sum of boundary elem is "+sum);


    
}

}
