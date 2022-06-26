package dice;

public class Dice {

	private static final int MAX=6;
	private static final int MIN=1;
	private int diceValue=1;
	public Dice() {
		this.diceValue=RandomDice();
	}
	
	
	public static int RandomDice()
	{
		return ((int)(Math.random()*100)%MAX+MIN);
	}
	
	
	
	
	
}
