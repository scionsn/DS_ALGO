/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;
// NOTE: 1) we add the ascii values of the chracters of first and second string, 
//       2)  and then we compare the ascii values, if itis same then we say that the two strings are anagramm
public class fifthprog {
    public static void main(String[] args) {
        String val1="listen";
        String val2="silent";
        int sum1=0;
        int sum2=0;
        int disp;
        int disp2;
System.out.println(" ascii val of each char of first string:-");
        for(int i=0;i<6;i++){
           disp=  val1.charAt(i);
            System.out.println(disp);
            sum1=sum1+disp;
        }
        System.out.println("sum of ascii values of first string:-"+sum1);
        System.out.println("ascii values of each char of second string");
        for(int j=0;j<6;j++){
             disp2=val2.charAt(j);
            System.out.println(disp2);
            sum2=sum2+disp2;
        }
                System.out.println("sum of ascii values of 2nd string:-"+sum2);
                if(sum1==sum2){
                    System.out.println("anagram string");
                }
                else { 
                    System.out.println("not anagram string");
                }  
    }    
}
