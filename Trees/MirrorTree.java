class MirrorTree
{
	//efficient solution
	public static void mirror(Node head)
	{
		if(head == null)
			return;
		else
		{
			mirror(head.left);
			mirror(head.right);
			Node temp = head.left;
			head.left = head.right;
			head.right = temp;
		}
	}
}