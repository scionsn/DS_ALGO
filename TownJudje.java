/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author SCION
 
In a town, there are N people labeled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given trust, an array of pairs trust[i] = [a, b] representing that the person labeled a trusts the person labeled b.

If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.

 
 */
public class TownJudje {
    public static int findJudge(int N, int[][]trust) {
        int dup[]=new int[N+1];
        for(int i[]:trust){
            dup[i[0]]--;
            dup[i[1]]++;
            
        }
       for(int i=1;i<=N;i++){
           if(dup[i]==N-1){
               return i;
           }
       }
       return -1;


//for(int i=1;i<=N;i++){
//    {
//        for(int j=0;j<=1;j++){
//            System.out.println(trust[i][j]);
//        }
//    }
//}
    }
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,3}};
       int res= findJudge(3,arr);
        System.out.println(res);
    }
}
