class Stack
{
	int max = 100;
	int[] arr = new int[100];
	int top;
	Stack()
	{
		top = -1;
	}
	boolean isEmpty()
	{
		return top<0;
	}
	void push(int x)
	{
		if(top >= max -1)
		{
			System.out.println("Overflow");
			return;
		}
		arr[++top] = x;
		return;
	}
	int pop()
	{
		if(top < 0)
		{
			System.out.println("Underflow");
			return -1;
		}
		return arr[top--];
	}
	int peek()
	{
		return arr[top];
	}
	public static boolean isMatching(char a,char b)
	{
		if(a == '{' && b =='}'
		  || a == '(' && b ==')'
		  || a == '[' && b ==']')
		  return true;
		return false;  
		  
 }
	public static boolean balanced(String s)
	{
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(' )
				st.push(s.charAt(i));
			else
			{
				if(st.isEmpty())
					return false;
				if(isMatching(st.peek(),s.charAt(i))==false)
					return false;
				else 
					st.pop();
			}
		}
		return st.isEmpty();
	}
	
    public static void main(String[] args)
    {
    	Stack st = new Stack();
    	st.push(10);
    	st.push(20);
    	st.push(30);
    	st.push(40);
    	st.push(60);
    	System.out.println(st.peek());
    }
}