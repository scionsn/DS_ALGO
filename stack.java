package ds_algo;


public class stack {
     static int stk[]=new int[5];
     static int  top=-1;
     static void push(int data){
         if(top==stk.length-1){
             System.out.println("stack oveflow");
         }
         top++;
        stk[top]=data;
    }
    static void pop(){
        if(top==-1){
            System.out.println("stk mpty");
        }
        else{
top--;}
     }
   
     void topelem(){
         if(top==-1){
             System.out.println("mpty stk");
         }
         else{
         System.out.println("top element is:-"+stk[top]);}
     }
    static void show(){
         for(int i=0;i<=top;i++){
             System.out.println(stk[i]);
         }
     }
    public static void main(String[] args) {
      push(2);
      push(3);
      push(4);
      pop();
      pop();
      pop();
      show();
      
      
    }
   
}
