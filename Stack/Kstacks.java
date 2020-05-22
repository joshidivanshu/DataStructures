class Kstacks
{
	// sn stack number -> 0 to k-1
	int arr[];
	int cap;
	int top[];
	int next[];
	int k;
	int freeTop;
	Kstacks(int cap,int k)
	{
		this.cap = cap;
		this.k = k;
		arr = new int[cap];
		next = new int[cap];
		for(int i=0;i<cap-1;i++)
			next[i] = i+1;
		next[cap-1] = -1;
		freeTop = 0;
		// top array to maintain the top of k stacks.
		top = new int[k];
		Arrays.fill(top,-1);
	}
	// we haven't handled the conditions of overflow and underflow here.
	void push(int x,int sn)
	{
		//push(400,1)
		// handling the overflow condintion
		if(freeTop == -1)
			return;
		int i = freeTop;
		// these three need to be done in the same order.
		freeTop = next[i];
		next[i] = top[sn];
		top[sn] = i;
		arr[i] = x;
		
	}
	int pop(int sn)
	{
		//handling the underflow condition
		if(top[sn] == -1)
			return -1;
		int index = top[sn];
		top[sn] = next[index];
		next[index] = freeTop;
		freeTop = index;
		return arr[index];
	}
}