package stack;


public class Node<T> {
	public T data;
	public Node next = null;
	
	public Node(T data) {
		this.data = (T) data;
	}
} 
