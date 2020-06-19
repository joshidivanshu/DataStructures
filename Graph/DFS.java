import java.util.*;
class DFS
{
	//connected graph when source vertex is given.
	public static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited)
	{
		visited[s] = true;
		System.out.print(s+" ");
		for(int v : adj.get(s))
		{
			if(visited[v] == false)
				DFS(adj,v,visited);
		}
	}
	public static void DFS(ArrayList<ArrayList<Integer>> adj,int s)
	{
		boolean[] visited = new boolean[v];
		DFSRec(adj,s,visited);

	}
	//for disconnected graph.
	public void DFSDisconnected(ArrayList<ArrayList<Integer>> adj,int s)
	{
		boolean[] visited = new boolean[v+1];
		for(int i=0;i<v;i++)
		{
			if(visited[i] == false)
				DFSRec(adj,i,visited);
		}
	}
}