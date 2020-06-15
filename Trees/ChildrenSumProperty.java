class ChildrenSumProperty
{
	//ChildSum Property is sum of the leftchild and rightchild should be less than
	//or equal to the root else if only one child is present then it's value should be less than or equal
	//to the root.
	public static boolean isTrue(Node root)
	{
		if(root == null)
			return true;
		if(root.left == null && root.right == null)
			return true;
		int sum = 0;
		if(root.left != null)
			sum += root.left.data;
		if(root.right != null)
			sum += root.right.data;
		return (root.data == sum && 
				isTrue(root.left),
				isTrue(root.right));

	}
	
}