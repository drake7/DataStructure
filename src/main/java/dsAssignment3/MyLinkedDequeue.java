/**
 * 
 */
package dsAssignment3;

/**
 * @author deepa
 * @param <T>
 *
 */
/**  A class that implements the a deque of objects by using 
a chain of doubly linked nodes. */
public class MyLinkedDequeue<T> implements DequeInterface<T>{

	private DLNode firstNode;
	private DLNode lastNode;
	
	MyLinkedDequeue()
	{
		firstNode=null;
		lastNode=null;
	}
	
	@Override
	public void addToFront(T newEntry) {
	
		DLNode newNode=new DLNode(newEntry,null,lastNode);
		
		if(isEmpty())
		{
			firstNode=newNode;
		}
		else
		{
			lastNode.setNext(newNode);
		}
		
		lastNode=newNode;
	}

	@Override
	public void addToBack(T newEntry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T removeFront() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T removeBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		
		if(firstNode==null && lastNode==null)
			return true;
		
		return false;
	}

	@Override
	public boolean clear() {
		// TODO Auto-generated method stub
		return false;
	}

}
