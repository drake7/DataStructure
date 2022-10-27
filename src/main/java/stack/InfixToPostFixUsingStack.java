package stack;

public class InfixToPostFixUsingStack {

	public static int precedence(char ch)
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
	
	static String infixToPostFix(String input)
	{
		String result="";
		
		
		
		return "";
	}
	
	
	
	public static void main(String[] args) {
		
		String input="a*b*c";
		
		
		
		
	}
}
