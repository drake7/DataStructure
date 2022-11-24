package amanPackage;

public class DLNode <T>{
	private T      data;  	 // Deque entry
	private DLNode next;  	 // Link to next node
	private DLNode previous; // Link to previous node
	
// making the node circular 
	public DLNode(T data) {
		super();
		this.data = data;
		this.next= this;
		this.previous= this;
		
	}
	
	//Constructor for the node class	
	public DLNode(DLNode previous,T data, DLNode next) {
		super();
		this.data = data;
		this.next = next;
		this.previous = previous;
	}
	
	public DLNode()
	{
		
	}
	
	//getters and setters for the node class
		public T getData() {
			return data;
		}
	public void setData(T data) {
		this.data = data;
	}
	public DLNode getNext() {
		return next;
	}
	public void setNext(DLNode next) {
		this.next = next;
	}
	public DLNode getPrevious() {
		return previous;
	}
	public void setPrevious(DLNode previous) {
		this.previous = previous;
	}
	

}
