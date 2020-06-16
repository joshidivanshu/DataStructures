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
}