class CycleDetection
{
	public static boolean DFSRec(ArrayList<ArrayList<Integer>> adj,int s,int[] visited,int parent)
	{
		visited[s] = true;
		for(int u : adj.get(s))
		{
			int parent =  adj.get(s);
			if(visited[u] == false)
			{
				if(DFSRec(adj,u,visited,s) == true)
					return true;
			}
			else if( u != parent)
				return true;
		}
		return false;
	}
	public static boolean DFS(ArrayList<ArrayList<Integer>> adj,int s,int[] visited,int parent)
	{
		boolean[] visited = new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(visited[i] == false)
				if(DFSRec(adj,i,visited,-1) == true)
					return true;
		}
		return false;
	}

}