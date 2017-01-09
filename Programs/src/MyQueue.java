import java.util.NoSuchElementException;

public class MyQueue {
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue(4);
		if(!myQueue.isFull())
		{
			myQueue.Enqueue(1);
		}
		if(!myQueue.isFull())
		{
			myQueue.Enqueue(2);
		}
		if(!myQueue.isFull())
		{
			myQueue.Enqueue(3);
		}
		if(!myQueue.isFull())
		{
			myQueue.Enqueue(4);
		}
		if(!myQueue.isFull())
		{
			myQueue.Enqueue(5);
		}
        else
            System.out.println("Array is full, cannot insert element");
		while(!myQueue.isEmpty())
		{
			long value = myQueue.Dequeue();
			System.out.println(value);
		}
	}
	private int front;
	private int rear;
	private int maxSize;
	private int len;
	private long[] queueArray;
	
	public MyQueue(int s)
	{
		maxSize = s;
		front = -1;
		rear = -1;
		len = 0;
		queueArray = new long[maxSize];
	}
	public boolean isFull()
	{
		if(front == 0 && rear == maxSize)
		{
			return true;
		}
		else
			return false;
	}
	
	public void Enqueue(int i)
	{
		if(rear == -1)
		{
			rear = 0;
			front = 0;
			queueArray[rear] = i;
		}
		else if(rear < maxSize)
		{
			queueArray[rear] = i;
		}
		else if(rear+1 >= maxSize)
		{
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		rear = rear +1;
		len++;
	}
	public long Dequeue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Underflow Exeception");
			
		}
		long value = queueArray[front];
		len--;
		if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else
			front++;
		return value;
		
	}
	public boolean isEmpty()
	{
		if(front == -1)
		{
			return true;
		}
		else
			return false;
	}

}
