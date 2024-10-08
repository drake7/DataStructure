package linkedlist;

import linkedlist.LinkedListNodeFinder.Node;

public class LinkedListImplementation {


	static Node head;
	class Node
	{
		Node next;
		int data;
		public Node(int data)
		{
			this.data=data;
			this.next=null;

		}
	}


	public void addToFront(int newData)
	{
		Node newNode = new Node(newData); 
		/* 2. Make next of new Node as head */
		newNode.next = head; 
		/* 3. Move the head to point to new Node */
		head = newNode; 
	}
	public static int getNode(int index)
	{
		Node current = head; 
		//variable to keep track of index
		int count = 0; /* index of Node we are 
	                      currently looking at */
		while (current != null) 
		{ 
			if (count == index) 
				return current.data; 
			count++; 
			current = current.next; 
		} 

		return 0;
	}
	public void removeFirst(int index)
	{
	
		
	}
	
	public void removeFromIndex(int index)
	{
	
		
	
	}
	
	public void printList(int index)
	{
		
	}
}
