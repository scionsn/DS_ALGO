/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 *
 * @author SCION
 * print circular array from the given index
 */
public class CircularArray {
  static  void  printCircularArr(char arr[],int size,int printfromindex){
      System.out.println("circular array from "+arr[printfromindex]+" is ");
      for(int i=printfromindex;i<size+printfromindex;i++){
          System.out.println(arr[i%size]);
      }  
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c','d','e','f'};
        int PrintFromIndex=3;
        int size=arr.length;
        printCircularArr(arr,size,PrintFromIndex);
    }
}
