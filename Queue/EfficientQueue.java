class EfficientQueue
{
	// circular array implementation
	int arr[];
	int front,cap,size;
	EfficientQueue(int c)
	{
		arr = new int[c];
		cap = c;
		size = 0;
		front = 0;
	}
	boolean isEmpty()
	{
		return size == 0;
	}
	boolean isFull()
	{
		return cap == size;
	}
	int getFront()
	{
		if(isEmpty())
			return -1;
		return front;
	}
	int getRear()
	{
		if(isEmpty())
			return -1;
		return (front+size-1)%cap;
	}
	void push(int x)
	{
		if(isFull())
			return;
		int rear = getRear();
		rear = (rear+1)%cap;
		arr[rear] = x;
		size++;
	}
	int pop()
	{
		if(isEmpty())
			return -1;
		int res = arr[front];
		front = (front+1)%cap;
		size--;
		return res;
	}
}