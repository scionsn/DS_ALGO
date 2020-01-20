/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/** output:-
 *****      
 ****
 ***
 **
 * 
 */
public class recur_10 {
    static void printrow(int num) 
{ 
    if (num == 0) 
        return; 
    System.out.print ("* "); 
    printrow(num - 1); 
}  
static void printpattern(int n, int i) 
{ 
    if (n == 0) {
        return; }
    printrow(i); 
    System.out.println(); 
   
    printpattern(n-1,i-1); 
}
    
    
    public static void main(String[] args) {
        printpattern(5,5);
    }
}
//here there is no function for a col.
