import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class RecontructItinerary {
	 public List<String> findItinerary(List<List<String>> tickets) {
	        HashMap<String, PriorityQueue<String>> mp=new HashMap<>();
	        for(int i=0;i<tickets.size();i++) {
	        	String key=tickets.get(i).get(0);
	        	String dest=tickets.get(i).get(1);
	        	if(!mp.containsKey(key)) {
	        		PriorityQueue<String> des=new PriorityQueue<>();
	        		mp.put(key,des);
	        	}
	        mp.get(key).add(dest);
	        }
	        LinkedList<String> result=new LinkedList<>();
	       helper("jfk",mp,result);
	       return result;
	        
	    }
	 void helper(String dep,HashMap<String,PriorityQueue<String>> mp,LinkedList<String> result) {
		PriorityQueue<String> arrival=mp.get(dep);
		while(!arrival.isEmpty()&&arrival!=null) {
			helper(arrival.poll(),mp,result);
		}
		result.addFirst(dep);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
