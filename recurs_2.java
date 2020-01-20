 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 program to print even numbers between five and one and 
 * odd numbers between one and five.
 */
public class recurs_2 {
    static void print(int n){
        if(n==0){
           return;}
        if(n%2==0){
            System.out.println(n);
        }
        print(n-1);
        if(n%2!=0){
            System.out.println(n);
        }
        }
    public static void main(String[] args) {
        print(5);
    }
}
