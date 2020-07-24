
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
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
	//        prims algo gives us  a min spanning tree
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
				mst.addEdgeUndir(pp.acquiredfrom, pp.vertexname, pp.cost);
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

	//        djikstra gives us shortest path
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
		for(mstpair i:heap) {
			System.out.println(i.vertexname);
		}
		while(!heap.isEmpty()) {
			mstpair pp=heap.poll();
			map.remove(pp.vertexname);
			if(pp.acquiredfrom==null) {
				mst.addVertex(pp.vertexname);
			}
			else {
				mst.addVertex(pp.vertexname);
				mst.addEdgeUndir(pp.acquiredfrom, pp.vertexname, pp.cost);
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
//bft gives me the path from source node to all nodes in graph
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

	//         the below algo gives us strongly connected components
	void  KosarajuSSC(Graph g){
	}
	//           the below function uses kahns algorithm
	Character[] topologicalsort(List<List<String>> list,int n) {
		Character res[]=new Character[n];
		int indegree[]=new int[n];
		Queue<Character> queue=new LinkedList<>();
		for(int i=0;i<indegree.length;i++) {
			indegree[i]=0;
		}
		//        	  we only want that vertex which has an indegree 0.
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<1;j++) {
				indegree[list.get(i).get(1).charAt(0)-'A']=++indegree[list.get(i).get(1).charAt(0)-'A'];
			}
		}
		for(int i=0;i<indegree.length;i++) {

			if(indegree[i]==0) {
				int a='A'+i;
				char c=(char) (a);
				queue.add(c);
			}
		}

		int k=0;
		while(!queue.isEmpty()) {
			char curr=  queue.poll();
			if(k<n) {
				res[k]=curr;
			}
			k++;

			for(int i=0;i<list.size();i++) {
				if(list.get(i).get(0).charAt(0)==curr) {
					indegree[list.get(i).get(1).charAt(0)-'A']= --indegree[list.get(i).get(1).charAt(0)-'A'];	
					if(indegree[list.get(i).get(1).charAt(0)-'A']==0) {
//						System.out.println(list.get(i).get(1).charAt(0));
						queue.add(list.get(i).get(1).charAt(0));
					}
				}

			}
		}

//		for(int i:indegree) {
//			System.out.println(i);
//		}
//		for(char i:queue) {
//			System.out.println(i);
//		}
		return res;

	}
	 public  List<List<Integer>> allPathsSourceToTarget(int[][] graph) {
	        List<List<Integer>> mainlist=new ArrayList();
	        List<Integer> sublist=new ArrayList();
//	        we added zero in sublist before so that 0 can be included in every path as zero is the source node always.
//	        so all the paths will begin from zero only, so in later half, 1 and 2 gets included with zero along with dest.
	        sublist.add(0);

	        helperdfs(0,graph.length-1,mainlist,sublist,graph);
	        System.out.println(mainlist);
	        return mainlist;
	    }
	void helperdfs(int src,int dest,List<List<Integer>> mainlist, List<Integer> sublist,int[][] graph){
		 if(src==dest) {
			 mainlist.add(new ArrayList(sublist));
			 return;
		 }
		 for(int node:graph[src]) {
			 sublist.add(node);
			 helperdfs(node,dest,mainlist,sublist,graph);
			 sublist.remove(sublist.size()-1);
		 }
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
	public void addEdgeUndir(String firstVertex, String secondVertex, int cost) {
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
	public void addEdgeDir(String firstVertex, String secondVertex, int cost) {
		// First Both vertex exist then check there is no edge , then add
		if(containsEdge(firstVertex, secondVertex)) {
			System.out.println("Edge Already Present can't Add");
		}
		else {
			Vertex first = vertices.get(firstVertex);
			first.neighbours.put(secondVertex, cost);
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
		graph.addEdgeUndir("A", "B", 2);
		graph.addEdgeUndir("A", "D", 6);
		graph.addEdgeUndir("B", "C", 3);
		graph.addEdgeUndir("C", "D", 1);
		graph.addEdgeUndir("D", "E", 8);
		graph.addEdgeUndir("E", "F", 5);
		graph.addEdgeUndir("E", "G", 7);
		graph.addEdgeUndir("F", "G", 4);

		Graph graph2 = new Graph();
		graph2.addVertex("A");
		graph2.addVertex("B");
		graph2.addVertex("C");
		graph2.addVertex("D");
		graph2.addVertex("E");
		graph2.addVertex("F");
		graph2.addVertex("G");
		graph2.addVertex("H");
		graph2.addVertex("K");
		graph2.addVertex("I");

		graph2.addEdgeDir("A", "B", 2);
		graph2.addEdgeDir("B", "C", 6);
		graph2.addEdgeDir("C", "D", 3);
		graph2.addEdgeDir("C", "I", 1);
		graph2.addEdgeDir("D", "A", 8);
		graph2.addEdgeDir("I", "E", 5);
		graph2.addEdgeDir("E", "F", 7);
		graph2.addEdgeDir("F", "I", 4);

		graph2.addEdgeDir("G", "F", 5);
		graph2.addEdgeDir("G", "H", 7);
		graph2.addEdgeDir("H", "G", 4);
		graph2.addEdgeDir("H", "K", 4);
		Graph graph3=new Graph();
		graph3.addVertex("A");
		graph3.addVertex("B");
		graph3.addVertex("C");
		graph3.addVertex("D");
		graph3.addVertex("E");
		graph3.addEdgeDir("A", "B", 2);
		graph3.addEdgeDir("A", "D", 6);
		graph3.addEdgeDir("B", "C", 3);
		graph3.addEdgeDir("B", "D", 1);
		graph3.addEdgeDir("D", "C", 8);
		graph3.addEdgeDir("D", "E", 8);


		String graph3matrix[][]= {
				{"A","B"},
				{"A","D"},
				{"B","C"},
				{"B","D"},
				{"D","C"},
				{"D","E"}

		};
		List<List<String>> mainList = new ArrayList<>();
		for(int i=0;i<graph3matrix.length;i++) {
			List<String> subList = new ArrayList<>();
			subList.add(graph3matrix[i][0]);
			subList.add(graph3matrix[i][1]);
			mainList.add(subList);
		}
		System.out.println("adjacency list is:- "+mainList);

		System.out.println("the graph is --->");
		//		graph.print();
		//		graph2.print();
		graph3.print();
		int arr[][]= {{1,2},{3},{3},{}};
		graph3.allPathsSourceToTarget(arr);
//		Character res[]=graph3.topologicalsort(mainList,graph3.vertices.size());
//		System.out.println("topological sort is:- ");
//		for(Character i:res) {
//			System.out.println(i);
//		}
		
		//		System.out.println("get components called---->"+graph.getComponents());
		//		graph.prims().print();
		//		graph.Djikstra("B").print();
		//		graph.Djikstra("B");

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

