class EfficientOperations
{
	//getMin getMax 
	Deque<Integer> dq;
	EfficientOperations()
	{
		dq = new LinkedList<Integer>();
	}
	boolean insertMin(int x)
	{
		if(dq.isEmpty())
		{
			dq.offerFirst(x);
			return true;
		}
		if(x < dq.peekFirst())
		{
			dq.offerFirst(x);
			return true;
		}
		return false;
	}
	boolean insertMax(int x)
	{
		if(dq.isEmpty())
		{
			dq.offerLast(x);
			return true;
		}
		if(x > peekLast())
		{
			dq.offerLast(x);
			return true;
		}
		return false;
	}
	int getMin()
	{
		if(dq.isEmpty())
			return -1;
		return dq.peekFirst();
	}
	int getMax()
	{
		if(dq.isEmpty())
			return -1;
		return dq.peekLast();
	}
}