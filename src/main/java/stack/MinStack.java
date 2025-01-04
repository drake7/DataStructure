package stack;

import java.util.Stack;


class MinStack {
	
	//create 2 stacks
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	//initialize both stacks
	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		// push in normal stack as it is
		stack.push(val);
		
		// Push the current minimum value onto the minStack.
		//if stack is empty and new value is greater than the top value of the stack
		if (minStack.isEmpty() || val <= minStack.peek()) {
			
			minStack.push(val);
		}
	}

	public void pop() {
		// If the value being popped is the minimum, pop it from the minStack too.
		// if top of stack == minimum value then remove from min stack as well else dont touch
		if (stack.peek().equals(minStack.peek())) {
			minStack.pop();
		}
		
		//stack pop
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