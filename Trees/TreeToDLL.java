class TreeToDLL
{
	public static void inorder(TreeNode root,TreeNode prev,TreeNode head)
	{
		if(root != null)
		{
			inorder(root.left,prev,head);
			if(prev != null)
			{
				prev.next = root;
				root.prev = prev;
			}
			if(prev == null  && head == null)
			{
				head = root;
			}
			prev = root;
			inorder(root.right,prev,head);
		}
	}
	public static TreeNode fun(TreeNode root)
	{
		TreeNode prev = null,head = null;
		inorder(root,prev,head);
		return head;

	}
}