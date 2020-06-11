class LeftRotate
{
	//left rotate by one.
	public static void fun(int arr[],int n)
	{
		int temp = arr[0];
		for(int i=0;i<n-1;i++)
			arr[i] = arr[i+1];
		arr[n-1] = temp;
	}
	//left rotate by d elements.
	public static int[] fun2(int arr[],int n,int d)
	{
		int temp[] = new int[d];
		for(int i=0;i<d;i++)
			temp[i] = arr[i];
		for(int i=d;i<n;i++)
			arr[i-d] = arr[i];
		for(int i=0;i<d;i++)
			arr[n-d+i] = temp[i];
		return arr;

	}
}