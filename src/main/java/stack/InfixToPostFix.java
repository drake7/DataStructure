package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostFix {

	//find the precendence of the operator
	static int precedence(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }
 
	public static void main(String[] args) {
		System.out.println("");
		   String exp = "a*b*c";
	       
	          // Function call
	        System.out.println(infixToPostfix(exp));
	}
	
	 static String infixToPostfix(String exp)
	    {
	        // initializing empty String for result
	        String result = new String("");
	 
	        // initializing empty stack
	        Deque<Character> stack= new ArrayDeque<Character>();
	 
	        for (int i = 0; i < exp.length(); ++i) {
	           //get first chaaracter
	        	char c = exp.charAt(i);
	 
	            // If the scanned character is an
	            // operand, add it to output.
	            if (Character.isLetterOrDigit(c))
	                result += c;
	 
	            // If the scanned character is an '(',
	            // push it to the stack.
	            else if (c == '(')
	                stack.push(c);
	 
	            //  If the scanned character is an ')',
	            // pop and output from the stack
	            // until an '(' is encountered.
	            else if (c == ')') {
	                while (!stack.isEmpty() && stack.peek() != '(') {
	                    result += stack.peek();
	                    stack.pop();
	                }
	 
	                stack.pop();
	            }
	            else // an operator is encountered
	            {
	            	//check if stack is not empty and if the precedenct of the element and the next element is less than the top of the stack
	                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
	                    result += stack.peek();
	                    stack.pop();
	                }
	                stack.push(c);
	            }
	        }
	 
	        // pop all the operators from the stack
	        while (!stack.isEmpty()) {
	            if (stack.peek() == '(' || stack.peek()==')')
	                return "Invalid Expression";
	            result += stack.peek();
	            stack.pop();
	        }
	       
	        return result;
	    }
}
