package ds_algo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 * can also be called as 90 degree rotation in a clockwise direction.
 */
public class MatrixTranspose {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]=new int[3][3];
        System.out.println("matrix before transpose  ");
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
//        we need a new matrix for transpose , we cant just make changes in the same matrix, as it will give wrong results.
      System.out.println(" new matrix after transpose  ");
        for(int i[]:arr2){
            for(int z:i){
                System.out.print(z);
            }
            System.out.println();
        }
    
    }
    
}
