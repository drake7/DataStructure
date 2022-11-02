package stack;


public class CheckBalance {

	public static void main(String[] args) throws Exception {

		String input = "({{(())}{}})";
		System.out.println(checkBalance(input));
	}

	public static <T> boolean checkBalance(String input) throws Exception {
		GenericArrayStack getBalance = new GenericArrayStack(10);

		if (input.length() <= 0) {
			return true;
		}
		boolean balanced = true;
		for (int i = 0; i < input.length(); i++) {
			char c=input.charAt(i);
			//check opening brackets and keep adding them in the stack
			if(c=='(' || c=='{' || c=='[')
			{
				getBalance.push(c);
				continue;
			}
			//if stack is empty return true
			if(getBalance.isStackEmpty())
				return true;
			//else pop the top element to compare if it is closing with the correct bracket
			char check;
			switch(c)
			{
			//if next charcter in string is  
			case ')':
				check =(char) getBalance.pop();
				if(check=='{' || check=='[')
					{return false;}
				break;
			case '}':
				check=(char) getBalance.pop();
				if(check=='(' || check=='[')
					{return false;}
				break;
			case ']':
				check=(char) getBalance.pop();
				if(check=='{' || check=='(')
					{return false;}
				break;	
			}
			
		}
		return getBalance.isStackEmpty();
	}
}
