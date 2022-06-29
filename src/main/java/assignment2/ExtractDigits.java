package assignment2;

import java.util.Scanner;

public class ExtractDigits {

	public static void main(String...s)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number=sc.nextInt();
		
		while(number !=0)
		{
			System.out.print(number%10 +" ");
			number=number/10;
		}
	}
}
