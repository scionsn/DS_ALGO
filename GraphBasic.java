
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Set;
/**
 *
 * @author SCION
 */


class mstpair{
String vertexname;
String acquiredfrom;
int cost;

}

class Graph{
	HashMap<String, Vertex> vertices = new HashMap<>();
	
	public int countVertex() {
		return vertices.size();
	}
	public boolean containsVertex(String vertexName) {
		return vertices.containsKey(vertexName);
	}
	public void addVertex(String vertexName) {
		Vertex vertex = new Vertex();
		vertices.put(vertexName, vertex);
	}
	public void removeVertex(String vertexName) {
		// Check the Vertex Neighbours
		// Remove Neighbour links
		// Remove Vertex
		Vertex vertex = vertices.get(vertexName);
		ArrayList<String> neighbourNames = new ArrayList<>(vertex.neighbours.keySet());
              
		for(String key: neighbourNames) {
			Vertex v = vertices.get(key);
			v.neighbours.remove(vertexName);
		}
		vertices.remove(vertexName);
	}
        public  boolean isEdgeExist(String first, String second) {
		
		Vertex firstVertex = vertices.get(first);
		Vertex secondVertex = vertices.get(second);
		if(firstVertex==null || secondVertex==null || !firstVertex.neighbours.
				containsKey(second)) {
			return false;
		}
		return true;
		
		
	}
        Graph prims() {
        	Graph mst=new Graph();
        	HashMap<String,mstpair> map=new HashMap<>();
        	PriorityQueue<mstpair> heap=new PriorityQueue<>((first,second)->first.cost-second.cost);
        	for(String key:vertices.keySet()) {
        		mstpair p=new mstpair();
        		p.vertexname=key;
        		p.acquiredfrom=null;
        		p.cost=Integer.MAX_VALUE;
        		        	heap.add(p);        		
        		        	map.put(key, p);        		        	
        	}
        	while(!heap.isEmpty()) {
        		mstpair pp=heap.poll();
        		map.remove(pp.vertexname);
        		if(pp.acquiredfrom==null) {
        			mst.addVertex(pp.vertexname);
        		}
        		else {
        			mst.addVertex(pp.vertexname);
        			mst.addEdge(pp.acquiredfrom, pp.vertexname, pp.cost);
        		}
        		for(String neighbour:vertices.get(pp.vertexname).neighbours.keySet()) {
        			if(map.containsKey(neighbour)) {
        				int oldcost=map.get(neighbour).cost;
        				int newcost=vertices.get(pp.vertexname).neighbours.get(neighbour);
        				if(newcost<oldcost) {
        					mstpair p2=map.get(neighbour);
        					mstpair p3=new mstpair();
        					p3.vertexname=p2.vertexname;
        					p3.acquiredfrom=pp.vertexname;
        					p3.cost=newcost;
        					heap.remove(p2);
        					heap.add(p3);
        					map.put(neighbour, p3);
        				}
        			}
        		}
        	}
        	return mst;
        }
        
        Graph Djikstra(String source) {
        	Graph mst=new Graph();
        	HashMap<String,mstpair> map=new HashMap<>();
        	PriorityQueue<mstpair> heap=new PriorityQueue<>((first,second)->first.cost-second.cost);
        	for(String key:vertices.keySet()) {
        		mstpair p=new mstpair();
        		p.vertexname=key;
        		p.acquiredfrom=null;
        		p.cost=Integer.MAX_VALUE;
        		        	heap.add(p);        		
        		        	map.put(key, p);        		        	
        	}
        	while(!heap.isEmpty()) {
        		mstpair pp=heap.poll();
        		map.remove(pp.vertexname);
        		if(pp.acquiredfrom==null) {
        			mst.addVertex(pp.vertexname);
        		}
        		else {
        			mst.addVertex(pp.vertexname);
        			mst.addEdge(pp.acquiredfrom, pp.vertexname, pp.cost);
        		}
        		for(String neighbour:vertices.get(pp.vertexname).neighbours.keySet()) {
        			if(map.containsKey(neighbour)) {
        				int oldcost=map.get(neighbour).cost;
        				int newcost=vertices.get(pp.vertexname).neighbours.get(neighbour);
        				if(newcost<oldcost) {
        					mstpair p2=map.get(neighbour);
        					mstpair p3=new mstpair();
        					p3.vertexname=p2.vertexname;
        					p3.acquiredfrom=pp.vertexname;
        					p3.cost=newcost;
        					heap.remove(p2);
        					heap.add(p3);
        					map.put(neighbour, p3);
        				}
        			}
        		}
        	}
        	return mst;

        }
	
