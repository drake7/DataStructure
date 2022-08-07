package cardGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CardGame extends JFrame{

	static ArrayList<Card> deck = new ArrayList<Card>();
	static String[] cardNumber = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	static String[] cardType = { "heart", "club", "diamond", "spade" };
	
	
	static JLabel lblPlayerActive= new JLabel("Initializing play...");
	static JLabel lblPlayerInactive= new JLabel("");
	
	static JLabel lblCards = new JLabel("Your cards are:");
	static JLabel lblCard1 = new JLabel("-- No cards drawn --");
	static JLabel lblCard2 = new JLabel("");
	
	static JButton btnDraw = new JButton("1. Draw two cards");
	
	static JTextField inputBet = new JTextField("2. Place bet here");
	static JLabel lblBet = new JLabel("-- You have no bet yet --");
	
	static JButton btnBet = new JButton("3.1. Bet");
	static JButton btnFold = new JButton("3.2 Fold");
	
	static JLabel lblCard3Draw = new JLabel("-- No card drawn --");
	static JLabel lblCard3 = new JLabel("");
	static JLabel lblResult = new JLabel("--  No results yet --");
	static JButton btnNext = new JButton("4. Next round");
	static JButton btnExit = new JButton("Exit / finish game");

	
	//frames Code
	
	// CARDS

	
	public static void deckManager() {
		Card[] deck = new Card[52];

		String[] cardNumber = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		String[] cardType = { "heart", "club", "diamond", "spade" };

		int k = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {

				deck[k] = new Card(cardType[j], cardNumber[i]);
				k = k + 1;
			}
		}

		for (int i = 0; i < 52; i++) {
			System.out.println(deck[i].toString());
		}

	}

	public static void main(String[] args) throws IOException {

	    // Computer as a player
		Player computer = new Player("computer", "win");

		// User as a player
		Player user = new Player("Deepak", "win");
		
		JFrame frame = new JFrame("Display an image in the background");
		final ImageIcon icon = new ImageIcon("C:\\Users\\deepa\\Downloads\\casinoBack.jpg");


	    JLabel background = new JLabel("",icon,JLabel.CENTER);
	    frame.setSize(1200,700);
	    frame.setLayout(null);
	    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    background.setBounds(0,0,2400,1200);
	    Container c = frame.getContentPane();

	    JLabel welcome=new JLabel("Welcome To Card Game");
	    

		lblPlayerActive.setBounds(20, 5, 380, 60);
		lblPlayerInactive.setBounds(20, 25, 380, 60);
		
		btnDraw.setBounds(15, 80, 210, 60);
		lblCards.setBounds(20, 130, 200, 60);
		lblCard1.setBounds(20, 155, 200, 60);
		lblCard2.setBounds(20, 170, 200, 60);
		
		inputBet.setBounds(15, 240, 210, 40);
		lblBet.setBounds(20, 275, 210, 40);
		btnBet.setBounds(15, 320, 100, 60);
		btnFold.setBounds(120, 320, 100, 60);
		
		lblCard3Draw.setBounds(20, 370, 200, 60);
		lblCard3.setBounds(20, 390, 200, 60);
		
		lblResult.setBounds(20, 420, 210, 60);
		btnNext.setBounds(15, 500, 210, 60);
		btnExit.setBounds(15, 560, 210, 60);
		
	    welcome.setSize(100,200);
	    welcome.setBounds(500,50,200,100);
	    JLabel playerInfo=new JLabel();
	    JLabel computerInfo=new JLabel();
	    
	    Font regular = new Font("Courier", Font.PLAIN, 12);
		
	    Component[] components = {
				lblPlayerActive, lblPlayerInactive,
				lblCards, lblCard1, lblCard2, lblBet, lblCard3Draw, lblCard3, lblResult,
				inputBet,
				btnDraw, btnFold, btnBet, btnNext, btnExit
			};
	for (int i = 0; i < components.length; i++) {
		frame.add(components[i]);
		components[i].setFont(regular);
		}
	    //Player Information Label
	    playerInfo.setText("Player's Balance is"+user.getBalance());

	    
	    //Computer Information Label
	    computerInfo.setText("Computer's Balance is"+computer.getBalance());
	   
	    
	   frame.setVisible(true);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    System.out.println("game started");
		System.out.println("-----------------------");

		System.out.println("your balance is " + user.getBalance());

		System.out.println("computer balance is " + computer.getBalance());

		HashMap<String, Integer> DeckNumberMapping = new HashMap<String, Integer>();
		DeckNumberMapping.put("A", 1);
		DeckNumberMapping.put("2", 2);
		DeckNumberMapping.put("3", 3);
		DeckNumberMapping.put("4", 4);
		DeckNumberMapping.put("5", 5);
		DeckNumberMapping.put("6", 6);
		DeckNumberMapping.put("7", 7);
		DeckNumberMapping.put("8", 8);
		DeckNumberMapping.put("9", 9);
		DeckNumberMapping.put("10", 10);
		DeckNumberMapping.put("J", 11);
		DeckNumberMapping.put("Q", 12);
		DeckNumberMapping.put("K", 13);
		// Card Deck Created
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {

				deck.add(new Card(cardType[j], cardNumber[i]));
			}
		}

		boolean condition = true;

		// turn decider
		int turnSwitch = 1;

		while (true) {
			// user's turn
			if (turnSwitch % 2 == 1) {
				System.out.println("its your turn , your current balance is " + user.getBalance());

				// draw cards for the user
				Card c1 = pullCard();
				Card c2 = pullCard();

				System.out.println("Your Cards to bet are:");
				System.out.println(c1.getCardNumber() + " of " + c1.getCardType());
				System.out.println(c2.getCardNumber() + " of " + c2.getCardType());

				System.out.println("Please choose option 1 for bet and option 2 for fold.");
				Scanner sc = new Scanner(System.in);
				int choice = sc.nextInt();
				// if he choose to bet
				if (choice == 1) {
					// get a new card to match

					Card resultCard = pullCard();
					System.out.println(resultCard.toString());
					System.out.println(resultCard.getCardNumber());
					int resultNumber = DeckNumberMapping.get(resultCard.getCardNumber());
					int firstCard = DeckNumberMapping.get(c1.getCardNumber());
					int secondCard = DeckNumberMapping.get(c2.getCardNumber());

					// System.out.println(firstCard+":"+secondCard+":"+resultNumber);

					System.out.println("How Much would you like to bet??");
					int betAmount = sc.nextInt();
					boolean loopflag1 = true;
					while (loopflag1) {
						if (betAmount <= 1 || betAmount >= user.getBalance()) {
							System.out.println("Please bet right amount");
							betAmount = sc.nextInt();
						} else
							loopflag1 = false;
					}
					if (firstCard <= secondCard) {
						if (resultNumber > firstCard && resultNumber < secondCard) {

							System.out.println("Won");
						} else {
							System.out.println("lose");
						}
					} else

					{
						if (resultNumber < firstCard && resultNumber < secondCard) {
							System.out.println("won2");
						} else {
							System.out.println("lose2");
						}
					}


					turnSwitch++;
				}
				else 
				{
					//folded
					turnSwitch++;
				}
			}
			// computer's turn
			else {
				System.out.println("Computer's turn");
				turnSwitch++;
			}
		}

		public static Card pullCard() {
			int cdChoice1 = (int) (0 + Math.random() * deck.size());
			Card choosen = deck.get(cdChoice1);
			deck.remove(cdChoice1);
			return choosen;
		
		}
	

	
	btnDraw.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		}
	});
	
	btnBet.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	
	btnFold.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	});
	
	btnNext.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	
	
	btnExit.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			return;
		}
	});
	
}	
	
}
