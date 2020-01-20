/*
 Q:-to find the last occurrence of a character
 */
package ds_algo;

public class recur_7 {
     static int lastoccur(int arr[],int data,int index){
        if(index==-1){
            return 0;
        }
        if(arr[index]==data){
            return index;
            
        }
        else
            System.out.println("func. called");
            return lastoccur(arr,data,index-1);
    }
    public static void main(String[] args) {
      int arr[]={1,2,1,2,3};
       int res= lastoccur(arr,2,arr.length-1);
        System.out.println(res);  
    }
    
}
