import java.util.HashMap;

public class LRUCache {
	static class Node{
        Node prev;
        Node next;
        int key;
       int value;
       Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
 static HashMap<Integer,Node> map=new HashMap<>();
 static Node head;
     static Node tail;
    static int capacity;
    
    LRUCache(int cap)
    {
        this.capacity=cap;
       head=new Node(-1,-1);
       tail=new Node(-1,-1);
       head.next=tail;
       tail.prev=head;
       
    }

    // This method works in O(1)
    public static int get(int key)
    {
    Node res= map.get(key);   
        if(res==null){
            return -1;
        }
        remove(res);
        insert(res);
        return res.value;
    }

    // This method works in O(1)
    public static void set(int key, int value)
    {
        
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        Node node=new Node(key,value);
        insert(node);
        
        
    }
    public static void insert(Node node){
        map.put(node.key,node);
       node.next = head.next;
		head.next.prev = node;
		node.prev = head;
		head.next = node;
    }
    public static void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
node.next.prev=node.prev;
 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
