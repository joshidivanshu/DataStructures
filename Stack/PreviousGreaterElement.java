class PreviousGreaterElement
{
	// brute force approach
	public static void fun(int arr[],int n)
	{
		System.out.print(-1+" ");
		for(int i=1;i<n;i++)
		{
			int j;
			for(j=i-1;j>=0;j--)
			{
				if(arr[j] >= arr[i])
				{
					System.out.print(arr[j]+" ");
					break;
				}	
			}
			if(j==-1)
			System.out.print(j+" ");
		}
		System.out.println();
	}
	//efficient implementation using Stack
	public static void fun(int arr[],int n)
	{
		Stack<Integer> st = new Stack<>();
		System.out.print(-1+" ");
		st.push(0);
		for(int i=1;i<n;i++)
		{
			while(!st.isEmpty() && arr[st.peek()] <= arr[i])
				st.pop();
			if(st.isEmpty())
				System.out.print(-1+" ");
			else
				System.out.print(arr[st.peek()]+" ");
			st.push(i);
		}
		
	}
}