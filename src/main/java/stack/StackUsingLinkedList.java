package stack;

public class StackUsingLinkedList {

	 // top node of the linkedlist or can say top of the stack
	static Node top;

	// empty constructor with top null
	StackUsingLinkedList() {
		this.top = null;
	}

	public static void main(String[] args) {

		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(5);
		stack.push(15);
		stack.push(52);
		stack.push(53);
		stack.push(521);
		stack.push(502);
		
		
		stack.peek();
		
		stack.pop();
		stack.pop();
		
		stack.print(top);
		
	}

	// created a node class
	public class Node {

		// value of the node
		int data;
		// link to the next node
		Node next;

	}

	private void push(int data) {
		// creating a new node for the data
		Node temp = new Node();
		// setting the data for a new node
		temp.data = data;
		// set the next element of temp to top as the new element will be taking place
		// on top
		temp.next = top;
		// seting the new node on top as every new entry should come on top(Stack)
		top = temp;

	}

	// removing the element from the begining.
	private void pop() {
		// if top is null then no element to pop
		if (top == null) {
			System.out.print("Stack is empty and no element is present to remove.");
			return;
		}

		// update the top pointer to point to the next node
		top = (top).next;
	}

	// if the top of the stack is empty it is empty
	private void isEmpty() {
		if (top == null) {
			System.out.println("Stack is Empty");
			return;
		}
	}

	private void peek() {
		// if stack is empty
		if (top == null) {
			System.out.println("Stack is Empty");
			return;
		}

		System.out.println(top.data);
	}

	private void delete() {
		// deleting the reference in the top
		top = null;

	}
	private void print(Node top) {
		// deleting the reference in the top 
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
