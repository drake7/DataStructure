package stack;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
		System.out.println(	checkValidParentheses("(()[])"));
	}

	private static boolean checkValidParentheses(String s) {
		// TODO Auto-generated method stub

		Stack<Character> stack =  new Stack<>();
		
		for(char c:s.toCharArray())
		{
			if(c == '(' || c == '[' || c == '{')
				stack.push(c);
			
			 // If closing bracket, check for matching opening bracket
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
            // If none of the above, it's an invalid case
            else {
                return false;
            }
        }
        
        // If the stack is empty, all parentheses are matched
        return stack.isEmpty();
	}
	

}
