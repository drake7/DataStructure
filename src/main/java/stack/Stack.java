package stack;

import stack.Node;

public class Stack {
	// 
	public static void main(String[] args) {
		Stack s = new Stack();
		s.addToTop(1);
		s.addToTop(2);
		s.addToTop(6);
		s.display();
		s.removeFromTop();
		s.display();
		
		System.out.println(s.getLength());
		
	}
	
	public Node top = null;
	
	public <T> T top(){
		if(top==null) return null;
		return (T) top.data;
	}
	
	public <T> void addToTop(T val) {
		Node n = new Node(val);
		if(top == null) {
			top = n;
		} else {
			n.next = top;
			top = n;
		}
	}
	
	public void removeFromTop() {
//		if(top==null) {
//			System.out.println("stack is empty");
//			return;
//		}
//		System.out.println("remove " + top.data);
		if(top.next != null) {
			top = top.next;	
		}else {
			top = null;
		}
		
	}
	
	public int getLength(){
//		if(top == null ) return 0;
		Node k = top;
		int i = 0;
		while(k != null) {
//			System.out.println(k.data);
			i++;
			k = k.next;
		}
		return i;
		
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	
	public void display() {
		Node k = top;
		while(k != null) {
			System.out.print(k.data);
			k = k.next;
		}
	}

}
