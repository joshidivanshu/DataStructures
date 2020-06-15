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
}