package arrays;

import java.util.Scanner;

public class StringCompareDemo {
	public static void main(String...s)
	{
		char[] charArray=new char[10];
		charArray[0]='A';
		charArray[1]='B';
		
		Scanner s1=new Scanner(System.in);
		
		String str1="HEllo";
		System.out.println(str1.charAt(0));
		//str1.charAt(0)='H';//immutability
		String str2="HEllo";
		if(str1==str2 )//comparing references
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");	
		}
	
		System.out.println("Please input a word to compare:");
		str2=s1.nextLine();
		
		if(str1==str2 )//comparing references
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");	
		}
	
	
	}

}
