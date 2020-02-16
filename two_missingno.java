
package ds_algo;
/*
 to find the two missing numbers in an array.
 *with and without hashing.
 */
public class two_missingno {
    public static void main(String[] args) {
      int arr[]={1,2,4,6,7,8};
     int dup[]=new int[9];
    for(int i=0;i<arr.length;i++){
    dup[arr[i]]++;
    
}
 for(int i=1;i<arr.length;i++){
     if(dup[i]==0){
         System.out.println("missing element:-"+i);
     }
 }   
}
}
