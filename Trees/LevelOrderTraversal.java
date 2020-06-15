class LevelOrderTraversal
{
	//Line By Line means we print the nodes at same level in the same line.
	//first way
	public static int height(Node head)
	{
		if(head == null)
			return 0;
		return(1+Math.max(height(head.left),height(head.right)));
	}
	public static void printK(Node head,int k)
	{
		if(head == null)
			return;
		if(k == 0)
			System.out.print(head.key+" ");
		else
		{
			printK(head.left,k-1);
			printK(head.right,k-1);
		}

	}
	public static void LOT(Node head)
	{
		int h = height(head);
		for(int i=0;i<h;i++)
		{
			printK(head,i);
			System.out.println();
		}
	}
	//2nd way
	public static void printLevel(Node head)
	{
		if(head == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(head);
		while(!q.isEmpty())
		{
			int count = q.size();
			for(int i=0;i<count;i++)
			{
				Node curr = q.poll();
				System.out.print(curr.key+" ");
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
			System.out.println();
		}
	}
	//Reverse Level Order Traversal.
	public static void printRevLevel(Node root)
	{
		if(root == null)
			return;
		List<Integer> arr = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root.key);
		while(!q.isEmpty())
		{
			int count = q.size();
			for(int i=count-1;i>=0;i--)
			{
				Node curr = q.poll();
				arr.add(curr.data);
				if(curr.left != null)
					arr.add(curr.left);
				if(curr.right != null)
					arr.add(curr.right);
			}
		}
		Collections.reverse(arr);
		for(int i=0;i<arr.size();i++)
			System.out.print(arr.get(i)+" ");
	} 
}