
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
    BinaryTree search(BinaryTree root,int key){
       if (root == null)  
        return null;  
  
    if (root.data == key)  
        return root;  
    BinaryTree left=search(root.left,key);
    if(left!=null){
        return root.left;
    }
    else{
        BinaryTree right=search(root.right,key);
        return right;
    }
    
  
        
   
  
//    // then recur on left sutree / 
//    boolean res1 = search(root.left, key);  
//    if(res1) return true; // node found, no need to look further 
//  
//    // node is not found in left, so recur on right subtree / 
//    boolean res2 = search(root.right, key);  
//  
//    return res2;  
           
        
        
       
    }
    BinaryTree mirrorimg(BinaryTree root){
        if(root==null){
            return null;
        }
        else{
            mirrorimg(root.left);
            mirrorimg(root.right);
            BinaryTree temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        return root;
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
       void verticalview(BinaryTree root){
            
if(root==null){
    return; 
} 
int height=0;
TreeMap<Integer,ArrayList<Integer>> tree=new TreeMap<Integer, ArrayList<Integer>>();
getverticalview(root,tree,height);
 for (Map.Entry<Integer, ArrayList<Integer>> cm : tree.entrySet()) {
      System.out.println(cm.getValue());
    }
  
        }
        void getverticalview(BinaryTree root,TreeMap<Integer,ArrayList<Integer>> tree,int height){
            if(root==null){
                return;
            }
            if(tree.get(height)==null){
                      ArrayList<Integer> list = new ArrayList<Integer>();
                      list.add(root.data);
                      tree.put(height,list);

            }
            else
            {
                ArrayList<Integer> l=tree.get(height);
                l.add(root.data);
                tree.put(height,l);
      tree.put(height, l);
            }
            getverticalview(root.left,tree, height-1);
            getverticalview(root.right,tree, height+1);
            
        }
        public int countNodes(BinaryTree root) {
        	int count=0;
            if(root==null)
            	return 0;
            else {
            	count++;

            	return 1+countNodes(root.left)+countNodes(root.right);

            }
            
           
        }
       BinaryTree  LCA(BinaryTree root,int p,int q){
            if(root==null){
                return null;
            }
            if(root.data==p||root.data==q){
                return root;
            }
            BinaryTree left=LCA(root.left,p,q);
            BinaryTree right=LCA(root.right,p,q);
            if(left!=null&&right!=null){
                return root;
            }  
            if(left==null){
                return right;
            }
            else 
                return left;
     
        }
//    
    public static void main(String[] args) {
        BinTreeOp node=new BinTreeOp();
        BinaryTree root=node.insert();
                System.out.println("tree print==>");

        node.print(root);
System.out.println(node.search(root, 3)!=null?"exists":"not exists");
node.LCA(root, 3, 4);
BinaryTree ans=node.LCA(root, 3, 4);
        System.out.println("lca is "+ans.data);
        System.out.println(node.countNodes(root));
//        node.verticalview(root);
//        System.out.println("preorder traversal==>");
//        node.preorder(root);
//                System.out.println("postorder traversal==>");
//                node.postorder(root);
        
//                        System.out.println("inorder traversal==>");
//node.inorder(root);
//int height=node.getheight(root);
//        System.out.println("the height of binary tree is "+height);

        
                
    }
}
