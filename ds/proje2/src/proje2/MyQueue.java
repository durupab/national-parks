package proje2;

public class MyQueue {
	private int maxSize;
	private milliPark[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public MyQueue(int s) // constructor
	{
	maxSize = s;
	queArray = new milliPark[maxSize];
	front = 0;
	rear = -1;
	nItems = 0;
	}

	public void insert(milliPark park) // put item at rear of queue
	{
	if(rear == maxSize-1) // deal with wraparound
	rear = -1;
	queArray[++rear] = park; // increment rear and insert
	nItems++; // one more item
	}
	
	public milliPark remove() // take item from front of queue
	{
	milliPark temp = queArray[front++]; // get value and incr front
	if(front == maxSize) // deal with wraparound
	front = 0;
	nItems--; // one less item
	return temp;
	}
	
	public milliPark peekFront() // peek at front of queue
	{

	return queArray[front];
	}

	public boolean isEmpty() // true if queue is empty
	{
	return (nItems==0);
	}

	public boolean isFull() // true if queue is full
	{
	return (nItems==maxSize);
	}
	
	public int size() // number of items in queue
	{
	return nItems;
	}
	
} // end class Queue

