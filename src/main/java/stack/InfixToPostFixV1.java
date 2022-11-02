package stack;


public class InfixToPostFixV1 {

	public static void main(String[] args) throws Exception {

		String input = "a*b/(c-d)";


		System.out.println("infix:"+input);
		System.out.println("postfix:"+infixToPostFix(input));
	}

	public static int precedence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '/':
		case '*':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	public static String infixToPostFix(String input) throws Exception {
		String result = "";

		GenericArrayStack<Character> gs = new GenericArrayStack<Character>(7);

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			// if character is operand then
			if (Character.isLetterOrDigit(ch)) {
				result += ch;
			}
			// else if check for brackets
			else if (ch == '(') {
				// push brackets inside stack
				gs.push(ch);
			}

			//close the brackets and check till we dont get top element as ( so we can solve all the element inside bracket first
			else if (ch == ')') {
				while (!gs.isStackEmpty() && (gs.peek() != '(' || gs.peek()!=null)) {
					// check the top element and add into result
					result += gs.peek();
					gs.pop();
				}
			} else {
				while (!gs.isStackEmpty() && (precedence(ch) <= precedence(gs.peek()))) {
					result += gs.peek();
					gs.pop();
				}
				gs.push(ch);
			}

		}
		while (!gs.isStackEmpty()) {
			if ((char) gs.peek() == '(') {
				return "Invalid Expression";
			}
			result += gs.peek();
			gs.pop();
		}
		result.replace(")", "");
		return result.replace("(", "");
	}
}
