
package ds_algo;
import java.util.Stack;
/**
 *
 * @author SCION
 * to find the next greater elem for the elements in an array
 * and if there isn't any then write null
 */
public class NextGreaterElem {  
    public static void main(String[] args)  
    { 
        int arr[] = {98,27,52,12,20,7,27}; 
        Stack<Integer> stack=new Stack<>();
        stack.push(arr[0]);
        System.out.println(stack);
        for(int i=1;i<arr.length;i++){
        
           if(!stack.isEmpty()){
                      int elem= stack.pop();
            while(elem<arr[i]){
                                System.out.println("the NGE for "+elem+"-->"+arr[i]);
                if(stack.isEmpty()){
                    break;
                }
               elem= stack.pop();
            }
              if(elem>arr[i]){
                    stack.push(elem);
                    }
        }
    stack.push(arr[i]);
        }

        while(!stack.isEmpty()){
            int res=stack.pop();
            System.out.println("the NGE for "+res+"-->"+" is -1");
        }
        }
    }



 

