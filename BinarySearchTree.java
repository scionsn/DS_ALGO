

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 *
 * @author SCION
 */
class BSTNode{
	int data;
	BSTNode left;
	BSTNode right;
	BSTNode(int data){
		this.data = data;
	}
}
class BSTOperations{
	BSTNode root ;
	void  insert(int data) {
		root = insert(root, data);
        }
	BSTNode insert(BSTNode currentRoot, int data){
		if(currentRoot == null) {
			currentRoot = new BSTNode(data);
			return currentRoot;
		}
		if(data<currentRoot.data) {
			currentRoot.left = insert(currentRoot.left,data);
		}
		else
		if(data>currentRoot.data) {
			currentRoot.right = insert(currentRoot.right , data);
		}
		return currentRoot;
	}
        void remove(BSTNode currentNode, BSTNode parentOfCurrent, boolean isLeft, int data ) {
		if(data>currentNode.data) {
			remove(currentNode.right, currentNode, false,data);
		}
		else
		if(data<currentNode.data) {
			remove(currentNode.left,currentNode, true, data);
		}
		else {
			// it means we found the matching data
			// Case - 1 currentNode left is null and right is null
			if(currentNode.left==null && currentNode.right==null) {
				if(isLeft) {
					parentOfCurrent.left = null;
				}
				else {
					parentOfCurrent.right = null;
				}
			}
			// case -2 currentNode left is null and right is not null
			if(currentNode.left==null && currentNode.right!=null) {
				if(isLeft) {
					parentOfCurrent.left = currentNode.right;
				}
				else {
					parentOfCurrent.right = currentNode.right;
				}
			}
			// case -3 currentNode left is not null and right is  null
			if(currentNode.left!=null && currentNode.right==null) {
				if(isLeft) {
					parentOfCurrent.left = currentNode.left;
				}
				else {
					parentOfCurrent.right= currentNode.left;
				}
			}
			// case -4 currentNode left is not null and right is not null
			if(currentNode.left!=null && currentNode.right!=null) {
				int max = getMax(currentNode.left);
				System.out.println("Left Max is "+max);
				currentNode.data  = max;
				remove(currentNode.left,currentNode,true,max);
				
			}
		}
	}
	void remove(int data) {
		remove(root, null, false,data);
	}
	void inOrder(BSTNode root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
//        for kth smallest elem.
//        int inorder(BSTNode root ,int k){
//            int count=0,ans=0;
//            if(root!=null){
//                inorder(root.left,k);
//                if(++count==k){
//                    ans=root.data;
//                }
//                inorder(root.right,k);
//            }
//            return ans;
//        }
        void preorder(BSTNode root){
            if(root!=null){
                System.out.println(root.data);
                preorder(root.left);
                preorder(root.right);
            }
        }
        //can also be called as breadth first traversal.
        void levelorder(BSTNode root){
            Queue<BSTNode> queue = null ;
queue.add(root);
            if(root==null){
                return;
            }
            System.out.println(queue);
           
             System.out.println(queue.peek());
            while(!queue.isEmpty()){
                BSTNode node=queue.peek();
                System.out.println(node.data);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                            queue.remove();

            }
            
        }
      
        int getMax(BSTNode root){
		if(root.right==null) {
			return root.data;
		
		}
		return getMax(root.right);
	}
        int getMin(BSTNode root){
            if(root.left==null){
               return root.data;
            }
            return getMin(root.left);
            
        }
	BSTNode search(BSTNode root, int dataToSearch){
		if(root == null) {
			return null;
		}
		if(root.data == dataToSearch) {
			return root;
		}
		if(root.data>dataToSearch) {
			return search(root.left,dataToSearch);
		}
		else {
			return search(root.right,dataToSearch);
		}
	}
        
//          BSTNode LCA(BSTNode root,int p,int q){
//            if(root==null){
//                return null;
//            }
//            if(root.data==p||root.data==q){
//                return root;
//            }
//        }
        BSTNode bstfrompreorder(int arr[]){
            return helper(arr,0,arr.length-1);
        }
        
        BSTNode helper(int arr[],int left,int right){
           if(left>right)
               return null;
           int v=arr[left];
           BSTNode root =new BSTNode(v);
           int i=1;
           while(i<arr.length&&arr[i]<left){
               i++;
           }
           root.left=helper(arr,left,i-1);
           root.right=helper(arr,i,arr.length);
           return root;
            
        }
BSTNode BalancedTreeCreation(int arr[],int low,int high){
    if(low>high){
        return null;
        
    }
    int mid=(low+high)/2;
    BSTNode node=new BSTNode(arr[mid]);
    node.left=BalancedTreeCreation(arr,low,mid-1);
    node.right=BalancedTreeCreation(arr,mid+1,high);
    return node;
}
//int KthsmallElem(BSTNode root,int k){
//   return inorder(root,k);
//}

}
public class BinarySearchTree {
    public static void main (String[] args) {
		// TODO Auto-generated method stub
                int arr[]={10,15,20,25,30,35,40};
		BSTOperations b = new BSTOperations();
               BSTNode root= b.BalancedTreeCreation(arr, 0, arr.length-1);
//               int arr2[]={8,5,1,7,10,12};
//               b.bstfrompreorder(arr2);
            
//                
//		b.insert(100);
//		b.insert(95);
//		b.insert(90);
//		b.insert(97);
//		b.insert(65);
//		b.insert(120);
//		
                 
//              System.out.println(b.KthsmallElem(b.root, 3));  

//                b.delete(120);
//		b.inOrder(root);
//                b.preorder(root);
//b.levelorder(b.root);
//b.verticalview(b.root);
//		System.out.println(b.search(b.root, 90)==null?"Not FOund":"Found");
//		System.out.println("MAx Value is "+b.getMax(b.root));
//                System.out.println("min value is "+b.getMin(b.root));

	}
}
