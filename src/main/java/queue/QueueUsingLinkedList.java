package queue;

import java.io.ObjectInputStream.GetField;

import stack.StackUsingLinkedList.Node;

public class QueueUsingLinkedList {
	
	 // top node of the linkedlist or can say top of the stack
	static Node first;

	// empty constructor with top null
	QueueUsingLinkedList() {
		this.first= null;
	}

	public static void main(String[] args) {
		
		QueueUsingLinkedList q=new QueueUsingLinkedList();
		
		q.enqueue(1);

		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
		q.enqueue(4);
		q.enqueue(5);
		q.peek();

		q.dequeue();
		q.enqueue(6);
		q.printQueue();
		System.out.println(q.getHead().data);
		q.clear();
		q.printQueue();
	}
	
	
	// created a node class
	class Node {

		// value of the node
		int data;
		// link to the next node
		Node next;
		
		Node( int data)
		{
			this.data=data;
		}
		Node()
		{
			
		}
	}

	public void enqueue(int data) {
		
		if(first==null)
		{
			
			first=new Node(data);
			return;
			
		}
		Node traverse = first;
		while(traverse.next!=null)
		{
			traverse=traverse.next;
		}
		
		Node temp=new Node(data);
		traverse.next=temp;

	}
	
	public void dequeue() {
		
		first=first.next;
		
	}
	
public void peek() {
		
	System.out.println("first elemenet is :"+first.data);
		
	}
	
	
	public Node getHead() {
		
		return first;
		
	}
	
public void clear() {
		System.out.println("queue clear called");
	 first=null;
		
	}
	public void printQueue() {
		
		if(first==null)
		{
			System.out.println("queue is empty");
			return;
		}
		Node traverse = first;
		while(traverse!=null)
		{
			System.out.println(traverse.data);
			traverse=traverse.next;
		}
		

	}
}
