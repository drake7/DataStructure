package lab5and6.adtQueue.doublyLL;

import lab5and6.adtQueue.circularArray.QueueInterface;

public class DequeDLL<T> implements QueueInterface<T> {

	private DLNode first;
	private DLNode last;
	
	private DequeDLL()
	{
		first = null;
		last = null;
	}
	private class DLNode
	{
		
		private T data;
		private DLNode next;
		private DLNode previous;
		
		public DLNode(T data)
		{
			this.data = data;
			this.next=null;
			this.previous=null;
		}
		public DLNode()
		{
			this.data = null;
			this.next=null;
			this.previous=null;
		}
	}
	
	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		
	}
	
	public void addToFront(T newEntry)
	{
		DLNode newNode = new DLNode(newEntry);
		if(isEmpty())
		{
			//only one element in the queue
			first=last=newNode;
		}
		else
		{
			//new Node will come in front and will point to existing front
			newNode.next=first;
			
			//firstnode's previous will point to new Node
			first.previous=newNode;
			
			//new node now becomes the firstNode
			first=newNode;
		}
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addToBack(T newEntry)
	{
		DLNode newNode = new DLNode(newEntry);
		if(last==null)
		{
		first=last=newNode;
		}
		else
		{
			//newNode will point to last
			newNode.previous=last;
			
			//last's next should be point to newNode
			last.next=newNode;
			//
			last=newNode;
		}
		
	}

	@Override
	public T getFront() throws Exception {
		// TODO Auto-generated method stub
		
		if(first==null && last==null)
		{
			System.out.println("Queue is empty");
			return null;
		}
		
		
		return first.data;
	}
	
	public T getBack() throws Exception{
		
		if(first==null && last==null)
		{
			System.out.println("Queue is empty");
			return null;
		}
		
		
		
		return last.data;
	}
	
	public void removeFront()
	{
		if(first==null && last==null)
		{
			System.out.println("Queue is empty");
			return;
		}
		
		DLNode temp=first;
		first=first.next;
		
		//only one element was there
		if(first==null)
		{
			last= null;
		}
		else
		{
			first.previous=null;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		if(first == null && last == null)
			return true;
		
		
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		
		DLNode temp=new DLNode();
		temp=first;

		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) throws Exception {
		
		DequeDLL<String> newQueue=new DequeDLL<>();
		newQueue.addToFront("Deepak");
		newQueue.addToFront("Deepak1");
		newQueue.addToBack("Kumar");
		newQueue.addToBack("Kumar2");
		newQueue.print();
	}
}
