class Leaders
{
	public static int[] fun(int arr[],int n)
	{
		List<Integer> list =new  ArrayList<>();
		list.add(arr[n-1]);
		int max = arr[n-1];
		int cnt = 1;
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i] > max)
			{
				list.add(arr[i]);
				max = arr[i];
				cnt++;
			}
		}
		int res[] = new int[cnt];
		for(int i=0;i<cnt;i++)
			res[i] = arr.get(i);
		int low = 0;
		int high = cnt-1;
		while(low<high)
		{
			int temp = res[low];
			res[low] = res[high];
			res[high] = temp;
			low++;
			high--;
		}
		return res;

	}
}