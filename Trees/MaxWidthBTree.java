class MaxWidthBTree
{
	//based on level order traversal line by line.
	public static int maxWidth(Node head)
	{
		if(head == null)
			return 0;
		int max_len = 0;
		Queue<Node> q = new LinkedList<>();
		q.add(head.data);
		while(!q.isEmpty())
		{
			int curr = q.size();
			max_len = Math.max(curr,max_len);
			for(int i=0;i<curr;i++)
			{
				Node temp = q.poll();
				if(temp.left != null)
					q.add(temp.left);
				if(temp.right != null)
					q.add(temp.right);
			}

		}
		return max_len;
	}
}