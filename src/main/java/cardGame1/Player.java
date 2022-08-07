package cardGame1;


public class Player {
	
	
	public String playerName;
	
	private double Balance;

	public String Status;

	

	public Player(String playerName,  String status) {
		
		playerName = playerName;
		Balance = 5;
		Status = status;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
	

}
