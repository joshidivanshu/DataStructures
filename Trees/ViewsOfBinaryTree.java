class ViewsOfBinaryTree
{
	//print left view of binary tree.
	//So if we view the binary tree from left side we will only print the leftmost element of each level.
	public static void printLeftView(Node head)
	{
		if(head == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(head);
		while(!q.isEmpty())
		{
			int count = 0;
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
	//print right view of binary tree.
	//print the rightmost element at each level.
	public static void printRightView(Node head)
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
				if(i == count-1)
					System.out.print(curr.data+" ");
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
		}
	}
	class Pair{
		Node node;
		int hd;
		Pair(Node n,int h)
		{
			node = n;
			hd = h;
		}
	}
	//Top View of Binary Tree.
	//We can solve this by the Concept of Vertical Traversal first check that out.
	// we'll consider the horizontal distance and the first element at particular horizontal distance will be printed.
	public static void topView(Node head)
	{
		if(head == null)
			return;
		Queue<Pair> q = new LinkedList<>();
		TreeMap<Integer,Integer> hm = new TreeMap<>();
		q.add(new Pair(0,head.data));
		while(!q.isEmpty())
		{
			Pair p = q.poll();
			Node curr = p.node;
			int hd = p.hd;
			if(!hm.containsKey(hd))
				hm.put(hd,curr.data);
			if(curr.left != null)
				q.add(curr.left,hd-1);
			if(curr.right != null)
				q.add(curr.right,hd+1);
		}
		for(Map.Entry<Integer,Integer> arr : hm.entrySet())
		{
			System.out.print(arr.getValue()+" ");
		}

	}
	//Bottom View of Binary Tree.
	//Same concept just have to do the reverse of it.
	public static void bottomView(Node head)
	{
		if(head == null)
			return;
		Queue<Pair> q = new LinkedList<>();
		TreeMap<Integer,Integer> hm = new TreeMap<>();
		q.add(new Pair(head.data,0));
		while(!q.isEmpty())
		{
			Pair p = q.poll();
			Node curr = p.node;
			int hd = p.hd;
			hm.put(hd,curr.data);
			if(curr.left != null)
				q.add(curr.left,hd-1);
			if(curr.right != null)
				q.add(curr.right,hd+1);
		}
		for(Map.Entry<Integer,Integer> arr : hm)
		{
			System.out.print(arr.getValue()+" ");
		}
	}
	
}