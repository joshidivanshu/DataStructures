import java.util.*;
class BST
{
	//search in BST.
	public static boolean search(TreeNode root,int key)
	{
		if(root == null)
			return false;
		if(root.data == key)
			return true;
		else if(root.data > key)
			search(root.left,key);
		else
			search(root.right,key);	
	} 
	//insert in BST
	public static TreeNode insert(TreeNode root,int key)
	{
		if(root == null)
		{
			return new TreeNode(key);
		}
		else if(root.data < key)
			root.right = insert(root.right,key);
		else
			root.left = insert(root.left,key);
		return root;
	}
	//iterative insert BST
	public static TreeNode insert(TreNode root,int key)
	{
		TreeNode temp = new TreeNode(key);
		TreNode parent = root,curr = root;
		while(curr != null)
		{
			parent = curr;
			if(curr.data > key)
			{
				curr = curr.left;
			}
			else if(curr.data < key)
			{
				curr = curr.right;
			}
			else
		     	return root;
		}
		//when the parent is itself null.
		if(parent == null)
			return temp;
		if(parent.data > x)
			parent.left = temp;
		else
			parent.right = temp;
		return root;
	}
	//deletion in BST
	public static TreeNode delete(TreeNode root,int key)
	{
		if(root == null)
			return null;
		if(root.data > x)
			root.left = delete(root.left,key);
		else if(root.data < x)
			root.right = delete(root.right,key);
		else
		{
			//here we handle the three cases of deletion
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else
			{
				TreeNode suc = getSucc(root);
				root.data = suc.data;
				root.right = delete(root.right,suc.key);
			}
		}
		return root;
	}
	public static TreeNode getSucc(TreeNode root)
	{
		TreeNode curr = root.right;
		while(curr != null && curr.left != null)
			curr = curr.left;
		return curr;
	}
	//floor in BST
	public static TreeNode floor(TreeNode root,int key)
	{
		Node res = null;
		while(root != null)
		{
			if(root.data == x)
				return root;
			else if(root.data > x)
				root = root.left;
			else
			{
				res = root;
				root = root.right;
			}
		}
		return res;
	}
	//ceil in BST.
	public static TreeNode ceil(TreeNode root,int key)
	{
		Node res = null;
		while(root != null)
		{
			if(root.data == key)
				return root;
			else if(root.data < x)
				root = root.right;
			else
			{
				res = root;
				root = root.left;
			}
		}
		return res;
	}
	//TreeSet in JAVA (BST)
	public static void fun()
	{
		TreeSet<String> s = new TreeSet<>();
		s.add("gfg");
		s.add("courses");
		s.add("ide");
		System.out.println(s);
		System.out.println(s.contains("ide"));
		Iterator<String> i = s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		for(String x : s)
			System.out.println(x);
		s.remove("gfg");
		//these functions are not present in hashset they are only present in treeset.
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(5);
		ts.add(2);
		ts.add(11);
		System.out.println(ts.lower(5));
		System.out.println(ts.higher(6));
		System.out.println(ts.floor(5));
		System.out.println(ts.ceiling(5));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet());
		System.out.println(ts.lowerSet());
	}
	//TreeMap
	public static void fun2()
	{
		TreeMap<Integer,String> t = new TreeMap<>();
		t.put(10,"geeks");
		t.put(15,"ide");
		t.put(5,"courses");
		System.out.println(t);
		System.out.println(t.containsKey(10));
		for(Map.Entry<Integer,String> e : t.entrySet())
		{
			System.out.print(e.getKey()+" "+e.getValue());
		}
		//t.remove(10);
		System.out.println(t.size());
		System.out.println(t.containsValue("ide"));
		System.out.println(t.higherKey(10));
		System.out.println(t.lowerKey(10));
		System.out.println(t.floorKey(10));
		System.out.println(t.ceilingKey(10));
		System.out.println(t.higherEntry(10).getValue());
		System.out.println(t.lowerEntry(10).getValue());
		System.out.println(t.floorEntry(10).getValue());
	}
	//find ceiling on the left side in an array for every element.
	public static void fun3(int arr[],int n)
	{
		TreeSet<Integer> ts = new TreeSet<>();
		System.out.print(-1+" ");
		ts.add(arr[0]);
		for(int i=1;i<n;i++)
		{
			if(ts.ceiling(arr[i]) != null)
				System.out.print(ts.ceiling(arr[i])+" ");
			else
				System.out.print(-1+" ");
			ts.add(arr[i]);	
		}
	}
	//kth smallest element efficiently
	//naive soln.
	static int cnt = 0;
	public static void printK(TreeNode root,int k)
	{
		if(root != null)
		{
			printK(root.left,k);
			cnt++;
			if(cnt == k)
			{
				System.out.print(root.key);
				return;
			}
			printK(root.right);

		}
	}
	//we modify the tree like this and then perform operations on it.
	class Node
	{
		int key;
		Node left;
		Node right;
		//tells no. of nodes in the left subtree of given node.
		int lCount;
		Node(int x)
		{
			key = x;
		}
	}
	//check BST.
	//1 find maximum in left subtree.
	//2 find minimum in right 
	//3 if root is greater than left's max and smaller than right's min then 
	//it is a bst.
	public static int maximum(TreeNode root)
	{
		if(root == null)
			return -1;
		int max = Integer.MIN_VALUE;
		while(root != null)
		{
			max = Math.max(root.data,max);
			root = root.right;
		}
		return max;
	}
	public static int minimum(TreeNode root)
	{
		if(root == null )
			return -1;
		int min = Integer.MAX_VALUE;
		while(root != null)
		{
			min = Math.min(min,root.data);
			root = root.left;
		}
		return min;
	}
	//T(n) = O(n^2)
	// doesn't work.
	public static boolean isBST(TreeNode root)
	{
		if(root == null)
			return true;
		int min = minimum(root.right);
		int max = maximum(root.left);
		if((min < root.data && max > root.data) && (isBST(root.left)==true && isBST(root.right)))
			return true;
		return false;
	}
	//1 way
	static boolean isBST(TreeNode root,int min,int max)
	{
		if(root == null)
			return true;
		return(root.data > min && root.data < max
			&&isBST(root.left,min,root.data) && isBST(root.right,root.data,max));
	}
	//2 way
	public static int prev = Integer.MIN_VALUE;
	public static boolean isBST(TreeNode root)
	{
		if(root == null)
			return true;
		if(isBST(root.left) == false)
			return false;
		if(root.data <= prev)
			return false;
		prev = root.data;
		return isBST(root.right);
	}
    //FIX A BST WITH TWO NODES SWAPPED.
    //naive approach.
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void inorder(TreeNode root)
    {
    	if(root != null)
    	{
    		inorder(root.left);
    		arr.add(root.data);
    		inorder(root.right);
    	}
    }
    public static void swap(TreeNode root)
    {
    	inorder(root);
    	int prev=arr[0],first = -1,second = -1;
    	for(int i=1;<arr.size()-1;i++)
    	{
    		if(arr[i] < prev)
    		{
    			if(first == -1)
    				first = i-1
    			second = i;
    		}
    		prev = arr[i];
    	}
    	//first and second are the elements indices that need to be swapped.

    	
    }
    //The same approach applied to trees.
    TreeNode prev=null,first =null,second =null;
    public void fixBST(TreeNode root)
    {
    	if(root == null)
    		return;
    	fixBST(root.left);
    	if(prev != null && root.key < prev.key)
    	{
    		if(first == null)
    			first = prev;
    		second = root;
    	}
    	prev = root;
    	fixBST(root.right);
    }
    public static void fun(TreeNode root)
    {
    	fixBST(root);
    	int d =  first.data;
    	first.data = second.data;
    	second.data = d;
    	prev = null;
    	first = null;
    	second = null;
    	return;
    }
    //pair with given sum in the BST.
    //method-1
    static ArrayList<Integer> a = new ArrayList<>();
    static int cnt = 0;
    public static void inorder(TreeNode root)
    {
    	if(root != null)
    	{
    		inorder(root.left);
    		a.add(root.data);
    		cnt++;
    		inorder(root.right);
    	}
    }
    public static boolean sum(TreeNode root,int sum)
    {
    	inorder(root);
    	//now two pointer approach.
    	int low = 0;
    	int high = cnt-1;
    	while(low<high)
    	{
    		if(a.get(low)+a.get(high) == sum)
    			return true;
    		else if(a.get(low)+a.get(high) > sum)
    			high--;
    		else
    			low++;
    	}
    	return false;
    }//T(n) = O(n) and SN = O(n)

    //better approach.
    static boolean isPairSum(Node root,int sum,HashSet<Integer> s)
    {
    	if(root == null)
    		return false;
    	if(isPairSum(root.left,sum,s) == true)
    		return true;
    	if(s.contains(sum-root.data))
    		return true;
    	else
    		s.add(root.data);
    	return isPairSum(root.right,sum,s);
    }
    // t(n) = O(h)

}