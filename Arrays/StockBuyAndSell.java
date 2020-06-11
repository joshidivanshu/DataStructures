class StockBuyAndSell
{
	//efficient soln
	public static int maxProfit(int arr[],int n)
	{
		int prof = 0;
		for(int i=1;i<n;i++)
		{
			if(arr[i] > arr[i-1])
				prof += arr[i]-arr[i-1];
		}
		return prof;
	}
}