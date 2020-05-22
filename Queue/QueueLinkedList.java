class QueueLinkedList
{
	Node head;
	Node tail;
	int size;
	static class Node 
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
		}
	}
	//O(1) implementation
	int getRear()
	{
		if(head == null)
			return -1;
		return tail.data;
	}
	//O(1) implementation
	int getFront()
	{
		if(head == null)
			return -1;
		return head.data;
	}
	int getSize()
	{
		return size;
	}
	// O(1) operation
	void enque(int x)
	{
		Node temp = new Node(x);
        if(head == null)
        {
        	head = temp;
        	tail = temp;
        	size++;
        }
        else
        {
        tail.next = temp;
        tail = temp;
        size++;
        }
    }
    //O(1) operation
    int deque()
    {
    	if(head == null)
    		return -1;
    	int res = head.data;
    	head = head.next;
    	if(head == null)
    		rear = null;
    	size--;
    	return res;
    }
}