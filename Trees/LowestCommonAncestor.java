class LowestCommonAncestor
{
	//Ancestor of a node is a node itself,than it's parent,it's parent's parent and so on.
	boolean findPath(Node root,ArrayList<Node> p,int n)
	{
		if(root == null)
			return false;
		p.add(root);
		if(root.data == n)
			return true;
		if(findPath(root.left,p,n) || findPath(root.right,p,n))
			return true;
		return false;
	}
	public static Node lca(Node root,int n1,int n2)
	{
		ArrayList<Node> path1 = new ArrayList<>();
		ArrayList<Node> path2 = new ArrayList<>();
		if(findPath(root,path1,n1) == false || findPath(root,path2,n2) == false)
			return null;
		for(int i=0;i<path.size()-1 && i<path2.size()-1;i++)
		{
			if(path1.get(i+1) != path2.get(i+1))
				return path.get(i);
		}
		return null;

	}
}