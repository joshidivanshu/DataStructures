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
}