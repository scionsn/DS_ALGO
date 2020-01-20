
package ds_algo;


public class String_rev {
    public static void revstring(String[] arr) {
        int i=0;
        int j=arr.length-1;
        for(int c=1;c<arr.length;c++){
            if(i<j){
            String temp=arr[i];
           arr[i]=arr[j]; 
           arr[j]=temp;
        }
        i++;
        j--;}
        for(String v:arr){
            System.out.println(v);
        }
    }
    public static void main(String[] args) {
        String arr[]={"h","e","l","l","o"};
        revstring(arr);
    }
}
