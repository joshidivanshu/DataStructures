class Queue
{
	//simple implementation of queue
	int arr[];
	int cap,size;
	Queue(int c)
	{
		cap = c;
		arr = new int[cap];
		size = 0;
	}
	boolean isFull()
	{
		return cap == size;
	}
	boolean isEmpty()
	{
		return size == 0;
	}
	void enque(int x)
	{
		if(isFull())
			return;
		arr[size] = x;
		size++;
	}
	//O(n) time
	int deque()
	{
		if(isEmpty())
			return -1;
		int res = arr[0];
		for(int i=0;i<size-1;i++)
			arr[i] = arr[i+1];
		size--;
	}
	int getFront()
	{
		if(isEmpty())
			return -1;
		
		return 0;
	}
	int getRear()
	{
		if(isEmpty())
			return -1;
        return size-1;
	}
}