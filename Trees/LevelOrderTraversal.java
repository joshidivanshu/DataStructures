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
}