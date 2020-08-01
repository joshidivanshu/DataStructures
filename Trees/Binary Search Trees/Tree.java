class Tree
{
	public static void inorder(Node root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	public static void preorder(Node root)
	{
		if(root != null)
		{
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void postorder(Node root)
	{
		if(root != null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
	//size of binary tree
	public static int size(Node root)
	{
		if(root == null)
			return 0;
		return 1+size(root.left)+size(root.right);
	}
	//maximum in binary tree.
	public static int max(Node root)
	{
		if(root == null)
			return Integer.MIN_VALUE;
		return Math.max(Math.max(root.data,max(root.left)),max(root.right));
	}
	//height of binary tree
	public static int height(Node root)
	{
		if(root == null)
			return 0;
		return 1+Math.max(height(root.left),height(root.right));
	}
	//print elements at kth distance.
	public static void printK(Node root,int k)
	{
		if(root == null)
			return;
		if(k == 0)
			System.out.print(root.data+" ");
		else
		{
			printK(root.left,k-1);
			printK(root.right,k-1);
		}
	}
	//level order traversal or BFS
	public static void levelorder(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			System.out.print(temp.data+" ");
			if(temp.left != null)
				q.add(temp.left);
			if(temp.right != null)
				q.add(temp.right);
		}
		
	}
	//line by line level order traversal.
	public static void printLevel(Node root)
	{
		if(root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			int count = q.size();
			for(int i=0;i<count;i++)
			{
				Node curr = q.poll();
				System.out.print(curr.data+" ");
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
			System.out.println();
		}
	}
	//reverse level order traversal.
	public static void reverseLevel(Node root)
	{
		if(root == null)
			return;
		ArrayList<Integer> arr = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int cnt = 0;
		while(!q.isEmpty())
		{
			int count = q.size();
			for(int i=0;i<count;i++)
			{
				Node curr = q.poll();
				arr.add(curr.data);
				cnt++;
				if(curr.right != null)
					q.add(curr.right);
				if(curr.left != null)
					q.add(curr.left);
			}
		}
		Collections.reverse(arr);
		for(int i=0;i<cnt;i++)
			System.out.print(arr.get(i)+" ");

	}
	//children sum property.
	public static boolean childSum(Node root)
	{
		if(root == null)
			return true;
		if(root.left == null && root.right == null)
			return true;
		int s = 0;
		if(root.left != null)
			s += root.left.data;
		if(root.right != null)
			s += root.right.data;
		return (root.data == s && childSum(root.left) && childSum(root.right));
	}
	//sum of binary tree
	public static int sumBT(Node root)
	{
		if(root == null)
			return 0;
		return root.data+sumBT(root.left)+sumBT(root.right);
	}
	//print the leftview of binary tree.
	public static void leftView(Node root)
	{
		if(root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			int count = q.size();
			for(int i=0;i<count;i++)
			{
				Node curr = q.poll();
				if(i == 0)
					System.out.print(curr.data+" ");
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
		}
	}
	//naive solution.
	public static boolean isBalanced(Node root)
	{
		if(root == null)
			return true;
		int h1 = height(root.left);
		int h2 = height(root.right);
		return Math.abs(h1-h2)<=1 && isBalanced(root.left) && isBalanced(root.right);
	}
	//efficient solution
	public static int isBalanced(Node root)
	{
		if(root == null)
			return 0;
		int lh = isBalanced(root.left);
		if(lh == -1)
			return -1;
		int rh = isBalanced(root.right);
		if(rh == -1)
			return -1;
		if(Math.abs(lh-rh) > 1)
			return -1;
		return 1+Math.max(lh,rh);

	}
	//maximum width of Binary Tree.
	public static int maxWidth(Node root)
	{
		if(root == null)
			return 0;
		int res = Integer.MIN_VALUE;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			int cnt = q.size();
			res = Math.max(res,cnt);
			for(int i=0;i<cnt;i++)
			{
				Node curr = q.poll();
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
		}
		return res;
	}
	//binary tree to doubly linked list.
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
	//mirror of a tree
	public static void mirror(TreeNode root)
	{
		if(root == null)
			return;
		else
		{
			mirror(root.left);
			mirror(root.right);
			Node temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
	}
	//foldable binary tree.
	public static void mirror(Node root)
    {
        if(root == null)
            return;
        else
        {
            mirror(root.left);
            mirror(root.right);
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
    static boolean isStruct(Node root1,Node root2)
    {
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null && root2 != null)
            return false;
        if(root1 != null && root2 == null)
            return false;
        else
        {
            if(root1.left == null && root2.left != null)
                return false;
            if(root1.right == null && root2.right != null)
                return false;
            if(root1.left != null && root2.left == null)
                return false;
            if(root1.right != null && root2.right == null)
                return false;
            return isStruct(root1.left,root2.left) && isStruct(root1.right,root2.right);    
        }
    }
    boolean IsFoldable(Node root) 
	{ 
		// your code 
		if(root == null)
		    return true;
		mirror(root.left);
		boolean res = isStruct(root.left,root.right);
		mirror(root.left);
		return res;
		
	} 
	//Tree traversal in spiral form.
	public static void fun(Node root)
	{
		if(root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		Stack<Integer> st = new Stack<>();
		q.add(root);
		boolean reverse= false;
		while(!q.isEmpty())
		{
			int count = q.size();
			for(int i=0;i<count;i++)
			{
				Node curr = q.poll();
				if(reverse)
					st.push(curr.data);
				else
					System.out.print(curr.data+" ");
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
			if(reverse)
			{
				while(!st.isEmpty())
				{
					System.out.print(st.pop()+" ");
				}
			}
			reverse = !=reverse;
			System.out.println();
		}
	}
}