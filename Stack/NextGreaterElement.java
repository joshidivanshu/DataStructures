class NextGreaterElement
{
	// brute force approach
	public static void fun(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int j;
			for(j =i+1;j<n;j++)
			{
				if(arr[j]>arr[i])
				{
					System.out.print(arr[j]+" ");
					break;
				}	
			}
			if(j == n )
				System.out.print(-1+" ");
		}
		// for the n-1th element
		System.out.print(-1+" ");
	}
	// efficient implementation for the next greater element.
	public static void fun(int arr[],int n)
	{
		Stack<Integer> st = new Stack<>();
		System.out.print(-1+" ");
		st.push(arr[n-1]);
		for(int i=n-2;i>=0;i--)
		{
			while(!st.isEmpty() && st.peek()<=arr[i])
				st.pop();
			if(st.isEmpty())
				System.out.print(-1+" ");
			else
				System.out.print(st.peek()+" ");
			st.push(arr[i]);
		}
	}
}