package assignment3;

public class Card {
private char cardNumber;
private String cardType ;

public char getNumber() {
	return cardNumber;
}

public void setNumber(char number) {
	cardNumber= number;
}
		
public String getCardType() {
	return cardType;
}

public void setCardType(String type) {
	cardType= type;
}

public Card(char cardnum, String cardtyp  ) {
	
	 cardNumber= cardnum;
	 cardType = cardtyp;
	
}

}
