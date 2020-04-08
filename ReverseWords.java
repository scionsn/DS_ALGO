package ds_algo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 * reverse a sentence:-
 * i love java
 * 
 * java love i
 */
public class ReverseWords {
    public static void main(String[] args) {
        String s=" avengers assemble ";
        String dup="";
       int i=s.length()-1;
      while(i>0){
        while(i>=0&&s.charAt(i)==' '){
            i--;
        }
        int j=i;

        while(i>=0&&s.charAt(i)!=' '){
            i--;
           
        }
        if(dup.isEmpty()){
          dup=dup.concat(s.substring(i+1,j+1));
        }
        else{
          dup= dup.concat(" "+s.substring(i+1,j+1));
        }
       
       
//        while(i>=0){
//           
//        }
    }
              System.out.println(dup);

}
}
