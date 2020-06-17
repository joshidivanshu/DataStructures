class BinarySearchTree
{
	/*
	1.for every node keys on the left-side are smaller and keys on the right-side are greater.
	2. All the keys are typically considered as Distinct.
	3. We do not store redundant values in Binary Search Tree.
	4. Since it is a linked structure , it's not cache friendly.
	5. Implemented in Java as TreeSet or TreeMap.
	6. In unbalanced binary search tree all the operations are O(1).
	7. Only in balanced binary search tree all the operations are O(logn).
	*/
	//search in BST
	//recursive solution.
	public static boolean search(Node root,int x)
	{
		if(root == null)
			return false;
		if(root.data == x)
			return true;
		else if(root.data > x)
			return search(root.left,x);
		else
			return search(root.right,x);
	}
	//iterative solution.
	public static boolean search(Node root,int x)
	{
		if(root == null)
			return false;
		while(root != null)
		{
			if(root.data == x)
				return true;
			else if(root.data < x)
				root = root.right;
			else
				root = root.left;
		}
		return true;
	}

}