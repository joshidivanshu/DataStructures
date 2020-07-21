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
			root = new TreeNode(key);
		if(root.data == key)
			return root;
		else if(root.data < key)
			root.right = insert(root.right,key);
		else
			root.left = insert(root.left,key);


	}
}