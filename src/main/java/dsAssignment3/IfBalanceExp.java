package dsAssignment3;

import stack.GenericArrayStack;

public class IfBalanceExp {
	public static void main(String[] args) throws Exception {

		String inputString = "{({}{}}";
		System.out.println(checkBalanceExp(inputString));
	}
	
	
	@SuppressWarnings("unchecked")
	public static <T> boolean checkBalanceExp(String inputString) throws Exception{ 
		@SuppressWarnings("rawtypes")
		
		MyStack balanceStack = new MyStack<T>();

		if (inputString.length() <= 0) {
			return true;
		}
		
		boolean checkBalance = true;
		for (int i = 0; i < inputString.length(); i++) {
			
			char c=inputString.charAt(i);
			if(c=='(' || c=='{' || c=='[')
			{
				balanceStack.push(c);
				System.out.println("push:"+c);
				continue;
			}
			
			if(balanceStack.isEmpty())  //if stack is empty return true
				return true;
			
			
			char remainder;             //else popping the element
			switch(c)
			{
			
			  
			case ')':
				remainder = balanceStack.pop().toString().charAt(0);
				System.out.println("first");
				
				if(remainder=='{' || remainder=='[')
					{
					System.out.println("firstcase");
					return false;
					}
				break;
			case '}':
				System.out.println("second");
				
				remainder=balanceStack.pop().toString().charAt(0);
				if(remainder=='(' || remainder=='[')
					{System.out.println("second case");
					return false;}
				break;
			case ']':
				System.out.println("third");
				
				remainder=balanceStack.pop().toString().charAt(0);
				if(remainder=='{' || remainder=='(')
					{
					System.out.println("thirdcase");
					return false;
					}
				break;	
			}
			
		}
		return balanceStack.isEmpty();
	}
	
}
