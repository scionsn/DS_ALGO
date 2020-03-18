/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 *
 * @author SCION
 implement queue using stack
 * two stacks will be used to implement the queue.
 */
public class QueueUsingStack {
   static int top1=-1, top2=-1,count;
    static int stack1[]=new int[5];
    static int stack2[]=new int[stack1.length-1];
    static void push1(int data){
        if(top1==stack1.length-1){
            System.out.println("stack1 is full");
        }
        else{
       top1++;
       stack1[top1]=data;
    }}
    static void push2(int data){
        if(top2==stack2.length-1){
            System.out.println("stack 2 is full");
            
        }
        else
        {
            top2++;
            stack2[top2]=data;
        }
    }
    static int pop1(){
        return stack1[top1--];
    }
    static int pop2(){
        return stack2[top2--];
    }
    static void enqueue(int data){
        push1(data);
        count++;
    }
    static void dequeue(){
        if(top1==-1){
            System.out.println("queue is empty");
        }
        else{
        for(int i=0;i<count;i++){
           int res1= pop1();
           push2(res1);
        }}
        pop2();
        count--;
        for(int i=0;i<count;i++){
            int res2=pop2();
            push1(res2);
        }
    }
    static void display(){
        for(int i:stack1){
            System.out.println(i);
        }}
    public static void main(String[] args) {
        enqueue(2);
        enqueue(3);
        enqueue(4);
        dequeue();
        enqueue(1);
        dequeue();
        display();
    }
}
