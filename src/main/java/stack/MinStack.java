package stack;

import java.util.Stack;

class MinStack {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
		// Push the current minimum value onto the minStack.
		if (minStack.isEmpty() || val <= minStack.peek()) {
			minStack.push(val);
		}
	}

	public void pop() {
		// If the value being popped is the minimum, pop it from the minStack too.
		if (stack.peek().equals(minStack.peek())) {
			minStack.pop();
		}
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}  

	public static void main(String[] args) {
		MinStack minStack = new MinStack();

		// Test cases
		System.out.println("Pushing values: 5, 3, 7, 2, 4");
		minStack.push(5);
		System.out.println("getMin(): " + minStack.getMin()); // Output: 5
		minStack.push(3);
		System.out.println("getMin(): " + minStack.getMin()); // Output: 3
		minStack.push(7);
		System.out.println("getMin(): " + minStack.getMin()); // Output: 3
		minStack.push(2);
		System.out.println("getMin(): " + minStack.getMin()); // Output: 2
		minStack.push(4);
		System.out.println("getMin(): " + minStack.getMin()); // Output: 2

		System.out.println("\nPopping values:");
		minStack.pop();
		System.out.println("Top after pop: " + minStack.top()); // Output: 2
		System.out.println("getMin(): " + minStack.getMin()); // Output: 2

		minStack.pop();
		System.out.println("Top after pop: " + minStack.top()); // Output: 7
		System.out.println("getMin(): " + minStack.getMin()); // Output: 3

		minStack.pop();
		System.out.println("Top after pop: " + minStack.top()); // Output: 3
		System.out.println("getMin(): " + minStack.getMin()); // Output: 3

		minStack.pop();
		System.out.println("Top after pop: " + minStack.top()); // Output: 5
		System.out.println("getMin(): " + minStack.getMin()); // Output: 5

		minStack.pop();
		System.out.println("Stack is now empty.");
	}
}