class DiameterBT
{
	//defined as the nnumber of nodes on the longest path between two leaf nodes.
	//naive soln
	//find max(1+lh+rh)
	public static int height(Node head)
	{
		if(head == null)
			return 0;
		return 1+Math.max(height(head.left),height(head.right));
	}
	public static int diameter(Node head)
	{
		if(head == null)
			return 0;
		int d1 = 1+height(head.left)+height(head.right);
		int d2 = diameter(head.left);
		int d3 = diameter(head.right);
		return Math.max(Math.max(d1,d2),d3);
	}
	//precompute the height of everyNode and store it in a map
	static Map<Node,Integer> hm = new HashMap<>();
	public static void preprocess(Node head)
	{
		if(head == null)
		{
			hm.put(head,0);
			return;
		}
		else
		{
			int z = 1+Math.max(height(head.left),height(head.right));
			hm.put(head,z);
			return;
		}
	}
	public static int fun(Node head)
	{
		preprocess(head);
		if(head == null)
			return 0;
		int d1 = hm.get(head);
		int d2 = hm.get(head.left);
		int d3 = hm.get(head.right);
		return Math.max(Math.max(d1,d2),d3);
	}
	//efficient Approach.
	//we modify the height function and use it to get the correct output.
	static int res = 0;
	public static int diameter(Node head)
	{
		if(head == null)
			return 0;
		int lh = diameter(head.left);
		int rh = diameter(head.right);
		res = Math.max((lh+rh+1),res);
		return (1+Math.max(lh,rh)); //same as height function
	}
}