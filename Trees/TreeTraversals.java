class TreeTraversals
{
	//recursive approach for inorder traversal
	//inorder traversal : left substree-> root -> right subtree
	public static Node inOrder(Node head)
	{
		if(head == null)
			return null;
		inOrder(root.left);
		System.out.print(root.key+" ");
		inOrder(root.right);
	}
	//preorder traversal : root -> left subtree -> right subtree.
	public static Node preOrder(Node head)
	{
		if(head == null)
			return null;
		System.out.print(head.key+" ");
		preOrder(head.left);
		preOrder(head.right);
	}
	//postorder traversal : left subtree-> rightsubtree -> root
	public static Node postOrder(Node head)
	{
		if(head == null)
			return null
		preOrder(head.left);
		preOrder(head.right);
		System.out.print(head.key+" ");
	}
	//size of binary tree - No. of nodes in Binary Tree.
	public static int size(Node head)
	{
		if(head == null)
			return 0;
		return(1+size(head.left)+size(head.right));
	}
	//get maximum value in Binary Tree.
	public static int getMax(Node head)
	{
		if(root == null)
			return 0;
		return Math.max(Math.max(head.data,getMax(head.left)),getMax(head.right));
	}
	//Height of Binary Tree.
	//The number of nodes between the longest path from root to the leaf Node.
	public static int height(Node head)
	{
		if(head == null)
			return 0;
		return(1+Math.max(height(root.left),height(root.right)));
	}
	//Print Nodes at K distance
	//Nodes at distance K are basically nodes at a distance k+1th from root of binary tree.
	public static void printK(Node head,int k)
	{
		if(root == null)
			return;
		if(k == 0)
		{
			System.out.print(head.data+" ");
			return;
		}
		else
		{
			printK(head.left,k-1);
			printK(head.right,k-1);
		}
	}


}