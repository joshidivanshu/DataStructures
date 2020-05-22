public class DoublyLinkedList
{
	Node head;
	static class Node
	{
	   int data;
	   Node next;
	   Node prev;
	   Node(int d)
	   {
	   	data = d;
	   }
	}
	// want to add data at the end of linkedList
	public void append(int data)
	{
		Node temp = new Node(data);
        if(head == null)
        {
        	head = temp;
        	return;
        }
        Node curr = head;
        while( curr.next != null)
        	curr = curr.next;
        curr.next = temp;
        temp.prev = curr;
        return;
	}
	public void printList()
	{
		if(head == null)
			return;
		Node curr = head;
		while( curr != null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println(); 
	}
	public static void main(String[] args)
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.append(10);
		dll.append(20);
		dll.append(30);
		dll.append(40);
		
	}
}