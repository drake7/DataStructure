/**
 * 
 */
package dsAssignment3;

/**
 * @author deepa
 * @param <T>
 *
 */
/**
 * A class that implements the a deque of objects by using a chain of doubly
 * linked nodes.
 */
public class MyLinkedDequeue<T> implements DequeInterface<T> {

	private DLNode<?> firstNode;
	private DLNode<?> lastNode;

	MyLinkedDequeue() {
		firstNode = null;
		lastNode = null;
	}

	@Override
	public void addToFront(T newEntry) {

		DLNode newNode = new DLNode(newEntry, firstNode, null);

		if (isEmpty()) {
			lastNode = newNode;
		} else {
			firstNode.setPrevious(newNode);
		}

		firstNode = newNode;
	}

	@Override
	public void addToBack(T newEntry) {
		// TODO Auto-generated method stub
		DLNode<?> newNode = new DLNode(newEntry, null, lastNode);

		if (isEmpty()) {
			firstNode = newNode;
		} else {
			lastNode.setNext(newNode);
		}

		lastNode = newNode;
	}

	@Override
	public T removeFront() {

		if (isEmpty()) {
			System.out.println("\n List is empty,No Element to remove");
			return null;
		}
		DLNode newNode = firstNode;
		firstNode = firstNode.getNext();

		return (T) newNode;
	}

	@Override
	public T removeBack() {
		if (isEmpty()) {
			System.out.println("\n List is empty,No Element to remove");
			return null;
		}
		DLNode<?> newNode = lastNode;
		lastNode = lastNode.getPrevious();
		lastNode.setNext(null);
		return (T) newNode;
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("List is empty");
		}
		return (T)firstNode;
	}

	@Override
	public T getBack() {
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		

		return (T)lastNode;
	}

	@Override
	public boolean isEmpty() {

		if (firstNode == null)
			return true;

		return false;
	}

	@Override
	public void clear() {
		
		firstNode=null;
		lastNode=null;
	}

	

	@Override
	public void print() {

		DLNode<?> traverseNode = firstNode;
		while (traverseNode != null) {
			System.out.println(traverseNode.getData());
			traverseNode = traverseNode.getNext();
		}
	
	}

}
