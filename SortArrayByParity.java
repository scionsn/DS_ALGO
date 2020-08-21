import java.util.LinkedList;
import java.util.Stack;

//Given an array A of non-negative integers, return an array 
//consisting of all the even elements of A, followed by all the odd elements of A.

//You may return any answer array that satisfies this condition.
public class SortArrayByParity {
	 public static int[] sortArrayByParity(int[] A) {
//		 unoptimized code
//		 int j=0;
//LinkedList<Integer> stack1=new LinkedList<>();	
//LinkedList<Integer> stack2=new LinkedList<>();	
//for(int i=0;i<A.length;i++) {
//	stack1.add(A[i]);
//}
//for(int i=0;i<stack1.size();i++) {
//	if(stack1.get(i)%2==0) {
//		A[j]=stack1.get(i);
//		j++;
//
//	}
//	else {
//		stack2.add(A[i]);
//	}
//}
//while(!stack2.isEmpty()) {
//	A[j]=stack2.poll();
//	j++;
//}
//
//return A;
//		 optimized code
		 int res[]=new int[A.length];
		 int even=0;
		 int odd=A.length-1;
		 for(int i=0;i<A.length;i++) {
			 if(A[i]%2==0) {
				 res[even]=A[i];
				 even++;
			 }
			 else {
				 res[odd]=A[i];
				 odd--;

			 }
		 }
		 return res;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,1,2,4};
for(int i:sortArrayByParity(arr)) {
	System.out.println(i);
}
	}

}
