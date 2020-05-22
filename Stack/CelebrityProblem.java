class CelebrityProblem
{
	// brute force approach
	int getId(int arr[][], int n)
    {
        // Your code here
        int i;
        for(i=0;i<n;i++)
        {
            int cnt = 0;
            for(int j=0;j<n;j++)
            {
        
                if(arr[j][i] == 1)
                    cnt++;
            }
            if(cnt == n-1)
            {
                for(int k=0;k<n;k++)
                {
                    if(arr[i][k] == 1)
                        return -1;
                }
                return i;
            }
        }
        return -1;
    }
    boolean knows(int a,int b)
    {
    	int res = (mat[a][b] == 1) ? true : false;
    	return res;
    }
    int findCelebrity(int n)
    {
    	Stack<Integer> st = new Stack<>();
    	int c;
    	while(st.size() > 1)
    	{
    	int a = st.pop();
    	int b = st.pop();
    	// if a knows b then a can't be celebrity but b can be
    	if(knows(a,b))
    		st.push(b);
    	// if b knows a then b can't be celebrity but a can be
    	else
    		st.push(a);
        }
        c = st.pop();
        // check whether c is celebrity or not
        for(int i=0;i<n;i++)
        {
        	if(i != c && (knows(c,i) || !knows(i,c)))
        		return -1;
        }
        return c;

    }
}