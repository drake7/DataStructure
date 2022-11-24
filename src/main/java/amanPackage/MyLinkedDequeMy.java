package amanPackage;

//A circular deque that implements DequeInterface  
public class MyLinkedDequeMy <T> implements DequeInterface<T>{
	 
	   private DLNode firstNode; // References node at front of deque
	   private DLNode lastNode;  // References node at back of deque
	   
		public MyLinkedDequeMy()
		{
			firstNode = null;
			lastNode = null;
		} // end default constructor  when the list is empty 
	 
	
	@Override
	public void addToFront(T newEntry) {
		DLNode newNode=new DLNode();
		newNode.setData(newEntry);
		
		newNode.setNext(null);
		newNode.setPrevious(null);
		
		
		if(firstNode == null)
		{
			firstNode=newNode;
			firstNode.setNext(firstNode);
			firstNode.setPrevious(firstNode);
		}
		else
		{
			DLNode temp=new DLNode();
			temp=firstNode;
			
			while(temp.getNext()!=firstNode)
			{	temp=temp.getNext();}
			
			
			temp.setNext(newNode);
			
			newNode.setPrevious(temp);
			newNode.setNext(firstNode);
			firstNode.setPrevious(newNode);
			firstNode=newNode;
			
					
		}		 
	}

	@Override
	public void addToBack(T newEntry) {
		DLNode newNode = new DLNode( newEntry);
		if (isEmpty()) {
			  firstNode = newNode;	
		}
		    
		else {
			
		
		
		}
		      		  	
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
		// TODO Auto-generated method stub
		
		if(firstNode==null && lastNode==null)
			return true;
		
		
		
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		firstNode=null;
		lastNode=null;
		
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		
		DLNode temp=new DLNode();
		
		temp=firstNode;
		
		if(temp==null)
		{
			System.out.println("Queue is empty");
			return;
		}
		
		while(true)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
			if(temp==firstNode)
				break;
		}
		
	}

}
