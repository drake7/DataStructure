package amanPackage;
// A deque interface for the project
public interface DequeInterface<T>
	{
	   /** Adds a new entry to the front of this deque.
	       @param newEntry  An object to be added. */
	   public void addToFront(T newEntry);
	   
	   
	   /** Adds a new entry to the back of this deque.
       @param newEntry  An object to be added. */
	   public void addToBack(T newEntry);
	   
	   
	   /** Removes and returns the front entry of this deque.
	       @return  The object at the front of the deque.
	       @throws  EmptyQueueException if the deque is empty before the operation. */
	   public T removeFront();
	   
	   
	   /** Removes and returns the back entry of this deque.
       @return  The object at the back of the deque.
       @throws  EmptyQueueException if the deque is empty before the operation. */
	   public T removeBack();
	   
	   
	   /** Retrieves the front entry of this deque.
	       @return  The object at the front of the deque.
	       @throws  EmptyQueueException if the deque is empty. */
	   public T getFront();
	   
	   
	   /** Retrieves the back entry back of this deque.
       @return  The object at the back of the deque.
       @throws  EmptyQueueException if the deque is empty. */
	   public T getBack();
	   
	   
	   /** Detects whether this deque is empty.
	       @return  True if the deque is empty, or false otherwise. */
	   public boolean isEmpty();
	   
	   
	   /**  Removes all entries from this deque. */
	   public void clear();
	   
	   /** print all entries **/
	   public void print();
	} 

// end DequeInterface


