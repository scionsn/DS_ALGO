import java.util.HashMap;

//works on the concept of graphs
public class MinSwapsToSortArr {
public static int swap(int arr[]) {
	boolean vis[]=new boolean[arr.length+1];
	HashMap <Integer,Integer> elempos=new HashMap<>();
	int swapcount=0;
	for(int i=1;i<vis.length;i++) {
		elempos.put(i,arr[i-1]);
	}
	for(int i=1;i<vis.length;i++) {
		int next=0;
		if(vis[i]==false) {
			vis[i]=true;
		}
		if(elempos.get(i)==i) {
			continue;
		}
		else {
			int r=elempos.get(i);
			while(!vis[r]) {
				vis[r]=true;
				 next=elempos.get(r);
				 r=next;
				 swapcount++;
			}
		}
	}
	return swapcount;
}
	public static void main(String[] args) {
int arr[]= {2,1,4,3};
System.out.println(swap(arr));
	}

}
