package dsAssignemnt2;


public class Node<T> {
	//data information 
	T data;
	
	
	//address
	Node<T> next;
	
	//whenever i am going to create a new node,i need data and i need address
	Node(T data)
	{
		this.data=data;
		this.next=null;
	}
	

}
