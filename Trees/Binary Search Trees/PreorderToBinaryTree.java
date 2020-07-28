import java.util.*;

class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
class PreOrderToBinaryTree
{
    public static Node constructTree(int pre[],int n)
    {
        Node root = new Node(pre[0]);
        Stack<Node> s = new Stack<>();
        s.push(root);
        for(int i=1;i<n;i++)
        {
            Node temp = null;
            while(!s.isEmpty() && pre[i] > s.peek().data)
            {
                temp = s.pop();
            }
            if(temp != null)
            {
                temp.right = new Node(pre[i]);
                s.push(temp.right);
            }
            else
            {
                temp = s.peek();
                temp.left = new Node(pre[i]);
                s.push(temp.left);
            }
        }
        return root;
    }
    public static void postorder(Node root)
    {
        if(root != null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}