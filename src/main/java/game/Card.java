package game;

public class Card {

	private String[] cardType = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10",
                                   "9", "8", "7", "6", "5", "4", "3", "2"};	
    
    private String type, value;
    
    
    public Card(String types, String values)
    {
         this.type = types; 
        this.value = values;
        //this.value = value;
    }

    public String toString()
    {
        String finalCard = value + " of " + type;

        return finalCard;
    }
    
    
}
