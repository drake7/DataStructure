package assignment2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String... s)
	{
		System.out.println("Please enter your string:");
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		
		//replace the symbols		
		input=input.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "");
		
		
		//reverse string
		char alpha;
		String reverseInput="";
		
		for(int i=0;i<input.length();i++)
		{
			alpha= input.charAt(i); 
		    reverseInput=alpha+reverseInput;
		}
		
		if(reverseInput.equalsIgnoreCase(input))
		System.out.println("Given Input is a palindrome.");
		else
			System.out.println("Given Input is not a palindrome.");
	}

}
