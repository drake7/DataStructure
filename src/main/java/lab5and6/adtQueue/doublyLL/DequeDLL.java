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
		
		public DLNode(T data,DLNode next,DLNode previous)
		{
			this.data = data;
			this.next = next;
			this.previous = previous;
		}
	}
	
	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		
	}
	
	public void addToFront(T newEntry)
	{
		DLNode newNode = new DLNode(newEntry,null,null);
		if(isEmpty())
		{
			last=newNode;
			newNode.next=first;
		}
		else
		{
			first.previous=newNode;
		}
		
		first=newNode;
	
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addToBack(T newEntry)
	{
		DLNode newNode = new DLNode(newEntry,null,null);
		if(isEmpty())
		{
			first=newNode;
			newNode.previous=last;
		}
		else
		{
			last.next=newNode;
		}
		
		last=newNode;
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
		
	}

	public static void main(String[] args) throws Exception {
		
		DequeDLL<String> newQueue=new DequeDLL<>();
		newQueue.addToFront("Deepak");
		newQueue.addToFront("Deepak1");
		newQueue.addToBack("Kumar");
		System.out.println(newQueue.getFront());
		System.out.println(newQueue.getBack());
		
	}
}
