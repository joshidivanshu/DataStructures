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
}