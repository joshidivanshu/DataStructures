class Reverse
{
	public static void rev(Node head)
	{
		Stack<Integer> s = new Stack<>();
		Node curr = head;
		while(curr != null)
			s.push(curr.data);
		while(!s.isEmpty())
			System.out.print(s.pop()+" ");
		System.out.println();
	}
}