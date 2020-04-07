/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 *
 * @author SCION
 */
public class TwoDArrayDiagnols {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum1=0;
        int sum2=0;
        
//        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j<=i){
                System.out.print(arr[i][j]);
                sum1=sum1+arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("sum of upper triangle is "+sum1);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j>=i){
                System.out.print(arr[i][j]);
                
                sum2=sum2+arr[i][j];
                }
                else
                    
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("sum of lower triangle is "+sum2);
       
          
        
//        for(int i[]:arr){
//            for(int z:i){
//                System.out.print(z);
//            }
//            System.out.println();
//            
//        }
    }
}
