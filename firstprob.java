/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

public class firstprob {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,7};
        int dup[]=new int[200];
//        HashMap<Integer,Integer> hm=new HashMap<>();
//        hm.put(1,1);
//        hm.put(2,2);
//        hm.put(3,3);
//        hm.put(4,4);
//        hm.put(7,7);
//        for(int j=1;j<=7;j++){
//            if(j==5||j==6){
//                System.out.println("this key doesnt exist");
//            }
//            else{
//        System.out.println(hm.get(j));}}
        
        for(int i=0;i<arr.length;i++){
            if(dup[arr[i]]==0){
                dup[arr[i]]++;
            }
            else if(dup[arr[i]]==1){
                System.out.println("boys party");
                return;
        }
    }
                System.out.println("girls party");

    }
}
