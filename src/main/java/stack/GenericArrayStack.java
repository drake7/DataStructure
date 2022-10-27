package stack;

public class GenericArrayStack<T extends Object>{
	 private int stackSize;
	    private T[] stackArray;
	    private int top;
	 
	    /**
	     * constructor to create stack with size
	     * @param size
	     */
	    public GenericArrayStack(int size) {
	        this.stackSize = size;
	        this.stackArray = (T[]) new Object[stackSize];
	        this.top = -1;
	    }
	 
	    /**
	     * Adds new entry to the top of the stack
	     * @param entry
	     * @throws Exception 
	     */
	    public void push(T entry) throws Exception {
	        if(this.isStackFull()){
	        	System.out.println("Stack Overflow");
	            this.increaseStackCapacity();
	        }
	        System.out.println("Adding: "+entry);
	        this.stackArray[++top] = entry;
	    }
	 
	    /**
	     * Removes an entry from the top of the stack.
	     * @return
	     * @throws Exception 
	     */
	    public T pop() throws Exception {
	        if(this.isStackEmpty()){
	        	System.out.println("Stack underflow.");
	        }
	        T entry = this.stackArray[top--];
	        System.out.println("Removed entry: "+entry);
	        return entry;
	    }
	 
	    /**
	     * Returns top of the stack without removing it.
	     * @return
	     */
	    public T peek() {
	        return stackArray[top];
	    }
	 
	    /**
	     * Returns true if the stack is empty
	     * @return
	     */
	    public boolean isStackEmpty() {
	        return (top == -1);
	    }
	 
	    /**
	     * Returns true if the stack is full
	     * @return
	     */
	    public boolean isStackFull() {
	        return (top == stackSize - 1);
	    }
	 
	    /**
	     * Increase stack capacity
	     */
	    private void increaseStackCapacity(){	         
	    	T[] newStack = (T[]) new Object[this.stackSize*2];
	        for(int i=0;i<stackSize;i++){
	            newStack[i] = this.stackArray[i];
	        }
	        this.stackArray = newStack;
	        this.stackSize = this.stackSize*2;
	    }
	 
		public static void main(String args[]){
			try {
				GenericArrayStack<String> stringStack = new GenericArrayStack<String>(2);
				stringStack.push("w3spoint");
				GenericArrayStack<Integer> integerStack = new GenericArrayStack<Integer>(2);
				integerStack.push(13);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
