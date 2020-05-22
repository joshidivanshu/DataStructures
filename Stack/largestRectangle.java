class largestRectangle
{
	// brute force approach
	public static int fun1(int arr[],int n)
	{
		int res = 0;
		for(int i=0;i<n;i++)
		{
			int curr = arr[i];
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j] >= arr[i])
					curr += arr[i];
				else
					break;
			}
			for(int j=i+1;j<n;j++)
			{
				if(arr[j] >= arr[i])
					curr += arr[i];
				else
					break;
			}
			res = Math.max(res,curr);
		}
		return res;
	}
	// better approach
	public static int[] previousSmaller(int arr[],int n)
    {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];
        int cnt = 0;
        res[cnt] = -1;
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            int sm = (st.isEmpty()) ? -1 : st.peek();
            res[++cnt] = sm;
            st.push(i);
        }
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
        System.out.println();
        return res;
    }
    public static int[] nextSmaller(int arr[],int n)
    {
        Stack<Integer> st = new Stack<Integer>();
        int res[] = new int[n];
        int cnt = n-1;
        res[cnt] = n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            int sm = (st.isEmpty()) ? n : st.peek();
            res[--cnt] = sm;
            st.push(i);
          
        }
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
        System.out.println();
        return res;
    }
    public int largestRectangleArea(int[] arr) {
        // brute force approach.
        if(arr.length == 0)
            return 0;
        int[] ps = previousSmaller(arr,arr.length);
        int[] ns = nextSmaller(arr,arr.length);
        int res = 0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int curr = 0;
            curr += arr[i];
            curr += (i-ps[i]-1)*arr[i];
            curr += (ns[i]-i-1)*arr[i];
            res = Math.max(res,curr);
        }
        return res;
    }
}