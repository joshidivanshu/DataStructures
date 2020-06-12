class LongestEvenOddSubarray
{
	//brute force approach.
	public static boolean isEven(int n)
	{
		return (( n&1 ) == 0);
	}
	public static boolean isOdd(int n)
	{
		return ((n&1) != 0);
	}
	//application of kadane's algorithm
	public static int fun(int arr[],int n)
	{	
		int max = 0;
		int curr = 1;
		for(int i=1;i<n;i++)
		{
			if(isEven(arr[i]) && !isEven(arr[i-1]))
				curr++;
			else if(!isEven(arr[i]) && isEven(arr[i-1]))
				curr++;
			else
			{
				max = Math.max(curr,max);
				curr = 1;
			}
		}
		max = Math.max(curr,max);
		return max;
	}
	public static void main(String[] args)
	{
		int arr[] = {7,10,13,14};
		int n = arr.length;
		int res = fun(arr,n);
		System.out.println(res);
	}
}