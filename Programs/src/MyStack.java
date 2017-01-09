
import java.util.*;
public class MyStack {
	public static void main(String[] args) {
		MyStack myStack = new MyStack(4);
		if(!myStack.isFull())
			myStack.push(1);
		if(!myStack.isFull())
			myStack.push(2);
		if(!myStack.isFull())
			myStack.push(3);
		if(!myStack.isFull())
			myStack.push(4);
		if(!myStack.isFull())
			myStack.push(5);
        else
            System.out.println("Stack is full, cannot push element");
		while(!myStack.isEmpty())
		{
			long value = myStack.pop();
			System.out.println(value);
		}
   }
	private int maxSize;
	private int top;
	private long[]  stackArray;
	public MyStack(int s)
	{
		maxSize = s;
		top = -1;
		stackArray = new long[maxSize];
	}
	public void push(long j)
	{
		stackArray[++top] = j;
	}
	public long pop()
	{
		return stackArray[top--];
		
	}
	//to return most recent inserted element
	public long peek()
	{
		return stackArray[top];
	}
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(top == maxSize -1)
		{
			return true;
		}
		else
			return false;
	}
	

}
