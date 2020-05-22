class TwoStacks
{
// if we need to implement two stacks in a single array
// for cache friendliness and locality of reference
int max = 100;
int arr[] = new int[max];
int top1;
int top2;
TwoStacks()
{
 top1 = -1;
 top2 = 100;
}
int size1()
{
	return top1+1;
}
int size2()
{
	return top2+1;
}
void push1(int x)
{
	if(top1 < top2-1)
	{
	 arr[++top1] = x;
	 return;
	}
	return;
}
void push2(int x)
{
  if(top1 <top2 -1)
  {
   arr[--top2] = x;
   return;
  }
  return;
}
int pop1()
{
 if(top1<0)
	return -1;
 int x = arr[top1];
 top1--;
 return x; 
}
int pop2()
{
 if(top2 == max)
	return -1;
 int x = arr[top2--];
 return x; 
}
public static void main(String[] args)
{
	TwoStack st = new TwoStacks();
	st.push1(10);
	st.push2(20);
	st.push1(30);
	System.out.print(st.pop1()+st.pop2());
}
}