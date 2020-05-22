import java.util.*;
class StackCollections
{
	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<>();
		st.push(10);// 	o(1) Operation
		st.push(20);
		st.push(30);
		System.out.println(st.peek());// to get top element
		while(st.isEmpty())
			System.out.print(st.pop()+" ");
		st.push(3);
		st.push(5);
		System.out.println(st.size());//2
		System.out.println(st.peek());// 5
	}
}