import java.util.*;
class StackUsingQueue
{
	Queue<Integer> q1,q2;
	//check the first item in the queue.
	StackUsingQueue()
	{
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
	}
	int top()
	{
		return q1.peek();
	}
	int size()
	{
		return q1.size();
	}
	// remove the first item
	int pop()
	{
		return q1.poll();
	}
	void enque(int x)
	{
		while(!q1.isEmpty())
			q2.add(q1.poll());
		q1.add(x);
		while(!q2.isEmpty())
			q1.add(q2.poll());		
	}
	int deque()
	{
		return q1.poll();
	}

}