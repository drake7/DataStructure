package cardGame1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




public class CardGameImplementation extends JFrame {
	
	static ArrayList<Card> deck = new ArrayList<Card>();
	static String[] cardNumber = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	static String[] cardType = { "heart", "club", "diamond", "spade" };
	static HashMap<String, Integer> DeckNumberMapping = new HashMap<String, Integer>();
	static int toggleIndex=1;
    // Computer as a player
	static Player computer = new Player("computer", "win");

	// User as a player
	static Player user = new Player("Deepak", "win");
	
	
	
	static JLabel labelWelcome= new JLabel("Let's Play");
	
	static JLabel labelCards = new JLabel("Your cards are:");
	static JLabel labelCard1 = new JLabel("* Nothing  drawn yet **");
	static JLabel labelCard2 = new JLabel("");
	static JLabel labelUserAmount = new JLabel("Your Balance:"+user.getBalance());
	static JLabel labelComputerAmount = new JLabel("CP Balance:"+user.getBalance());
	static JLabel labelInstructions = new JLabel("");
	
	static JButton buttonDraw = new JButton("Draw random cards");
	
	static JTextField inputBet = new JTextField("Place bet here");
	static JLabel labelBet = new JLabel(" No Bet Placed Yet");
	
	static JButton buttonBet = new JButton("Bet");
	static JButton buttonFold = new JButton("Fold");
	
	static JLabel labelCard3Draw = new JLabel("* Nothing drawn *");
	static JLabel labelCard3 = new JLabel("");
	static JLabel labelResult = new JLabel("* No results yet *");
	static JButton buttonNext = new JButton(" Next ");
	static JButton buttonExit = new JButton("Exit  game");
	
	static Card firstCard=null;
	static Card secondCard=null;

	static Card resultCard=null;
	
	public CardGameImplementation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set Sizes
		labelWelcome.setBounds(60, 5, 380, 60);
		
		buttonDraw.setBounds(55, 70, 210, 60);
		
		labelCards.setBounds(60, 120, 200, 60);
		labelCard1.setBounds(60, 145, 200, 60);
		labelCard2.setBounds(60, 160, 200, 60);
		labelUserAmount.setBounds(60, 180, 200, 60);
		labelComputerAmount.setBounds(60, 200, 200, 60);
		labelInstructions.setBounds(60, 200, 200, 60);
		
		
		inputBet.setBounds(55, 240, 210, 40);
		labelBet.setBounds(60, 275, 210, 40);
		buttonBet.setBounds(55, 320, 100, 60);
		buttonFold.setBounds(160, 320, 100, 60);
		
		labelCard3Draw.setBounds(60, 370, 240, 60);
		labelCard3.setBounds(60, 390, 200, 60);
		
		labelResult.setBounds(60, 420, 210, 60);
		labelInstructions.setBounds(60, 440, 300, 60);
		
		buttonNext.setBounds(55, 500, 210, 60);
		buttonExit.setBounds(55, 560, 210, 60);
		
		Font regular = new Font("Courier", Font.PLAIN, 14);
		
		// Add To Frame
		
