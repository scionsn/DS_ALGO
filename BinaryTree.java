
package ds_algo;
import java.util.Scanner;

/**
 *
 * @author SCION
 */
public class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(int data){
        this.data=data;
    }
}
class BinTreeOp{
                Scanner s=new Scanner(System.in);
String str="root";
    BinaryTree insert(){
        System.out.println("enter the data of "+str+"  node");

        int data=s.nextInt();
        if(data==-1)
        {
            return null;
        }
        BinaryTree node=new BinaryTree(data);
str="left";
        node.left=insert();
        str="right";
        node.right=insert();
        return node;
        
    }
    void print(BinaryTree root){
        if(root==null){
            return;
        }
        String op=" ";
        op+=root.data+"-->";
        if(root.left!=null){
            op+="left "+root.left.data;
    }
        if(root.right!=null){
            op+=" right "+root.right.data;
        }
        
        System.out.println(op);
        print(root.left);
		print(root.right);
       
    }
    void preorder(BinaryTree root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
     void postorder(BinaryTree root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
                System.out.println(root.data);

    
    }
      void inorder(BinaryTree root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
      void levelorder(BinaryTree root){
          if(root==null){
              return;
          }
          System.out.println(root.data);
          
          
      }
      int getheight(BinaryTree root){
          if(root==null){
              return 0;
          }
          int max=0;
          int currentheight;
          if(root.left!=null){
            currentheight   =getheight(root.left);
            max=Math.max(max,currentheight);
          }
          if(root.right!=null){
              currentheight=getheight(root.right);
              max=Math.max(max,currentheight);
          
          }
                        return max+1;
      }
//    
    public static void main(String[] args) {
        BinTreeOp node=new BinTreeOp();
        BinaryTree root=node.insert();
                System.out.println("tree print==>");

        node.print(root);
        System.out.println("preorder traversal==>");
        node.preorder(root);
                System.out.println("postorder traversal==>");
                node.postorder(root);
                        System.out.println("inorder traversal==>");
node.inorder(root);
int height=node.getheight(root);
        System.out.println("the height of binary tree is "+height);

        
                
    }
}
