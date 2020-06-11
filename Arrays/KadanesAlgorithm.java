class KadanesAlgorithm
{
	//find maximum sum subarray.
	//brute force approach.
	public static int fun(int arr[],int n)
	{
		int curr = 0;
		int max = 0;
		for(int i=0;i<n;i++)
		{
			curr = 0;
			for(int j=i;j<n;j++)
			{
				curr += arr[i];
				max = Math.max(curr,max);
			}
			max = Math.max(curr,max);
		}
		return max;
	}
	//efficient implementation use of kadane's algorithm.
	public static int kadane(int arr[],int n)
	{
		//traverse from left to right.
		//for every element we find out maximum sum of subarray that must end with this element.
		//and overall res will be maximum of these values.
		int res = arr[0];
		int maxEnding = arr[0];
		for(int i=1;i<n;i++)
		{
			maxEnding = Math.max(maxEnding+arr[i],arr[i]);
			res = Math.max(res,maxEnding);
		}
		return max_sum;
	}
}