class Node{
	int coeff;
	int pow;
	Node next;
	Node(int a,int b)
	{
		coeff=a;
		pow=b;
		next=null;
	}
}
public class PolynomialAddLL {
	public static Node addPolynomial(Node p1,Node p2)
	{
//		the nodes with same power can be added with each other.
//		the greater power is considered first and then smaller. and greater power is moved to the next node and not smaller.
//		same powers nodes are added and both are moved to their next node.
		Node res=new Node(-1,-1);
		Node temp=res;
		while(p1!=null&&p2!=null){
		    if(p1.pow==p2.pow){
		        temp.next=new Node(p1.coeff+p2.coeff,p2.pow);
		        p1=p1.next;
		        p2=p2.next;
		    }
		   else if(p1.pow>p2.pow){
		temp.next=p1;
		p1=p1.next;
		    }
		    else{
		     temp.next=p2;
		p2=p2.next;   
		    }
		     
		    
		temp=temp.next;
		    }
		    if(p1==null)
		    temp.next=p2;
		    else
		    temp.next=p1;
		    return res.next;
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub

}

}
