
package ds_algo;
      
import java.util.ArrayList;
import java.util.Scanner;

class TreeNode{
	int data;
	ArrayList<TreeNode> children ;
	TreeNode(int data){
		this.data = data;
		this.children = new ArrayList<>();
	}
}
class TreeOperations{
	Scanner scanner = new Scanner(System.in);
	void print(TreeNode root) {
		String str = root.data+" => ";
		for(TreeNode child : root.children) {
			str += child.data+" , ";
		}
		System.out.println(str);
//		for(int i  =0 ; i<root.children.size();i++) {
//			print(root.children.get(i));
//		}
		for(TreeNode child : root.children) {
			print(child);
		}
		
	}
	TreeNode addSubTree() {
		TreeNode parent;
		// 1
		System.out.println("Enter the Data of the Node");
		int data = scanner.nextInt();
		parent = new TreeNode(data);
                
		System.out.println( data+" th Node and Enter the Children");
		int childs = scanner.nextInt();
		for(int i = 1; i<=childs; i++) {
			TreeNode childNode =addSubTree();//recursive call is made and  the left most branch is added first into the tree
//                        ,after that the immediate next branch  is added and at last the right most branch is added to the tree.
			parent.children.add(childNode);
			
		}
		return parent;
	}
        int getheight(TreeNode root){
//            if(root==null){
//                return 0;
//            }
//            if(root.children.isEmpty()){
//                return 1;
//            }
int max=0;   
for(int i=0;i<root.children.size();i++){
    int currentheight=getheight(root.children.get(i));
    max=Math.max(max, currentheight);
    System.out.println(max+"  "+currentheight);
}
return max+1;
 
        }
       
}
public class GenericTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeOperations tp = new TreeOperations();
		TreeNode root =tp.addSubTree();
		tp.print(root);
              int height=  tp.getheight(root);
              System.out.println("height of tree is "+height);
//                tp.getHeight(root);
		

	}

}
