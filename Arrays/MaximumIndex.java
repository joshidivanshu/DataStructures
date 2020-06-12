class MaximumIndex
{
	//naive approach.
	public static int maxIndex(int arr[],int n)
	{
		int max_diff = 0;
		int curr_diff = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j] >= arr[i])
					curr_diff = j-i;
				max_diff = Math.max(curr_diff,max_diff);
			}
		}
		return max_diff;
	}
	public static void main(String[] args)
	{
		int arr[] ={1,10};
		int n = arr.length;
		int res = maxIndex(arr,n);
		System.out.println(res);
	}
}