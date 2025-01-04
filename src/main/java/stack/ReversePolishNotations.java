package stack;

import java.util.Stack;

class ReversePolishNotations {
    public static int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();

        //first it is going to put variables in then it will calculate by popping the variables
        for (String token : tokens) {
            if (isOperator(token)) {
            	// if first operator is token
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                stack.push(String.valueOf(applyOperator(a, b, token)));
            } else {
            	//else stack.push
            	System.out.println("Pushing token in :"+token);
                stack.push(token);
            }
        }

        return Integer.valueOf(stack.pop());

    
    
    }
    
    private static int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b; // Integer division
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    
    
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    public static void main(String[] args) {
		
    	String[] tokens = {"1","2","+","3","*","4","-"};
    	String[] tokens2 = {"1","2","+","3","*","4","+","5","-"};
    	
    	
    	System.out.println(evalRPN(tokens2));
    	
	}
}
