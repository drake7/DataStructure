package stack;

public class GenericStackUsingArray {

	static Node[] genArray = new Node[10];
	static int top = -1;

	// created a node class
	static class Node<T> {

		// value of the node
		T data;

		Node() {
		}

		Node(T data) {
			this.data = data;
		}
		// link to the next node
	}

	public static void main(String[] args) {

		
		push('a');

		push(1);
		push("String");
		push('d');
		push('e');
		push('f');
		pop();
		isEmpty();
		
		
		
		for (int i = 0; i <=top; i++) {
			System.out.println(genArray[i].data);
		}
		
		
		
		
	}

	public static <T> void push(T data) {
		Node n = new Node(data);
		if (top >= genArray.length) {
			System.out.println("Stack is overflowing");
			return;
		}
		genArray[++top] = n;
	}

	public static <T> T pop() {
		Node n = new Node();
		if (top < 0) {
			System.out.println("Stack is empty");
			n.data = -1;
			return (T) n;
		}
		n.data = genArray[top];
		top--;
		return (T) n;
	}

	public static <T> void peek() {
		if (top < 0) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println(genArray[top]);
		return;
	}
	
	public static <T> void isEmpty() {
		if (top < 0) {
			System.out.println("Stack is empty");
			return;
		}
		else {
			System.out.println("Stack has elements in it and top is:"+(top+1));
		}
		return;
	}
}
