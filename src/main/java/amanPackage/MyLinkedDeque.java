package amanPackage;
//A circular deque that implements DequeInterface  
public class MyLinkedDeque <T> implements DequeInterface<T>{
	 
	   private DLNode headNode; // References node at front of deque
	  // private DLNode lastNode;  // References node at back of deque
	   
		public MyLinkedDeque()
		{
			headNode = null;
			//lastNode = null;
		} // end default constructor  when the list is empty 
	 
	
	@Override
	public void addToFront(T newEntry) {

	addToBack(newEntry);
	headNode = headNode.getPrevious(); 
		
		
	}

	@Override
	public void addToBack(T newEntry) {
		DLNode newNode = new DLNode( newEntry);
		if (isEmpty()) {
			  headNode = newNode;	
		}
		    
		else {
			newNode.setPrevious(headNode.getPrevious());  // making new node’s previous pointer to point to head node’s previous
			newNode.setNext(headNode); //making new node’s next pointer to point to head.
			
			// updating head node’s previous pointer’s next pointer to new node
		     ( headNode.getPrevious()).setNext(newNode);
		   
		     //updating head node’s previous pointer to new node
		    headNode.setPrevious(newNode);
		
		}
		      		  	
	}

	@Override
	public T removeFront() {
		// TODO Auto-generated method stub
		
		if (headNode==null) {
			System.out.println("deque is empty");
			return null;
		}
		else {
			headNode = headNode.getNext();
			return removeBack();
		}
		
		
	}

	@Override
	public T removeBack() {
		// TODO Auto-generated method stub
	
		if (headNode==null) {
			System.out.println("deque is empty");
			return null;
		}
		
		//if only one node is there
		else if(headNode.getPrevious()==headNode.getNext()){
		  T data =  (T) headNode.getData();
		  headNode = null;
		  return data;
			
		}
		else {
			DLNode tempTailnode = (headNode.getPrevious()).getPrevious();
			//last second node refrence
			
			 T data =  (T) (headNode.getPrevious()).getData();
			tempTailnode.setNext(headNode);
			headNode.setPrevious(null);
			headNode.setPrevious(tempTailnode);
			return data;
			
			
		}
		
		
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		if (headNode==null) {
			System.out.println("deque is empty");
			return null;
		}
		
		else {
		 T data = (T)headNode.getData();
		 return data;
		}
	}

	@Override
	public T getBack() {
		// TODO Auto-generated method stub
		if (headNode==null) {
			System.out.println("deque is empty");
			return null;
		}
		else if(headNode.getPrevious()==headNode.getNext()){
				  T data =  (T) headNode.getData();
				  return data;
					
				}
		
		else {
					 T data =  (T) (headNode.getPrevious()).getData();
					return data;
		
				}
				
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(headNode==null) {
			return true;
			
		}
		else {
			return false;
		}
	}

	@Override
	public void clear() {
		headNode = null;
		
	}
	
	public void print() {
		
		DLNode temp;
		temp =headNode;
		if (temp==null) {
			System.out.println("Queue is empty");
			return;
		}
		while(true) {
			System.out.println(temp.getData());
			temp= temp.getNext();
			if(temp==headNode)
				break;
		}
	
	}

}
