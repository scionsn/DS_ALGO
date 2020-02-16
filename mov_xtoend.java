/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 *
 * @author SCION
 * move x in the arring to end using recursive function
 * I/P:- axbxc
 * O/P:-abcxx
 */
public class mov_xtoend {
    static void movex(String str,char move){
        int count=0;
String nonx="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='x'){
                count++;
            }
            else{
                nonx=nonx+str.charAt(i);
            }
        }
        System.out.println(nonx);
        for(int i=0;i<count;i++){
          nonx=nonx.concat("x");
        }
        
        System.out.println(nonx);
    }

    
      
    public static void main(String[] args) {
        String str="axbxc";
    movex(str,'x');   
    }
}
