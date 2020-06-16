class IdenticalTrees
{
	public static boolean isIdentical(Node head1,Node head2)
	{
		if(head1 == null && head2 == null)
			return true;
		if(head1 == null || head2 == null)
			return false;
		return(head1.data == head2.data && isIdentical(head1.left,head2.left)
			  && isIdentical(head1.right,head2.right));
	}
}