        boolean DFS(String source,String destination){
LinkedList<pair> stack=new LinkedList<>();
HashMap<String,Boolean> visited=new HashMap<>();
pair pair=new pair();
pair.vertexname=source;
pair.processtill=source;
stack.addFirst(pair);
while(!stack.isEmpty()){
    pair p=stack.removeFirst();
    if(visited.containsKey(p.vertexname)){
        continue;
    }
    visited.put(p.vertexname,true);
    if(isEdgeExist(p.vertexname,destination)){
        return true;
    }
    Vertex v= vertices.get(p.vertexname);
   Set<String> neighbour=v.neighbours.keySet();

for(String val:neighbour){
    if(!visited.containsKey(val)){
        pair pp=new pair();
        pp.vertexname=val;
        pp.processtill=p.processtill+" "+val;
        stack.addFirst(pp);
    }
}
}
return false;
        }
        boolean BFS (String source, String destination) {
		HashMap<String, Boolean> visitedMap = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		pair pair = new pair();
		pair.vertexname  = source;
		pair.processtill = source;
		queue.addLast(pair);
		while(!queue.isEmpty()) {
			pair p = queue.removeFirst();
			if(visitedMap.containsKey(p.vertexname)) {
				continue;
			}
			visitedMap.put(p.vertexname, true);
			System.out.println(p.vertexname+" "+p.processtill);
			if(isEdgeExist(p.vertexname, destination)) {
				System.out.println(destination);
				return true;
			}
			
			Vertex currentVertex = vertices.get(p.vertexname);
			Set<String> neighbours = currentVertex.neighbours.keySet();
			for(String neighbour : neighbours) {
				if(!visitedMap.containsKey(neighbour)) {
					pair newPair = new pair();
					newPair.vertexname = neighbour;
					newPair.processtill = p.processtill + neighbour;
					queue.addLast(newPair);
				}
			}
			
		}
		return false;
	}

           void BFT (String source) {
		HashMap<String, Boolean> visitedMap = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		pair pair = new pair();
		pair.vertexname  = source;
		pair.processtill = source;
		queue.addLast(pair);
		while(!queue.isEmpty()) {
			pair p = queue.removeFirst();
			if(visitedMap.containsKey(p.vertexname)) {
				continue;
			}
			visitedMap.put(p.vertexname, true);
			System.out.println(p.vertexname+" "+p.processtill);
//			if(isEdgeExist(p.vertexname, destination)) {
//				System.out.println(destination);
//				return true;
//			}
//			
			Vertex currentVertex = vertices.get(p.vertexname);
			Set<String> neighbours = currentVertex.neighbours.keySet();
			for(String neighbour : neighbours) {
				if(!visitedMap.containsKey(neighbour)) {
					pair newPair = new pair();
					newPair.vertexname = neighbour;
					newPair.processtill = p.processtill + neighbour;
					queue.addLast(newPair);
				}
			}
			
		}
	}
           HashMap<String, ArrayList<String>> getComponents () {
       		int component = 0;
       		HashMap<String,ArrayList<String>> componentMap = new HashMap<>();
       		HashMap<String, Boolean> visitedMap = new HashMap<>();
       		LinkedList<pair> queue = new LinkedList<>();
       		int visit = 0;
       		for(String key: vertices.keySet())
       		{
       		if(visitedMap.containsKey(key)) {
       			continue;
       		}
       		ArrayList<String> subList = new ArrayList<>();
//       		we will have two sublists, here one for graph 1 and other for graph 2.
       		visit++;
       		pair pair = new pair();
       		pair.vertexname  = key;
       		pair.processtill = key;
       		queue.addLast(pair);
       		while(!queue.isEmpty()) {
       			pair p = queue.removeFirst();
       			if(visitedMap.containsKey(p.vertexname)) {
       				continue;
       			}
       			visitedMap.put(p.vertexname, true);
       			subList.add(p.vertexname);  // element removed from the queue of the graph
//       			gets Added in SubList
       			System.out.println(p.vertexname+" "+p.processtill);
//       			if(isEdgeExist(p.vertexName, destination)) {
//       				return true;
//       			}
       			Vertex currentVertex = vertices.get(p.vertexname);
       			Set<String> neighbours = currentVertex.neighbours.keySet();
       			for(String neighbour : neighbours) {
       				if(!visitedMap.containsKey(neighbour)) {
       					pair newPair = new pair();
       					newPair.vertexname = neighbour;
       					newPair.processtill = p.processtill + neighbour;
       					queue.addLast(newPair);
       				}
       			}
       			
       		} // Queue Ends
       		component++;
       		componentMap.put("Component"+component, subList);
//       		here the graph no is concatenated with the string in hashmap.
//       		each graph has different sublist values
       		}
//       		the for loop ends above
       		return componentMap;
       	}
       	
           
            boolean CycleExists (String source) {
		HashMap<String, Boolean> visitedMap = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		pair pair = new pair();
		pair.vertexname  = source;
		pair.processtill = source;
		queue.addLast(pair);
		while(!queue.isEmpty()) {
			pair p = queue.removeFirst();
			if(visitedMap.containsKey(p.vertexname)) {
				return true;
			}
			visitedMap.put(p.vertexname, true);
			System.out.println(p.vertexname+" "+p.processtill);
//			if(isEdgeExist(p.vertexname, destination)) {
//				System.out.println(destination);
//				return true;
//			}
//			
			Vertex currentVertex = vertices.get(p.vertexname);
			Set<String> neighbours = currentVertex.neighbours.keySet();
			for(String neighbour : neighbours) {
				if(!visitedMap.containsKey(neighbour)) {
					pair newPair = new pair();
					newPair.vertexname = neighbour;
					newPair.processtill = p.processtill + neighbour;
					queue.addLast(newPair);
				}
			}
			
		}
                return false;
	}
            
