package recursion;

import java.util.Scanner;

public class TakeUserInput {

	public static void main(String[] args) {
		takeInput();
	}
	
	private static void takeInput() {

		System.out.println("Please enter a value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n >=1 && n<=10)
		{
			System.out.println("You Enter a correct value this time.");
			return;
		}
		System.out.println("Invalid");
		takeInput();
		
	}
}
