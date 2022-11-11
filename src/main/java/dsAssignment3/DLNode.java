package dsAssignment3;

/**
 * A class that implements Node structure for doubly edge linked list
 * 
 * @param <T>
 */
public class DLNode<T> {

	private T data;
	private DLNode<?> next;
	private DLNode<?> previous;

	public DLNode(T data, DLNode<?> next, DLNode<?> previous) {
		super();
		this.data = data;
		this.next = next;
		this.previous = previous;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DLNode<?> getNext() {
		return next;
	}

	public void setNext(DLNode<?> next) {
		this.next = next;
	}

	public DLNode<?> getPrevious() {
		return previous;
	}

	public void setPrevious(DLNode<?> previous) {
		this.previous = previous;
	}

}
