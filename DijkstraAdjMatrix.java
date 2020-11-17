import java.util.ArrayList;

public class DijkstraAdjMatrix {
	static int[] dijkstra(ArrayList<ArrayList<Integer>> g, int src, int V)
	{
		boolean visited[]=new boolean[V];
		int dist[]=new int[V];
		for(int i=0;i<V;i++){
			visited[i]=false;
			dist[i]=Integer.MAX_VALUE;
		}
		dist[src]=0;
		for(int i=0;i<V;i++){
			// Pick the minimum distance vertex from the set of vertices not 
			// yet processed. u is always equal to src in the first iteration. 
			int value=min_distance(dist,visited,V);
			visited[value]=true;
			for(int j=0;j<V;j++){
				// Update dist[v] only if is not in sptSet, there is an edge from 
				// u to v, and total weight of path from src to  v through u is 
				// smaller than current value of dist[v] 
				if(visited[j]==false&&dist[value]!=Integer.MAX_VALUE&&
						g.get(value).get(j)!=0&&dist[value]+g.get(value).get(j)<dist[j]
						)
				{
					dist[j]=g.get(value).get(j)+dist[value];
				}
			}

		}
		return dist;
	}
	// A utility function to find the vertex with minimum distance value, from 
	// the set of vertices not yet included in shortest path tree 
	static int min_distance(int dist[],boolean visited[],int V){
		int min=Integer.MAX_VALUE, min_index=0;
		for(int i=0;i<V;i++){
			if(dist[i]<=min&&visited[i]==false){
				min=dist[i];
				min_index=i;   
			}

		}
		return min_index;


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
