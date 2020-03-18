package ds_algo;


public class queue {
   static int q[]=new int[5];
    static int front=-1,rear=-1;
    static void enq(int data){
        if(rear==q.length-1){
            System.out.println("overflow");
        }
        else if(front==-1&&rear==-1){
            front=rear=0;
            q[rear]=data;
        }
        else{
    rear++;
    q[rear]=data;}
    
}
    static void dq(){
        if(front==-1&&rear==-1){
            System.out.println("underflow");
        }
        else if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            System.out.println("element dqued:-"+q[front]);
            front++;
        }
    }
    static void display(){
        if(front==-1&&rear==-1){
            System.out.println("mpty q");
        }
        else{
        for(int i=front;i<=rear;i++){
            System.out.println("q is:-"+q[i]);
        }}
    }
    static void peek(){
        System.out.println("element on front is:-"+q[front]);
    }
    public static void main(String[] args) {
enq(1);
enq(2);
enq(3);
dq();
enq(4);
dq();
peek();
display();
    }
    
}
