
public class CelebrityProblem {
	int getId(int M[][], int n)
    {
Stack<Integer> stack=new Stack<>();
for(int i=0;i<n;i++){
    stack.push(i);
}
while(stack.size()>1){
    int first=stack.pop();
    int sec=stack.pop();
    if(M[first][sec]==1){
        stack.push(sec);
    }
    else
    stack.push(first);
}
int val=stack.pop();
boolean flag=false;
for(int i=0;i<n;i++){
    if(i==val)
continue;
if(M[i][val]==1&&M[val][i]==0)
flag=true;
   
}
 if(flag)
    return val;
    return -1;

        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
