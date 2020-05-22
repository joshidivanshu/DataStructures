import java.util.*;
class GenerateNumbers
{
	// queue based approach to generate numbers with digits 5 and 6
	// it can even handle the case when the size of number becomes really very huge.
	public void fun(int n,int d1,int d2)
	{
      Queue<String> q = new LinkedList<String>();
      q.add("5");
      q.add("6");
      while(n != 0)
      {
      	String o = q.poll();
      	q.add(o+5);
      	q.add(o+6);
      	System.out.print(o+" ");
      }
      System.out.println();
	}
}