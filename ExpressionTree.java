import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
class Node
{
    String data;
    Node left,right;

    Node(String data)
     {
     this.data = data;
     this.left = null;
     this.right = null;
     }

}
public class ExpressionTree {
	public static int example() throws Exception {
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	String s="1+2";
	return (int)engine.eval(s);
	
	}
	 public int evalTree(Node root) throws Exception {
		   return helper(root);
		    }
		    public int helper(Node root) throws Exception{
		      if(root==null)
		      return 0;
		      if(root.left==null&&root.right==null)
		      return ToInt(root.data);
		     int left= helper(root.left);
		      int right=helper(root.right);
		      String s=root.data;
		      if(s.equals("+"))
		      return left+right;
		      else if(s.equals("-"))
		      return left-right;
		      else if(s.equals("*"))
		      return left*right;
		      else
		      return left/right;
		    }
		    public int ToInt(String s) throws Exception{
		        int res=Integer.parseInt(s);
		        return res;
		    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		

	}

}
