class StockSpan
{
	// brute force approach
	public static int stockSpan(int[] arr,int n)
	{
		Sysem.out.print("1"+" ");
		for(int i=1;i<n;i++)
		{
			int curr_count = 1;
			for(int j=i-1;j>=0;j++)
			{
				if(arr[j] <= arr[i])
					curr_count++;
				else
					break;
			}
			System.out.print(curr_count+" ");	
		}
		System.out.println();
	}
	//efficient implementation by the help of stack dataStructure.
	public static int stockSpan(int arr[],int n)
	{
		Stack<Integer> st = new Stack<>();
		st.push(0);
		System.out.print(1+" ");
		for(int i=1;i<n;i++)
		{
			while(!st.isEmpty() && arr[s.peek()] <= arr[i])
				st.pop();
			int span = (st.isEmpty())? (i+1) : (i-s.peek());
			System.out.print(span+" ");
			st.push(i);
		}
		
	}
}