/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author SCION
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class OddEvenLinkedList {
     public ListNode OddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode oddhead=head;
        ListNode evenhead=head.next;
        ListNode even=evenhead;
        while(evenhead!=null&&evenhead.next!=null){
            oddhead.next=evenhead.next;
            oddhead=oddhead.next;
            evenhead.next=oddhead.next;
            evenhead=evenhead.next;
            }
        oddhead.next=even;
        return head;
        
         
    }
    public static void main(String[] args) {
        
    }
   
}
