package deque;

//Fixed Array, circular, can expand with one empty element
public class DequeArrays<T> implements DequeInterface<T> {

	private T[] deque;
	private int frontIndex, backIndex;
	private boolean integrityOK;
	private static int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;
	private int count;

	public DequeArrays() {
		this(DEFAULT_CAPACITY);
	}

	public DequeArrays(int initialCapacity) {
		integrityOK = false;
		@SuppressWarnings("unchecked")
		T[] tempQueue = (T[]) new Object[initialCapacity];
		deque = tempQueue;
		frontIndex = -1;
		backIndex = 0;
		DEFAULT_CAPACITY = initialCapacity;
		integrityOK = true;
	}// end constructor

	private void checkCapacity(int initialCapacity) {
		if (deque.length > MAX_CAPACITY)
			throw new IllegalStateException(
					"Attempt to create a bag whose " + "capacity exeeds allowed " + "maximum of " + MAX_CAPACITY);
	}

	@Override
	public void addToFront(T newEntry) {
		checkIntegrity();
		ensureCapacity();
		if (frontIndex == -1) {
		//both are initialized to be zero
			frontIndex = 0;
			backIndex = 0;
		}
		else if (frontIndex == 0) {
			//set the front of element as the last index of an array
			frontIndex = DEFAULT_CAPACITY - 1;
		} else
		{
			//if there is already element at last
			frontIndex = frontIndex - 1;
		}
		//set last of array as the front 
		deque[frontIndex] = newEntry;

	}

	@Override
	public void addToBack(T newEntry) {
		// addToBack is like enqueue in queue
		checkIntegrity();
		ensureCapacity();

		if (frontIndex == -1) {
			frontIndex = 0;
			backIndex = 0;
		}
		else if
		(backIndex == DEFAULT_CAPACITY - 1) {
			backIndex = 0;
		}
		// increment rear end by '1'
		else {
			backIndex = backIndex + 1;
		}
		deque[backIndex]=newEntry;
	}

	@Override
	public void removeFront() {
		
		checkIntegrity();
		if (isEmpty())
			{System.out.println("Array is empty");
			return ;}
		
		if(frontIndex==backIndex)
		{
			frontIndex=-1;
			backIndex=-1;
			
		}
		else {
			if(frontIndex== DEFAULT_CAPACITY-1)
			{	frontIndex=0;
			}
			else
			{
				frontIndex=frontIndex+1;
			}
		
		} // end if
		return ;
	}

	@Override
	public void removeBack() {
		// This is dequeue in queue

		checkIntegrity();
		if (isEmpty())
			{
			System.out.println("Array is empty");
			return ;
			}
		
		if(frontIndex==backIndex)
		{
			frontIndex=-1;
			backIndex=-1;
			
		}
		else if(backIndex== 0)
			{	
			backIndex=DEFAULT_CAPACITY-1;
			}
			else
			{
				backIndex=backIndex-1;
			}
		
	}

	@Override
	public T getFront() {
		checkIntegrity();
		if (isEmpty())
			System.out.println("Array is empty");
		else
			return deque[frontIndex];
		return deque[frontIndex];
	}

	@Override
	public T getBack() {
		checkIntegrity();
		if (isEmpty())
			System.out.println("Array is empty");
		else
			return deque[backIndex];
		return deque[backIndex];
	}

	@Override
	public boolean isEmpty() {
		checkIntegrity();
		return frontIndex == ((backIndex + 1) % deque.length);

	}

	public int getCount() {
		return count;
	}

	@Override
	public void clear() {
		deque = null;

	}

	private void checkIntegrity() {
		if (!integrityOK)
			throw new SecurityException("Array object is corrupt.");

	}

	private void ensureCapacity() {
		if (frontIndex == ((backIndex + 2) % deque.length)) // If array is full,// double size of array
		{
			T[] oldQueue = deque;
			int oldSize = oldQueue.length;
			int newSize = 2 * oldSize;
			checkCapacity(newSize - 1);
			integrityOK = false;
			// The cast is safe because the new array contains null entries
			@SuppressWarnings("unchecked")
			T[] tempQueue = (T[]) new Object[newSize];
			deque = tempQueue;
			for (int index = 0; index < oldSize - 1; index++) {
				deque[index] = oldQueue[frontIndex];
				frontIndex = (frontIndex + 1) % oldSize;
			} // end for
			frontIndex = 0;
			backIndex = oldSize - 2;
			integrityOK = true;
		} // end if

	}

	public String toString() {
		String result = "";
		int scan = 0;

		while (scan < deque.length) {
			if (deque[scan] != null) {
				result += deque[scan].toString() + "\n";
			}
			scan++;
		}

		return result;

	}

	public void printFromFront() {
		System.out.println("\nPrinting elements from front");
		
		if (!isEmpty()) {
	
		int i=frontIndex;
	        do {
	            System.out.print(" " + deque[frontIndex]);
	            i  = ++i % deque.length;
	           }
	        while (i != backIndex);

		
	        	
	        } else {
			System.out.println("ADT does not exists!");

		}
	}

	public void printFromBack() {
		System.out.println("\nPrinting elements from back");
		if (!isEmpty()) {
			for (int i = deque.length; i > 0; i++) {
				System.out.println(deque[i]);
			}
		} else {
			System.out.println("ADT does not exists!");
		}
	}
	
	public void print()
	{
		 for (T o :deque){  
	            if (o != null)  
	                System.out.print(o + " ");  
	        }  
	        System.out.println();  
	}

}
