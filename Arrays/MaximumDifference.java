class MaximumDifference
{
	//find the max diff arr[j]-arr[i] such that j>i
	public static int maxDiff(int arr[],int n)
	{
		int max_diff = arr[1]-arr[0];
		int min_val = Math.min(arr[0],arr[1]);
		for(int i=2;i<n;i++)
		{
			int curr_diff = arr[i]-min_val;
			max_diff = Math.max(max_diff,curr_diff);
			min_val = Math.min(arr[i],min_val);
		}
		return max_diff;
	}
}