class LinkedList
{
    Node root;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
		} 
	}
	print void printList()
	{
		if(root == null)
			return;
		Node curr = root;
		while( curr != null)
	    {
	    	System.out.print(curr.data+" ");
	    	curr = curr.next;
	    }
	}
	public void insertAtBegin(int data)
	{
		Node temp = new Node(data);
		if(root == null)
			root = temp;
		else
		{
			Node curr = root;
			temp.next = curr;
			root = temp;
		}	
	}
	public void insertAtEnd(int data)
	{
		Node temp = new Node(data);
		if(root == null)
			root = temp;
		Node curr = root;
		while(cuur.next != null)
			curr = curr.next;
		curr.next = temp;		
	}
	public void insert(Node prev,int data)
	{
		if(prev == null)
			return;
		Node temp = new Node(data);	
		Node next = prev.next;
		prev.next = temp;
		temp.next = next;
		return;	
	}
	public void delete(Node root,int key)
	{
		if(root == null)
			return;
		if(root.data == key)
		{
			root = root.next;
			return;
		}	
		Node prev = null;
		Node curr = root;
		while( curr != null && curr.data != key)
		{
			prev = curr;
			curr = curr.next;
		}
		if( curr == null)
			return;
		prev.next = curr.next;
		return;

	}
	public void deletePos(Node root,int pos)
	{
		if(root == null)
			return;
		if(pos == 0)
		{
			root = root.next;
			return;
		}
		Node temp = root;
		// search for the previous node of the element to be deleted
		for(int i=0;i<pos-1;i++)
			temp = temp.next;
        if( temp == null || temp.next == null)
        	return;
        Node next = temp.next.next;
        temp.next = next;
        return;	
	}
	public void deletePointer(Node head,Node pointer)
	{
		Node curr = head;
		while( curr.next != pointer)
			curr = curr.next;
		if(pointer == null)
			return;	
		Node next = pointer.next;
		curr.next = next;
		return;	
	}
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		l1.head.next = second;
		second.next = third;
	}
}