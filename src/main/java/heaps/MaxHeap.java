package heaps;

import java.util.Arrays;

public class MaxHeap<T extends Comparable<? super T>> implements MaxHeapInterface<T> {

	private T[] heap;
	private int lastIndex; // Index of last entry and number of entries
	private boolean integrityOK = false;
	private static final int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 10000;
	
	public MaxHeap(int initialCapacity)
	   {
	      // Is initialCapacity too small?
	      if (initialCapacity < DEFAULT_CAPACITY)
	         initialCapacity = DEFAULT_CAPACITY;
	      else // Is initialCapacity too big?
	         checkCapacity(initialCapacity);
	      
	      // The cast is safe because the new array contains null entries
	      @SuppressWarnings("unchecked")
	      T[] tempHeap = (T[])new Comparable[initialCapacity + 1];
	      heap = tempHeap;
	      lastIndex = 0;
	      integrityOK = true;
	   } 
	
	public MaxHeap(T[] entries)
	{
	   this(entries.length); // Call other constructor
	   lastIndex = entries.length;
	   // Assertion: integrityOK = true

	   // Copy given array to data field
	   for (int index = 0; index < entries.length; index++)
	      heap[index + 1] = entries[index];

	   // Create heap
	   for (int rootIndex = lastIndex / 2; rootIndex > 0; rootIndex--)
	      reheap(rootIndex);
	} 

	@Override
	public void add(T newEntry) {
		// TODO Auto-generated method stub
		
		//checkIntegrity();        // Ensure initialization of data fields
		   int newIndex = lastIndex + 1;
		   int parentIndex = newIndex / 2;
		   while ( (parentIndex > 0) && newEntry.compareTo(heap[parentIndex]) > 0)
		   {
		      heap[newIndex] = heap[parentIndex];
		      newIndex = parentIndex;
		      parentIndex = newIndex / 2;
		   } // end while

		   heap[newIndex] = newEntry;
		   lastIndex++;
		   ensureCapacity();


	}

	@Override
	public T removeMax()
	{
	//   checkIntegrity();             // Ensure initialization of data fields
	   T root = null;

	   if (!isEmpty())
	   {
	      root = heap[1];            // Return value
	      heap[1] = heap[lastIndex]; // Form a semiheap
	      lastIndex--;               // Decrease size
	      reheap(1);                 // Transform to a heap
	   } // end if

	   return root;
	} // 

	@Override
	public T getMax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}
	
	  //Throw an exception if the client requests a capacity that is too large.
	  private void checkCapacity(int capacity)
	  {
	      if (capacity > MAX_CAPACITY)
	      {
	          throw new IllegalStateException
	          (
	              "Attempt to create a heap whose "
	              + "capacity exceeds allowed maximum of " + MAX_CAPACITY + "."
	          );
	      }
	  }

	  
	  //Double the size of the array bag.
	  //Pre-condition: checkInitialization has been called.
	  private void ensureCapacity()
	  {
	      int newLength = 2 * heap.length;
	      checkCapacity(newLength);
	      heap = Arrays.copyOf(heap, newLength);
	  }
	  
	  private void reheap(int rootIndex)
	  {
	     boolean done = false;
	     T orphan = heap[rootIndex];
	     int leftChildIndex = 2 * rootIndex;

	     while (!done && (leftChildIndex <= lastIndex) )
	     {
	        int largerChildIndex = leftChildIndex; // Assume larger
	        int rightChildIndex = leftChildIndex + 1;

	        if ( (rightChildIndex <= lastIndex) &&
	              heap[rightChildIndex].compareTo(heap[largerChildIndex]) > 0)
	        {
	           largerChildIndex = rightChildIndex;
	        } // end if

	        if (orphan.compareTo(heap[largerChildIndex]) < 0)
	        {
	           heap[rootIndex] = heap[largerChildIndex];
	           rootIndex = largerChildIndex;
	           leftChildIndex = 2 * rootIndex;
	        }
	        else
	           done = true;
	     } // end while
	    heap[rootIndex] = orphan;
	  }
	

}
