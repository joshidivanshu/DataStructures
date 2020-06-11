class RemoveDuplicates
{
	//naive soln
	//return the size of the array.
	//even if the array was not sored then we could have used hashset.
	public static int fun(int arr[],int n)
	{
		Set<Integer> hs = new HashSet<>();
		for(int i=0;i<n;i++)
			hs.add(arr[i]);
		return hs.size();
	}
	//another naive approach without using hashset.
	public static int fun2(int arr[],int n)
	{
		int arr1[] = new int[n];
		arr1[0] = arr[0];
		int temp = 1;
		int res = 1;
		for(int i=1;i<n;i++)
		{
			//since the given array is sorted.
			if(arr[i] != arr[i-1])
				arr1[temp++] = arr[i];	
		}
		for(int i=0;i<temp;i++)
			arr[i] = arr1[i];
		return res;

	}

}