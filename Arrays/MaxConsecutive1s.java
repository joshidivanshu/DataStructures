class MaxConsecutive1s
{
	//brute force
	public static int fun(int arr[],int n)
	{
		int max_cnt = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] == 1)
			{
				int curr_cnt = 1;
				for(int j=i+1;j<n;j++)
				{
					if(arr[j] == 1)
						curr_cnt++;
					else
						break;
				}
				max_cnt = Math.max(curr_cnt,max_cnt);
			}
			
		}
		return max_cnt;
	}
	//efficient implementation.
	public static int fun2(int arr[],int n)
	{
		int res = 0;
		int curr = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] == 0)
				curr = 0;
			else
			{
				curr++;
				res = Math.max(res,curr);
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		int arr[] = {0,1,1,0,0,1,1,1};
		int n = arr.length;
		int res = fun2(arr,n);
		System.out.println(res);
	}
}