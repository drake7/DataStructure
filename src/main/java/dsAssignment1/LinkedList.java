package dsAssignment1;

//implements that interface and provide the implementation of the methods
public class LinkedList<T> implements ListInterface<T>{

	//starting node 
	Node<T> head;
	
	Node<T> temp;
	@Override
	public void add(T data) {
		
		//6
		
		Node<T> temp=new Node<>(data);
		//list is empty
		if(this.head==null)
		{
			head=temp;
		}
		else {
			//temp node for traversing the array
			
			Node<T> travelNode=head;
			
			//
			while(travelNode.next!=null)
			{
				travelNode=travelNode.next;
				
			}
			travelNode.next=temp;
		}
		
		
	}

	@Override
	public void add(int position, T data) {
		
		//created temp node
		Node<T> temp=new Node<>(data);
		
		//list is empty
		if(this.head==null)
		{
			head=temp;
		}
		else 
		{
			//temp node for traversing the array
			Node<T> travelNode=head;
		
			int count=1;
			
			
			while(travelNode.next!=null && count!=position)
			{
				travelNode=travelNode.next;
				count++;
				
			}
			//position where we want to insert
			Node<T> saviour=travelNode.next;
			
			//temp node is a new node;
			travelNode.next=temp;
			temp.next=saviour;
		}
	}

	@Override
	public void remove(int position) {
		
		
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head=null;
	}

	@Override
	public void replace(int position, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getEntry(int position) {
		// TODO Auto-generated method stub

		int counter=0;
		Node<T> traverseNode=head;
	while(counter!=position && traverseNode.next!=null)
	{
		System.out.println(counter+":"+position);
		counter=counter+1;
		traverseNode=traverseNode.next;
	}
	
	return traverseNode.data;
	
	}

	@Override
	public T[] toArray(T head) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T entry) {
		// TODO Auto-generated method stub
		
		//traverse to get the length then create an array
		
		return false;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		int counter=0;
		Node<T> traversalNode=head;
		while(traversalNode.next!=null)
		{
			counter++;
			traversalNode=traversalNode.next;
		
		}
		
		return counter;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node<T> traversalNode=head;
		while(traversalNode!=null)
		{
			System.out.println(traversalNode.data);
			traversalNode=traversalNode.next;
			
		}
		
	}
	

}
