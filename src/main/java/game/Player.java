package game;

public class Player {
	
	private String name;
	private double balance;
	private boolean Winning;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isWinning() {
		return Winning;
	}
	public void setWinning(boolean winning) {
		Winning = winning;
	}
	public Player(String name, double balance, boolean winning) {
		super();
		this.name = name;
		this.balance = balance;
		Winning = winning;
	} 

}
