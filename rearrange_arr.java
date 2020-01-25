
package ds_algo;

/**
 rearrange the array so that the negative numbers appear before the positive numbers.
 *  first v fill  the second arr with the negative numbers and then with the positive numbers with the help 
 * of another variable j that is incremented so as to position the elements correctly.
 */
public class rearrange_arr {
    public static void main(String[] args) {
        int arr[]={-12,11,-13,-5,6,-7,5,-3,-6};
        int arr2[]=new int[9];
int j=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]<0){
               arr2[j++]=arr[i];           
           }
           
       }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr2[j++]=arr[i];
        }
            
    }
        for(int i:arr2){
            System.out.println(i);
        }
}
}
