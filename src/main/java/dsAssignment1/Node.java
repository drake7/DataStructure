package dsAssignment1;

public class Node<T> {

	//data information 
	public T data;
	
	
	//address
	public Node<T> next;
	
	//whenever i am going to create a new node,i need data and i need address
	public Node(T data)
	{
		this.data=data;
		this.next=null;
	}
	
	
}
