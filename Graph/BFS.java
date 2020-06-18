import java.util.*;
class BFS
{
	//given an undirected graph and a source vertex 's' print BFS from the given source.
	public static void BFS(ArrayList<ArrayList<Integer>> adj,int v,int src)
	{
		boolean[] visited = new boolean[v+1];
		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.add(s);
		while(!q.isEmpty())
		{
			int u = q.poll();
			System.out.print(u+" ");
			for(int v : adj.get(u))
			{
				if(visited[v] == false)
				{
					visited[v] = true;
					q.add(v);
				}
			}
		}
	}
	//we are given a disconnected graph	and not given a source and want to traverse all the vertex of the graph.
	public static void BFS2(ArrayList<ArrayList<Integer>> adj,int v,int s)
	{
		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.add(s);
		while(!q.isEmpty())
		{
			int u = q.poll();
			System.out.print(u+" ");
			for(int v : adj.get(u))
			{
				if(visited[v] == false)
				{
					visited[s] = true;
					q.add(s);
				}
			}
		}

	}
	public static void BFSDis(ArrayList<ArrayList<Integer>> adj,int v)
	{
		boolean visited[] = new boolean[v+1];
		for(int i=0;i<v;i++)
		{
			if(visited[i] == false)
				BFS2(adj,v,i);
		}
	}
}