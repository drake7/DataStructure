package cardGame1;


public class Card {
	
	//card number from A to K
	public String CardNumber ;
	



	//suite of the card ie heart spade etc
	public String CardType  ;
	
	

	public String getCardNumber() {
		return CardNumber;
	}



	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}



	public String getCardType() {
		return CardType;
	}



	public void setCardType(String cardType) {
		CardType = cardType;
	}



	public Card(String cardType, String cardNumber) 
	{
		
		CardNumber = cardNumber;
		CardType = cardType;
	}

	@Override
	public String toString() {
		return "Card [CardNumber=" + CardNumber + ", CardType=" + CardType + "]";
	}

}

	

