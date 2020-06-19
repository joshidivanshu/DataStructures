class ShortestPathUnweightedGraph
{
	public static void BFS(ArrayList<ArrayList<Integer>> adj,int v,int s)
	{
		boolean[] visited = new boolean[v+1];
		visited[s] = true;
		int[] dist = new int[v];
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[s] = 0;
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		while(!q.isEmpty())
		{
			int u = q.poll();
			for(int v : adj.get(u))
			{
				if(visited[v] == false)
				{
					dist[v] = dist[u]+1;
					visited[v] = true;
					q.add(v);
				}
			}
		}
		for(int i=0;i<v;i++)
			System.out.print(dist[i]+" ");
	}
}