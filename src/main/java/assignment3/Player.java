package assignment3;

public class Player {
  private String playerName;
  private double playerBalance;
  private String playerstatus;
  
  public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String name) {
		playerName= name;
	}
	
	  public double getPlayerBalance() {
			return playerBalance;
		}

		public void setPlayerBalance(double balance) {
			playerBalance= balance;
		}
		
		 public String getplayerstatus() {
				return playerstatus;
			}

			public void setplayerstatus(String status) {
				playerstatus= status;
			}
			
			
  public Player(String name , String status  ){
	  playerName= name;
	  playerBalance =  5.0;
	  playerstatus=  status;
  }
}
