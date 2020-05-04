/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
   import java.util.Scanner;

/**
 *
 * @author SCION
 */
public class IntegerToBinary {
 static    public int findComplement(int num) {
         String binary=Integer.toString(num,2);
        String n=" ";
         for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                n=n+"0";
            }
            else  n=n+"1";
        }
     String n2= n.trim();
    int res= Integer.parseInt(n2,2);
     return res;
//        System.out.println(Integer.parseInt(n2,2));
    }

    public static void main(String[] args) 
    {
//        int n;
//        String x = "";
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the Decimal Number:");
//        n = s.nextInt();
//        while(n > 0)
//        {
//            int a = n % 2;
//            x = a + x;
//            n = n / 2;
//        }
        
//        System.out.println("binary value of 100 is "+Integer.toString(100,2));//integer to binary
//        String binary=Integer.toString(5,2);
//        String n=" ";
////        System.out.println(binary);
////       int binary2= Integer.parseInt(binary);
////        System.out.println(binary2);
//        for(int i=0;i<binary.length();i++){
//            if(binary.charAt(i)=='1'){
//                n=n+"0";
//            }
//            else  n=n+"1";
//        }
//        System.out.println("complement is "+n);
////        System.out.println(n.length());
//     String n2= n.trim();
//        System.out.println(Integer.parseInt(n2,2));
        
        
//        System.out.println(Integer.parseInt("010",2));//binary to integer
      int res=findComplement(5);
        System.out.println(res);
    }
} 

