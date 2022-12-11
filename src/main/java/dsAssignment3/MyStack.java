package dsAssignment3;

public class MyStack<T> {
	

	MyLinkedDequeue<T> myList = new MyLinkedDequeue<T>();
		
	public static <T> void main(String[] args) {
	
		MyStack stack=new MyStack<T>(); 
	
		stack.push(3);
		stack.push(31);
		stack.push(323);
		stack.push(643);
		stack.push(33211);
		
		stack.print();
		
		stack.pop();
		
		stack.print();
		
		
		stack.clear();
		
		stack.print();
	}
	
	public void push(T newEntry)
	{
		myList.addToFront(newEntry);
	}
	
	
	public T pop()
	{
		return myList.removeFront();
	}
	
	public T peek()
	{
		return myList.getFront();
	}
	
	public boolean isEmpty()
	{
		return myList.isEmpty();
	}
	
	public void clear()
	{
		myList.clear();
	}
	
	public void print()
	{
		myList.print();
	}
	
	
}
