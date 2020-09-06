import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Given two binary search trees root1 and root2.

//Return a list containing all the integers from both trees sorted in ascending order.

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
public class AllElementsinTwoBinarySearchTrees {
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		inorderhelper(root1,list1);
		inorderhelper(root2,list2);
		return merge(list1,list2);
	}
	void inorderhelper(TreeNode root,List<Integer> list){
		if(root==null)
			return ;
		inorderhelper(root.left,list);
		list.add(root.val);
		inorderhelper(root.right,list);	

	}
	List<Integer> merge(List<Integer> list1,List<Integer> list2){
		List<Integer> res=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<list1.size()){
			res.add(list1.get(i++));
		}
		while(j<list2.size()){
			res.add(list2.get(j++));
		}

		Collections.sort(res);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
