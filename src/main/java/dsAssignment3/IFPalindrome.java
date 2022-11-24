package dsAssignment3;

public class IFPalindrome {
	
	public static void main(String[] args) {
		
		String input="madam1";
		
		System.out.println(checkPalindrome(input));

	}
	
	public static <T> boolean checkPalindrome(String input)
	{
		int length=input.length();
		MyLinkedDequeue<Character> myList = new MyLinkedDequeue<Character>();
		
		int i,mid=length/2;
		
		for(i=0;i<mid;i++)
		{
			myList.addToFront(input.charAt(i));
		}
		
		
		//if odd number of 
		if(length%2 != 0)
		{
			i++;
		}
		
		while(i<length)
		{
			T c=(T) myList.removeFront();
			
		
			
			 if(c.toString().charAt(0) !=input.charAt(i)) 
				 {
				 return false;
				 }
				 
			 
			i++;
			
		}
		
		return true;
	}
}
