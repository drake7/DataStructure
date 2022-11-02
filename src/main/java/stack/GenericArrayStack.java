package stack;

public class GenericArrayStack<T extends Object> {
	private int stackSize;
	private T[] stackArray;
	private int top;

	public GenericArrayStack(int size) {
		this.stackSize = size;
		this.stackArray = (T[]) new Object[stackSize];
		this.top = -1;
	}
	public void push(T gs) throws Exception {
		if (this.isStackFull()) {
			System.out.println("Stack Overflow");
			this.increaseStackCapacity();
		}
		this.stackArray[++top] = gs;
	}
	public T pop() throws Exception {
		if (this.isStackEmpty()) {
			System.out.println("Stack underflow.");
		}
		T entry = this.stackArray[top--];
		return entry;
	}
	public T peek() {
		return stackArray[top];
	}
	public boolean isStackEmpty() {
		return (top == -1);
	}
	public boolean isStackFull() {
		return (top == stackSize - 1);
	}
	private void increaseStackCapacity() {
		T[] newStack = (T[]) new Object[this.stackSize * 2];
		for (int i = 0; i < stackSize; i++) {
			newStack[i] = this.stackArray[i];
		}
		this.stackArray = newStack;
		this.stackSize = this.stackSize * 2;
	}
	public void print() {
		for (int i = 0; i < stackArray.length; i++) {
			System.out.print(stackArray[i]);
		}
	}
	public static void main(String args[]) {
		try {
		GenericArrayStack<String> stringStack = new GenericArrayStack<String>(2);
		} catch (Exception e) {
			e.printStackTrace();
		}}}
