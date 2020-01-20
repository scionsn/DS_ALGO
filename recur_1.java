/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

// 54321 and 12345 can both be printed using the same logic but changing the order of print statements.
// 54321 is printed using tail recursion while 12345 is not.
public class recur_1 {
    static void print(int n){
        if(n==0){
            return;}
        System.out.println(n);//this is an example of tail recursion.
        print(n-1);
        System.out.println(n);
        /*
        output:-
        5
        4
        3
        2
        1
        1
        2
        3
        4
        5
        
        */
         
      
    }
    public static void main(String[] args) {
        print(5);
    }
}
