class BST
{
	//search in BST.
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
		//when the parent is itself null.
		if(parent == null)
			return temp;
		if(parent.data > x)
			parent.left = temp;
		else
			parent.right = temp;
		return root;
	}
	//deletion in BST
	public static TreeNode delete(TreeNode root,int key)
	{
		if(root == null)
			return null;
		if(root.data > x)
			root.left = delete(root.left,key);
		else if(root.data < x)
			root.right = delete(root.right,key);
		else
		{
			//here we handle the three cases of deletion
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else
			{
				TreeNode suc = getSucc(root);
				root.data = suc.data;
				root.right = delete(root.right,suc.key);
			}
		}
		return root;
	}
	public static TreeNode getSucc(TreeNode root)
	{
		TreeNode curr = root.right;
		while(curr != null && curr.left != null)
			curr = curr.left;
		return curr;
	}
	public static TreeNode floor(TreeNode root,int key)
	{
		Node res = null;
		while(root != null)
		{
			if(root.data == x)
				return root;
			else if(root.data > x)
				root = root.left;
			else
			{
				res = root;
				root = root.right;
			}
		}
		return res;
	}
	//ceil in BST.
	public static TreeNode ceil(TreeNode root,int key)
	{
		Node res = null;
		while(root != null)
		{
			if(root.data == key)
				return root;
			else if(root.data < x)
				root = root.right;
			else
			{
				res = root;
				root = root.left;
			}
		}
		return res;
	}

}