		Component[] components = {
					labelWelcome,
					labelCards, labelCard1, labelCard2, labelBet, labelCard3Draw, labelCard3, labelResult,
					inputBet,
					buttonDraw, buttonFold, buttonBet, buttonNext, buttonExit,labelUserAmount,labelComputerAmount,labelInstructions
				};
		for (int i = 0; i < components.length; i++) {
			add(components[i]);
			components[i].setFont(regular);
		}
		
		
		// Set Listeners
		buttonDraw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				firstCard=pullCard();
				secondCard=pullCard();
				labelCard1.setText(firstCard.getCardNumber()+" of "+firstCard.getCardType());
				labelCard2.setText(secondCard.getCardNumber()+" of "+secondCard.getCardType());
				
				
				
			}
		});
		
		buttonBet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(firstCard==null || secondCard==null)
				{
					JOptionPane.showMessageDialog(null, "Please draw cards first.");
					return;
				
				}
				if(toggleIndex%2==1)
				{
					labelCards.setText("Your Cards are:");
					
				Double betAmount=0.0;
				try {
					betAmount=Double.parseDouble(inputBet.getText());
					if(betAmount<1 || betAmount>user.getBalance())
					{
					//JOptionPane.showMessageDialog(null, "Please Place bet greater than 1.");
					throw new ArithmeticException();
					
					}
				}
				catch(NumberFormatException ne)
				{
					JOptionPane.showMessageDialog(null, "Please Place Valid Number");
					return;
				}
				catch(ArithmeticException ne)
				{
					JOptionPane.showMessageDialog(null, "Please place bet greater than 1 and less than your balance.");
					return;
				}

				resultCard=pullCard();
				labelBet.setText("Your bet is:"+betAmount);
				labelCard3Draw.setText("Your third card is:"+resultCard.getCardNumber() +":"+resultCard.getCardType());
				
				int resultNumber = DeckNumberMapping.get(resultCard.getCardNumber());
				int firstCardNumber = DeckNumberMapping.get(firstCard.getCardNumber());
				int secondCardNumber = DeckNumberMapping.get(secondCard.getCardNumber());
				boolean Won=false;
				if(firstCardNumber >= secondCardNumber) {
					Won = (secondCardNumber <= resultNumber &&  resultNumber <= firstCardNumber);
				} else {
					// 2nd card is larger
					Won = (firstCardNumber <= resultNumber &&  resultNumber <= secondCardNumber);
				}
				
				
				if(Won)
				{
					labelResult.setText("You Win this round.");
					
					user.setBalance(user.getBalance()+betAmount);
					computer.setBalance(computer.getBalance()-betAmount);
					System.out.println(user.getBalance());
					labelUserAmount.setText("Your Balance:"+user.getBalance());
					labelComputerAmount.setText("CP Balance:"+computer.getBalance());

				}
				else
				{

					labelResult.setText("You Lost this round.");
					
					computer.setBalance(computer.getBalance()+betAmount);
					user.setBalance(user.getBalance()-betAmount);
					System.out.println(user.getBalance());
					labelUserAmount.setText("Your Balance:"+user.getBalance());
					labelComputerAmount.setText("CP Balance:"+computer.getBalance());
				}
				System.out.println(betAmount);
				toggleIndex+=1;
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Computer's turn,Please Press Next");
				}
		}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		buttonFold.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(toggleIndex%2==1)
				{
					checkWinner();
				labelCards.setText("Your Cards are:");
				labelResult.setText("You Skipped this round.");
				user.setBalance(user.getBalance()-0.5);
				computer.setBalance(computer.getBalance()+0.5);
				System.out.println(user.getBalance());
				labelUserAmount.setText("Your Balance:"+user.getBalance());
				labelComputerAmount.setText("CP Balance:"+computer.getBalance());
				toggleIndex+=1;
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Computer's turn,Please Press Next");
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		buttonNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("toggleIndex:"+toggleIndex);
			if(toggleIndex%2==0)
			{
				labelCards.setText("Computer's Cards are:");
				
				checkWinner();
				firstCard=pullCard();
				secondCard=pullCard();
				resultCard=pullCard();
				labelCard1.setText(firstCard.getCardNumber()+" of "+firstCard.getCardType());
				labelCard2.setText(secondCard.getCardNumber()+" of "+secondCard.getCardType());
				
				int resultNumber = DeckNumberMapping.get(resultCard.getCardNumber());
				int firstCardNumber = DeckNumberMapping.get(firstCard.getCardNumber());
				int secondCardNumber = DeckNumberMapping.get(secondCard.getCardNumber());
				
				if(firstCardNumber>=secondCardNumber)
				{   //cp wanna bet
					if(firstCardNumber-secondCardNumber>5)
				
					{
						checkWinner();
						labelBet.setText("Computer bet is:"+1);
						labelCard3Draw.setText("Computer's third card is:"+resultCard.getCardNumber() +":"+resultCard.getCardType());
						boolean Won=false;
						if(firstCardNumber >= secondCardNumber) {
							Won = (secondCardNumber <= resultNumber &&  resultNumber <= firstCardNumber);
						} 
						else 
						{
							// 2nd card is larger
							Won = (firstCardNumber <= resultNumber &&  resultNumber <= secondCardNumber);
						}
						
						
						if(Won)
						{
							labelResult.setText("Computer Win this round.");
							
							user.setBalance(user.getBalance()-1);
							computer.setBalance(computer.getBalance()+1);
							System.out.println(user.getBalance());
							labelUserAmount.setText("Your Balance:"+user.getBalance());
							labelComputerAmount.setText("CP Balance:"+computer.getBalance());
						}
						else
						{

							labelResult.setText("CP Lost this round.");
							
							computer.setBalance(computer.getBalance()-1);
							user.setBalance(user.getBalance()+1);
							System.out.println(user.getBalance());
							labelUserAmount.setText("Your Balance:"+user.getBalance());
							labelComputerAmount.setText("CP Balance:"+computer.getBalance());
						}
						System.out.println();
						toggleIndex+=1;
					}
					//cp folds
					else
					{
						labelResult.setText("CP Folded that round.");
						
						computer.setBalance(computer.getBalance()-1);
						user.setBalance(user.getBalance()+1);
						System.out.println(user.getBalance());
						labelUserAmount.setText("Your Balance:"+user.getBalance());
						labelComputerAmount.setText("CP Balance:"+computer.getBalance());
					}
				}
				if(firstCardNumber<secondCardNumber)
				{
					if(secondCardNumber-firstCardNumber>5)
					
						{
						    checkWinner();
							
						    labelBet.setText("Computer bet is:"+1);
							labelCard3Draw.setText("Computer's third card is:"+resultCard.getCardNumber() +":"+resultCard.getCardType());
							boolean Won=false;
							if(firstCardNumber >= secondCardNumber) {
								Won = (secondCardNumber <= resultNumber &&  resultNumber <= firstCardNumber);
							} 
							else 
							{
								// 2nd card is larger
								Won = (firstCardNumber <= resultNumber &&  resultNumber <= secondCardNumber);
							}
							
							
							if(Won)
							{
								labelResult.setText("Computer Win this round.");
								
								user.setBalance(user.getBalance()-1);
								computer.setBalance(computer.getBalance()+1);
								System.out.println(user.getBalance());
								labelUserAmount.setText("Your Balance:"+user.getBalance());
								labelComputerAmount.setText("CP Balance:"+computer.getBalance());
							}
							else
							{

								labelResult.setText("CP Lost this round.");
								
								computer.setBalance(computer.getBalance()-1);
								user.setBalance(user.getBalance()+1);
								System.out.println(user.getBalance());
								labelUserAmount.setText("Your Balance:"+user.getBalance());
								labelComputerAmount.setText("CP Balance:"+computer.getBalance());
							}
							System.out.println();
							toggleIndex+=1;
						}
						//cp folds
						else
						{
							labelResult.setText("CP Folded this round.");
							
							computer.setBalance(computer.getBalance()-1);
							user.setBalance(user.getBalance()+1);
							System.out.println(user.getBalance());
							labelUserAmount.setText("Your Balance:"+user.getBalance());
							labelComputerAmount.setText("CP Balance:"+computer.getBalance());
							toggleIndex+=1;
						}
				}
			}
			else
			{
				labelInstructions.setText("Please press next after each turn.");
				JOptionPane.showMessageDialog(null, "your turn,Please Place Bet");
				
			}
				
			}
		});
		
		//done
		buttonExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				return;
			}
		});
		
		
		
		
		// Finalize and Show
		
		Font bold = new Font("Courier", Font.BOLD, 12);
		labelWelcome.setFont(bold);
		labelResult.setFont(bold);
		
		//togglePlayer();
		add(new JLabel());
		setSize(350, 700);
	
			  Container c = this.getContentPane();
			  
			  c.setBackground(Color.green);
			 
		setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}

	public static void main(String[] args) {
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
		
		
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {
				deck.add(new Card(cardType[j], cardNumber[i]));
			}
		}
		new CardGameImplementation();
		
	}
	
	public static Card pullCard() {
		int cdChoice1 = (int) (0 + Math.random() * deck.size());
		Card choosen = deck.get(cdChoice1);
		deck.remove(cdChoice1);
		return choosen;
	}
	
	public static void checkWinner() {
		
		if(user.getBalance()>=10)
		{
			JOptionPane.showMessageDialog(null, "your Win!! Congratulation");
			System.exit(0);
		}
		if(computer.getBalance()>=10)
		{

			JOptionPane.showMessageDialog(null, "Computer Win!! ");
			System.exit(0);
	
		}
		
		
	}
	



}
