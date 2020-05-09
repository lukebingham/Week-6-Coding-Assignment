import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<>();
	
	String name;
	
	int score;
	
	Player() {
		
		score = 0;
			
	}

	public void describe() {
		
		System.out.println(name + score);
		
		for (Card hand : hand) {
			System.out.println(hand.getValue() + hand.getName());
			
		}
	}
	
	public Card flip() {
		Card card = new Card();
		card = hand.get(0);
		hand.remove(0);
		return card;
			
	}
	
	public void draw(Deck deck) {
		Card card;
		card = deck.draw();
//		System.out.println(card.getValue() + " " + card.getName());
		hand.add(card);
		
	}
	
	public void incrementScore() {
		score++;
		
	}
	
	public int getScore() {
		return score;
	}
}
