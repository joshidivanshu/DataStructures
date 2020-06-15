class BalancedTrees
{
	//in a balanced tree for every node the difference between the height of leftsubtree
	//and right subtree should not be more than 1.
	//naive solution for balanced trees.
	public static int height(Node head)
	{
		if(head == null)
			return 0;
		return 1+Math.max(height(head.left),height(head.right));
	}
	public static boolean isBalanced(Node head)
	{
		if(head == null)
			return true;
	    int h1 =  isBalanced(head.left);
	    int h2 =  isBalanced(head.right);
	    return(Math.abs(h1-h2)<=1 &&
	    	isBalanced(head.left) && isBalanced(head.right));
	}
}