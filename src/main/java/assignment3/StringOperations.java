package assignment3;

public class StringOperations {
	
	public static void main(String...args)
	{
		String input="Deepak Kumar";
		
		
		System.out.println(input.length());
		
		
		System.out.println(input.charAt(3)); 
		
		
		
		
		System.out.println(input.substring(3)); 
		 
		System.out.println(input.substring(2, 5)); 
	
		
		String firstName = "Deepak";
		 String LastName = " Kumar";
		 String output = firstName.concat(LastName); // returns "Deepak Kumar"
		 String s = "Learn Share Learn";
		 int output1 = s.indexOf("Share"); // returns 6
		System.out.println(output1);
		 
		 int output2 = s.indexOf("ea",3);// returns 13
		System.out.println(output2);
		 
		int output3 = s.lastIndexOf("a"); // returns 14
		System.out.println(output3);
		
		String word1 = " Learn Share Learn ";
		String word2 = word1.trim(); // returns "Learn Share Learn"
		System.out.println(word2);
	}

}
