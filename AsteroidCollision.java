import java.util.Stack;

public class AsteroidCollision {
	public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }
//            if the element is negative
            else{
//            	if the current negative elem is greater in value with the peak of the stack
            while(!stack.isEmpty()&&stack.peek()>0&&stack.peek()<Math.abs(asteroids[i])){
                stack.pop();
            }
//            if the current negative element is greater in value from all elements in stack
//            such that our stack becomes empty and now we add our current negative element.
//            or if the element on the top of the  stack is negative too so we just add our current
//            element in the stack.
            if(stack.isEmpty()||stack.peek()<0){
                stack.push(asteroids[i]);
            }
//            if the elmenst are equal and opp in sign
            if(stack.peek()==Math.abs(asteroids[i]))
                stack.pop();
            }
        }
        int[] res=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            res[i]=stack.pop();
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
