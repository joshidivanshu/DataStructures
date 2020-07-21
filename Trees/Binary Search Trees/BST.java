class BST
{
	public static boolean search(TreeNode root,int key)
	{
		if(root == null)
			return false;
		if(root.data == key)
			return true;
		else if(root.data > key)
			search(root.left,key);
		else
			search(root.right,key);	
	} 
	//insert in BST
	public static TreeNode insert(TreeNode root,int key)
	{
		if(root == null)
		{
			return new TreeNode(key);
		}
		else if(root.data < key)
			root.right = insert(root.right,key);
		else
			root.left = insert(root.left,key);
		return root;
	}
	//iterative insert BST
	public static TreeNode insert(TreNode root,int key)
	{
		TreeNode temp = new TreeNode(key);
		TreNode parent = root,curr = root;
		while(curr != null)
		{
			parent = curr;
			if(curr.data > key)
			{
				curr = curr.left;
			}
			else if(curr.data < key)
			{
				curr = curr.right;
			}
			else
		     	return root;
		}
		if(parent == null)
			return temp;
		if(parent.data > x)
			parent.left = temp;
		else
			parent.right = temp;
	}
}