package stack;

public class StackUsingArray {

	static int[] stack = new int[10];

	static int top = -1;

	public static void main(String[] args) {
		push(10);
		push(12);
		push(15);
		push(11);
		push(1032);

		push(102);
		push(102);
		printStack(stack);

		pop(stack);
		pop(stack);

		pop(stack);
		pop(stack);

		printStack(stack);
		peek(stack);
		
		isEmpty(stack);
	}

	// pushing the element into stack
	public static void push(int value) {

		if (stack.length == 0) {
			System.out.println("Stack size is small for any element");
			return;
		}
		if (top == stack.length) {
			System.out.println("Overflow in stack for pushed value:" + value);
			return;
		}
		
		top = top + 1;
		stack[top] = value;
	}

	// popping the element out of stack
	public static void pop(int[] stack) {
		if (top == -1) {
			System.out.println("Stack is already empty");
			return;
		}

		System.out.println(stack[top]);
		top = top - 1;
		return;

	}

	private static void peek(int[] stack) {

		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Top element of stack is :" + stack[top]);

	}

	public static void printStack(int[] stackArr) {
		for (int i = 0; i <=top; i++) {
			System.out.println("index-" + i + ":" + stack[i]);

		}
	}
	private static void isEmpty(int[] stack) {
		if(stack.length==0)
			System.out.println("Stack is empty:");
		else {
			System.out.println("Stack has a size of:"+(stack.length));
		}
	}
	
	private static void isFull(int[] stack) {
		if(stack.length==top)
			System.out.println("Stack is full:");
		else {
			System.out.println("Stack is filled till this index:"+top+" and has a size of "+(stack.length));
		}
	}
	
	
	private static void Delete(int[] stack)
	{
		
		stack=null;
	}
}
