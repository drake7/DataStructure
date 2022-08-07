package assignment3;

import java.util.Scanner;
public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = 0;
		Card [] cardArray = new Card[52];
		for ( int i  =0 ; i< cardArray.length; i++)
		{
			
			String Type = "heart"; 
			
			cardArray[i] =  new Card('1',Type); 
		}
		
		
		
		Player human = new Player("human","win" ); 
		Player computer =  new Player("computer", "win");
		
		System.out.println("Game Started Welcome");
		System.out.println("--------------------------------------------------");
		double Hbal = human.getPlayerBalance();
		double CBal  = computer.getPlayerBalance();

		while((human.getPlayerBalance() > 1.0) && (computer.getPlayerBalance()>1.0)) 
		{
			System.out.println("Your Balance is : "+ Hbal);
			System.out.println("Computer balance is"+ CBal);
			
			
			System.out.println("Its your turn, Your current balance is"+human.getPlayerBalance() );
			System.out.println("Your cards are");
			
		
		}
		
		
		
	}

	
	
	
}
