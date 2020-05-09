/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.


 * @author SCION
 */
public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        for(int i=0;i<num+1;i++){
            if(i*i==num){
                return true;
               
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(0)?"perf sq":"not perf sq");
    }
}
