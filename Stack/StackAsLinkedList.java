class StackAsLinkedList
{
	Node head;
	static class Node 
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
		}

	}
	boolean isEmpty()
	{
		return head==null;
	}
	void push(int x)
	{
		Node temp = new Node(x);
		if(head == null)
		{
			root = temp;
			return;
		}
		temp.next = head;
		head = temp;
		return;
	}
	int pop()
	{
		if(head == null)
			return -1;
		int z = head.data;
		head = head.next;
		return z;
	}
    int peek()
    {
    	return head.data;
    }
    public static void main(String[] args)
    {
    	StackAsLinkedList st = new StackAsLinkedList();
    	st.add(10);
    	st.add(20);
    	st.add(30);
    	st.add(40);
    	st.add9(50);
    	System.out.println(st.peek());
    }
}