package proje2;

import java.util.Arrays;

public class Pq2 
{
	// array in sorted order, from max at 0 to min at size-1
	private int maxSize;
	int[] kasa;
	private int nItems;
	private int index = 0;
	
	public Pq2(int s) // constructor
	{
		maxSize = s;
		kasa  = new int[11];
		nItems = 0;
	}

	public void insert(int[] sira) // insert item
	{
		Arrays.sort(sira);
		for(int i = 0; i< sira.length;i++) {
			kasa[i] = sira[i];
		}	
		
	}

	public void remove() // remove first item
	{ 	
		for (int i = 0; i < kasa.length - 1; i++) {
		    kasa[i] = kasa[i + 1];
		}
	}

	public boolean isEmpty() // true if queue is empty
	{ return (nItems==0); }
	
	public boolean isFull() // true if queue is full
	{ return (nItems == maxSize); }
	
}
