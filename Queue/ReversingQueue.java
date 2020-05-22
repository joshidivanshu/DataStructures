import java.util*;
class ReversingQueue
{
	// brute force approach
	// T(n) = O(n) A.S.(n) = O(n)
	public void fun(Queue<Integer> q)
	{
		Stack<Integer> st = new Stack<>();
		while(!q.isEmpty())
			st.push(q.poll());
		while(!st.isEmpty())
			q.add(st.pop());
        return;
	}
	// recursive approach
	void reverse(Queue<Integer> q)
	{
		if(q.isEmpty())
			return;
		int x = q.peek();
		q.poll();
		reverse(q);
		q.push(x);
	}
}