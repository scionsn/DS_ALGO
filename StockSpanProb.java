
package ds_algo;
import java.util.Stack;

/*
 * @author SCION
 * question-the span of the stacks price on a given day i is defined as max no. of of consec. days 
 * just before the given day, for which the price of the stock on the current day is less than
 * or equal to the price on the given day
 */
public class StockSpanProb {
    
    public static void main(String[] args) {
        int price[]={100,80,60,70,60,75,85,90};
        int span[]=new int[price.length];
        Stack<Integer>  stack=new Stack<>();
        span[0]=1;
        stack.push(0);
        for(int i=1;i<price.length;i++){
            while(!stack.isEmpty()&&price[stack.peek()]<=price[i]){
                stack.pop();
            }
            span[i]=stack.isEmpty()?(i+1):(i-stack.peek());
            //this case is  added only for element 90,when the stack gets empty.
            stack.push(i);
        }
        System.out.println("now the span is:-");
        for(int i:span){
            System.out.println(i);
        }
    }
}