                boolean IsConnected () {
		HashMap<String, Boolean> visitedMap = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
                int visit=0;
                for(String keys:vertices.keySet()){
                    if(visitedMap.containsKey(keys)){
                        continue;
                    }
                
                visit++;
		pair pair = new pair();
		pair.vertexname  = keys;
		pair.processtill = keys;
		queue.addLast(pair);
		while(!queue.isEmpty()) {
			pair p = queue.removeFirst();
			if(visitedMap.containsKey(p.vertexname)) {
				return true;
			}
			visitedMap.put(p.vertexname, true);
			System.out.println(p.vertexname+" "+p.processtill);
//			if(isEdgeExist(p.vertexname, destination)) {
//				System.out.println(destination);
//				return true;
//			}
//			
			Vertex currentVertex = vertices.get(p.vertexname);
			Set<String> neighbours = currentVertex.neighbours.keySet();
			for(String neighbour : neighbours) {
				if(!visitedMap.containsKey(neighbour)) {
					pair newPair = new pair();
					newPair.vertexname = neighbour;
					newPair.processtill = p.processtill + neighbour;
					queue.addLast(newPair);
				}
			}
			
		}
                }
                return visit==1;
	}


	public int numberOfEdges() {
		ArrayList<String>  keys = new ArrayList<>(vertices.keySet());
		int count = 0;
		for(String key : keys) {
			Vertex vtx = vertices.get(key);
			count+= vtx.neighbours.size();
		}
		return count/2;
	}
	public boolean containsEdge(String firstVertex, String secondVertex ) {
		
		Vertex v1 = vertices.get(firstVertex); 
		Vertex v2 = vertices.get(secondVertex);
		//if first vertex not exist or second vertex not exist, or second vertex not is neighbour of first 
		if(v1==null || v2==null || !v1.neighbours.containsKey(secondVertex)) {
			return false;
		}
		return true;
		
	}
	public void addEdge(String firstVertex, String secondVertex, int cost) {
		// First Both vertex exist then check there is no edge , then add
		if(containsEdge(firstVertex, secondVertex)) {
			System.out.println("Edge Already Present can't Add");
		}
		else {
			Vertex first = vertices.get(firstVertex);
			Vertex second = vertices.get(secondVertex);
			first.neighbours.put(secondVertex, cost);
			second.neighbours.put(firstVertex, cost);
		}
	}
	public void removeEdge(String first, String second) {
		if(containsEdge(first, second)) 
                {
			Vertex firstVertex = vertices.get(first);
			Vertex secondVertex = vertices.get(second);
			firstVertex.neighbours.remove(second);
			secondVertex.neighbours.remove(first);
		}
		else {
			System.out.println("No Edge Present so Can't Delete");
		}
	}
	public void print() {
		System.out.println("******************************");
		for(Map.Entry<String, Vertex> v : vertices.entrySet()) {
			System.out.println(v.getKey()+" "+v.getValue().neighbours);
		}
		System.out.println("******************************");
	}
	
}
//hasPath(){
//	
//}
class Vertex{
	// String key is vertex name
	// Integer value is Edge cost
	HashMap<String, Integer> neighbours = new HashMap<>();
}
class pair{
    String vertexname;
    String processtill;
}
 class GraphBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 6);
		graph.addEdge("B", "C", 3);
		graph.addEdge("C", "D", 1);
		graph.addEdge("D", "E", 8);
		graph.addEdge("E", "F", 5);
		graph.addEdge("E", "G", 7);
		graph.addEdge("F", "G", 4);
		System.out.println("the graph is --->");
		graph.print();
//		System.out.println("get components called---->"+graph.getComponents());
		graph.prims().print();
		
//                System.out.println("is graph connected?----->"+graph.IsConnected());
//               System.out.println("no. of vertices in graph are "+graph.countVertex()); 
//graph.BFT("F");
//            System.out.println(graph.CycleExists("A"));
//		          System.out.println(graph.DFS("A","E"));
//		System.out.println("Count Vertex "+graph.countVertex());
//		System.out.println("Count Edges "+graph.numberOfEdges());
//		System.out.println("Contain Vertex D "+graph.containsVertex("D"));
//		System.out.println("Contain Vertex Z "+graph.containsVertex("Z"));
//		System.out.println("Contains Edge Between A And B "+graph.containsEdge("A", "B"));
//		System.out.println("Contains Edge Between A and C "+graph.containsEdge("A", "C"));
//		System.out.println("Remove A Edge B/W A and B");
//		graph.removeEdge("A", "B");
//		graph.print();
//		System.out.println("Remove D Vertex");
//		graph.removeVertex("D");
//		graph.print();
//		System.out.println("Add D Vertex Again");
//		graph.addVertex("D");
//		graph.print();
		
	}

}

