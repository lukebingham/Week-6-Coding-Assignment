import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
//	List<Card> cards = new ArrayList<>();
	List<Card> cards;

	
	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card draw() {
		Card card = new Card();
		card = cards.get(0);
		cards.remove(0);
//		System.out.println(card.getValue() + " " + card.getName());

		return card;
	}
	
	Deck() {
		
		cards = new ArrayList<Card>();

		for (int i = 2; i < 15; i++) {
		
		Card card1 = new Card();
		card1.setValue(i);
		card1.setName("Heart");
		cards.add(card1);
		
		Card card2 = new Card();
		card2.setValue(i);
		card2.setName("Club");
		cards.add(card2);

		Card card3 = new Card();
		card3.setValue(i);
		card3.setName("Diamond");
		cards.add(card3);
		
		Card card4 = new Card();		
		card4.setValue(i);
		card4.setName("Spade");
		cards.add(card4);
		
		}
	}
	
	public void printDeck() {
		System.out.println("Print Deck");
		System.out.println(cards.size());
		for (int i = 0; i < cards.size(); i++) {
		   System.out.println(cards.get(i).getValue() + " " + cards.get(i).getName());
		}
	}
}
