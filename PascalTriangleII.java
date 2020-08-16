import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	 public static List<Integer> getRow(int rowIndex) {
	        List<Integer> res=new ArrayList<>();
res.add(1);
for(int i=1;i<=rowIndex;i++) {
	for(int j=res.size()-1;j>0;j--) {
		res.set(j,res.get(j-1)+res.get(j));
	}
	res.add(1);
}

return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=3;
System.out.println(getRow(k));
	}

}
