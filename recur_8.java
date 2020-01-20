/*
  Q:-to find the total occurrence of a character

 */
package ds_algo;
public class recur_8 {
    static int[] totaloccur(int arr[],int data,int index,int count){
        int res[]=null;
        if(arr.length==index){
            int a[]=new int[count];
            return a;
        }
        if(arr[index]==data){
            res=totaloccur(arr,data,index+1,count+1);
        }
        else{
            res=totaloccur(arr,data,index+1,count);
        }
//        the below code is checked during post-processing.
        if(arr[index]==data){
            res[count]=index;
            return res;
        }
        else
        {
            return res;
        }
//        the below code only displays total occurences of a character
//        if(arr.length==index){
//            System.out.println(count);
//            return ;
//        }
//        if(arr[index]==data){
//          
//            totaloccur(arr,data,index+1,count+1);
//        }
//        else 
//                   totaloccur(arr,data,index+1,count);
//
    }
    public static void main(String[] args) {
        int arr[]={10,20,10,90,10,100};
       int result[]= totaloccur(arr,10,0,0);
       for(int i:result){
           System.out.println( i);
       }
//         int arr[]={1,2,1,2,1,3};
//       totaloccur(arr,3,0,0);
    }
}
