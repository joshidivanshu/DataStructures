import java.util.*;
//getMin in O(1)
class getMin
{ 
	Stack<Integer> ms = new Stack<>();
	Stack<Integer> as = new Stack<>();
	void push(int x)
	{
		if(as.isEmpty())
		{
			as.push(x);
		}
		if(x < as.peek())
		{
			as.push(x);
		}
		ms.push(x);
	}
	int pop()
	{
		if(!ms.isEmpty() && !as.isEmpty())
		{
			if(ms.peek() == as.peek())
			{
				int z = ms.pop();
				as.pop();
				return z;
			}
			else
				return ms.pop();
		}
	}
	public static void main(String[] args)
	{
		
	}
}