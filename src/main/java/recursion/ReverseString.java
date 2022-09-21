package recursion;

public class ReverseString {

	public static void main(String[] args) {
	
		String inputStr="HelloPatri";
		reverseStringValue(inputStr,5);
		
	}
	
	
	private static void reverseStringValue(String input,int reverseCount) {

		if(input.length()<reverseCount)
		{
			System.out.print("Invalid reverse count");
			return;
		}
		if(reverseCount<1)
		{
			return;
		}
		reverseStringValue(input, reverseCount-1);
		System.out.print(input.charAt(input.length()-reverseCount));
		
	}
}
