class Maximum
{
	//find maximum in all subarrays of size k
	// brute force approach
	// given k <= n
	// t(n) = O(n^2)
	public void maximum(int[] arr,int n,int k)
	{
		for(int i=0;i<n-k+1;i++)
		{
			int curr_max = arr[i];
			for(int j=i+1;j<i+k;j++)
			{
				curr_max = Math.max(curr_max,arr[j]);
			}
			System.out.print(curr_max+" ");
		}
		System.out.println();
	}
	//efficient implementation
    public void maximum(int[] arr,int n,int k)
    {
    	Deque<Integer> dq = new LinkedList<Integer>();
    	// size of the deque should always be k
    	// we should maintain the maximum element in front
    	for(int i=0;i<n;i++)
    	{
    		
    	}

    }
}