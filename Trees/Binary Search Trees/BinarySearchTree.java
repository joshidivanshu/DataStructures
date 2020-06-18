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
		return false;
	}
	//Insertion In BST.
	//recursive implementation.
	public static void insert(Node root,int x)
	{
		if(root == null)
			return;
		if(root.data == x)
			return;
		else if(root.data > x)
		{
			if(root.left == null)
			{
				root.left = new Node(x);
				return;
			}
			else
			{
				insert(root.left,x);
			}
		}
		else
		{
			if(root.right == null)
			{
				root.right = new Node(x);
				return;
			}
			else
			{
				insert(root.right,x);
			}
		}
	}
	//recursive implementation
	public static Node insert(Node root,int x)
	{
		if(head == null)
			return;
		if(root.data > x)
			root.left = insert(root.left,x);
		else if(root.data < x)
			root.right = insert(root.right,x);
		return root;
	}
	//iterative implementation.
	public static Node insert(Node root,int x)
	{
		Node temp = new Node(x);
		Node parent = null, curr = root;
		while(curr != null)
		{
			parent = curr;
			if(curr.data > x)
			{
				curr = curr.left;
			}
			else if(curr.data < x)
				curr = curr.right;
			else
				return root;
		}
		if(parent == null)
			return temp;
		if(parent.data > x)
			parent.left = temp;
		else
			parent.right = temp;
		return root;
	}
}