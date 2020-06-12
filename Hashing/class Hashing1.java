class Hashing1
{
	public static int countDistinct(int arr[],int n)
	{
		Set<Integer> hs = new HashSet<>();
		for(int i=0;i<n;i++)
			hs.add(arr[i]);
		return hs.size();
	}
	public static int countFrequency(int arr[],int n)
	{
		Map<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(!hm.containsKey(arr[i]))
				hm.put(arr[i],1);
			else
				hm.put(arr[i],hm.get(arr[i])+1);
		}
		for(Map.Entry<Integer,Integer> e : hm.entrySet())
		{
			System.out.println(e.getKey()+" "e.getValue());
		}
	}
	public static int intersectionArray(int a[],int b[],int n,int m)
	{
		Set<Integer> hs = new HashSet<>();
		for(int i=0;i<n;i++)
			hs.add(a[i]);
		int res = 0;
		for(int i=0;i<m;i++)
		{
			if(h.contains(b[i]))
			{
				res++;
				h.remove(b[i]);
			}
		}
		return res;
	}
	public static int unionArray(int a[],int b[],int n,int m)
	{
		Set<Integer> hs = new HashSet<>();
		for(int i=0;i<n;i++)
			hs.add(a[i]);
		for(int i=0;i<m;i++)
			hs.add(b[i]);
		return hs.size();
	}
	//pair with given sum.
	//brute force approach.
	public static boolean pairSum(int arr[],int n,int sum)
	{
		int curr = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j] == sum)
					return true;
			}
		}
		return false;
	}
	//efficient soln using hashing.
	public static boolean pairSum(int arr[],int n,int sum)
	{
		Set<Integer> hs = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(h.contains(sum-arr[i]))
				return true;
			hs.add(arr[i]);
		}
		return false;
	}
	//subarray with zero sum
	//brute force approach.
	public static boolean isSum(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int curr_sum = 0;
			for(int j=i;j<n;j++)
			{
				curr_sum += arr[j];
				if(curr_sum == 0)
					return true;
			}
		}
		return false;
	}
	//efficient approach to get subarray with zero sum
	public static boolean isSum(int arr[],int n)
	{
		Set<Integer> hs = new HashSet<>();
		int pre_sum = 0;
		for(int i=0;i<n;i++)
		{
			pre_sum += arr[i];
			if(hs.contains(pre_sum))
				return true;
			if(pre_sum == 0)
				return true;
			hs.add(pre_sum);
		}
		return false;
	}

}