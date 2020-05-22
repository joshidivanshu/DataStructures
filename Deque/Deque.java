import java.util.*;
class Deque
{
	// stands for doubly ended queue.
	// insertion and deletions can occur on both end
	//insertFront deleteFront deleteRear insertDelete
	// getFront getRear
	//doubly linked list will be used for deque implementation
	// circular array with front and rear. We can also use front and size
	// can get rear using size.
	// can be used as both stack and queue.
	// maintaining history of actions
	// a steal process scheduling algorithm
	// PriorityQueue can also be created using deque
	// provides two set of functions 
	//one set of functions do not throw any exceptio if they dont find the element in the deque
	//one set throws exception in that case
	// all these functions used below do not throw any kind of exception if elements are not present in the deque they simply return null

	public static void fun(){
	Deque<Integer> dq = new LinkedList<Integer>();
	dq.offerFirst(10); // return true if item was successfully added
	dq.offerFirst(20);
	dq.offerFirst(30);
	dq.offerLast(40);
	dq.offerLast(50);// return true if the item was successfully added
	System.out.println(dq.peekFirst());
	System.out.println(dq.peekLast());
	dq.pollFirst(); // removes it
	dq.pollLast();
    System.out.println(dq.peekFirst());
    System.out.println(dq.peekLast());// if empty returns null
    // traversal
    for(int x : dq)
    	System.out.print(x+" ");
    //using iterator
    Iterator it = dq.iterator();
    while(it.hasNext())
    	System.out.print(it.next()+" ");
    // using iterator to iterator from the end of deque
    Iterator it = dq.descendingIterator();
    while(it.hasNext())
    	System.out.print(it.next()+" ");
    // it extends Queue interface so it can use the functions of the queue interface
    // removal and addition O(1) DBLL
    // all functions are O(1) TC.
   }
   // the functions that throw an exception
   public static void fun()
   {
    Deque<Integer> dq = new LinkedList<Integer>();
    dq.addFirst(10);
    dq.addLast(20);
    dq.getFirst();
    dq.getLast();
    dq.removeFirst();
    dq.removeLast();
   }

}