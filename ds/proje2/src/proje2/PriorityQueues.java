package proje2;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueues 
{
	// array in sorted order, from max at 0 to min at size-1
	private int maxSize;
	private List<milliPark> queArray = new ArrayList<milliPark>();
	private int nItems;

	public PriorityQueues(int s) // constructor
	{
		maxSize = s;
		List<milliPark> queArray = new ArrayList<milliPark>(s);
		nItems = 0;
	}

	public void insert(milliPark park) // insert item
	{
		queArray.add(park);
		nItems++;
	}

	public milliPark remove() // remove minimum item
	{ 	
		int index=0;
		Double min = 100000.0;
		for(int j = 0; j < nItems; j++){
			if( queArray.get(j).getYuz_Olcumu() < min ){
				min = queArray.get(j).getYuz_Olcumu();
				index = j;
			}
		}
		milliPark removedPark = queArray.remove(index);
		nItems--;
		return removedPark;
	}

	public boolean isEmpty() // true if queue is empty
	{ return (nItems==0); }
	
	public boolean isFull() // true if queue is full
	{ return (nItems == maxSize); }
	
}

