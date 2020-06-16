class VerticalTraversal
{
	//we make use of the horizontal distance from the root node.
	//towards the right direction we mark horizontal distance as positive.
	//towards the left direction we mark it as negative.
	//We store this in a treemap and do level order traversal to store these in the treemap.
	class Pair
	{
		Node node;
		int hd;
		Pair(Node n,int h)
		{
			node = n;
			hd = h;
		}
	}
	public static void VerticalTraversal(Node head)
	{
		Queue<Pair> q = new LinkedList<>();
		TreeMap<Integer,ArrayList<Integer>> mp = new TreeMap<Integer,ArrayList<Integer>>();
		q.add(new Pair(head,0));
		while(!q.isEmpty())
		{
			Pair p = q.poll();
			Node curr = p.node;
			int hd = p.hd;
			if(mp.containsKey(hd))
				mp.get(hd).add(curr.data);
			else
			{
				ArrayList<Integer> al = new ArrayList<>();
				al.add(curr.data);
				mp.put(hd,al);
			}
			if(curr.left != null)
				q.add(new Pair(head.left,hd-1));
			if(curr.right != null)
				q.add(new Pair(head.right,hd+1));
		}
		//print map contents line by line.
		for(Map.Entry<Integer,ArrayList<Integer>> arr : mp.entrySet())
		{
			ArrayList<Integer> temp = arr.getValue();
			for(int i=0;i<temp.size();i++)
				System.out.print(arr.get(i)+" ");
			System.out.println();
		}
	}
	//Vertical Sum in Binary Tree.
	public static void verticalSum(Node head)
	{
		Queue<Pair> q = new LinkedList<>();
		TreeMap<Integer,Integer> hm = new TreeMap<Integer,Integer>();
		q.add(head,0);
		while(!q.isEmpty())
		{
			Pair p = q.poll();
			Node curr = p.node;
			int hd = p.hd;
			if(mp.containsKey(hd))
				hm.put(hd,hm.get(hd)+curr.data);
			else
				hm.put(hd,curr.data);
			if(curr.left != null)
				q.add(curr.left);
			if(curr.right != null)
				q.add(curr.right);
		}
		//printing out sum according to the requirements.
		for(Map.Entry<Integer,Integer> arr : hm.entrySet())
		{
			System.out.println(arr.getValue());
		}
	}
}