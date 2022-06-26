package game;

import java.util.Random;

public class GameCard {
	public static void main(String... s) {

		Player user = new Player("Deepak", 5, true);
		Player computer = new Player("Computer", 100, true);

		int turn = 1;

		String[] card1 = new String[2];
		card1=getRandom();
		String[] card2=new String[2];
		card2=getRandom();
		Card card1Obj = new Card(card1[0], card1[1]);
		Card card2Obj = new Card(card2[0], card2[1]);
		System.out.println(card1Obj+":"+card2Obj);

		
	}

	public static String[] getRandom() {
//		int rnd = new Random().nextInt(array.length);

		String[] array1=new String[2];
		String cards[] = { "A", "K", "Q", "J" , "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		String card[] = { "H", "D", "C", "S" };
	//	String suit[] = {};
		Random random = new Random();
		System.out.println(cards[random.nextInt(cards.length)] + card[random.nextInt(card.length)]);

		//return array[rnd];
		array1[0]=cards[random.nextInt(cards.length)];
		array1[1]=card[random.nextInt(card.length)];
		return array1;
	}
}
