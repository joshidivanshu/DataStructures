import java.util.*;
class QueueCollections
{
	public static void main(String[] args)
	{
		//Queue is an interface and is implemented by LinkedList class
		// many classes implement queue interface.
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(5);
		q.add(6);
		q.peek(); // it only returns the front element
		q.poll(); // it returns as well as remove the front element returns null when queue empty
		q.remove(); // same function as poll returns nosuchelement exception when queue is empty.
		q.size(); // gives size of the queue
		q.isEmpty(); // checks whether queue is empty or not.
	}
}