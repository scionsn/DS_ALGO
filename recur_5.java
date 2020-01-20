
package ds_algo;

//question:-check if the array is sorted.
//sorted means that the array is in increasing order
public class recur_5 {
    static boolean issorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
      if(arr[index]>arr[index+1]){
            return false;
        }
      else{
      return   issorted( arr,index+1);
           
      }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
 boolean res= issorted(arr,0) ;  
        if(res==true){
            System.out.println("array is sorted");
        }
        else
            System.out.println("array is not sorted");
  
    }
}
