
public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player playerOne = new Player();
		Player playerTwo = new Player();
		
		deck.shuffle();
		
//		deck.printDeck();
		
		for (int i = 0; i < 26; i++) {
			playerOne.draw(deck);
			playerTwo.draw(deck);
		
		}
		
		for (int i = 0; i < 26; i++) {
			Card playerOneCard = playerOne.flip();
			Card playerTwoCard = playerTwo.flip();
			if (playerOneCard.getValue() > playerTwoCard.getValue()) {
				playerOne.incrementScore();
			}
			else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
				playerTwo.incrementScore();
			}
		}
			
		if (playerTwo.getScore() > playerOne.getScore()) {
			System.out.println("PLAYER TWO WINS!");
		}
		else if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("PLAYER ONE WINS!");
		}
		else System.out.println("DRAW!");	
		
		System.out.println("Player One Score: " + playerOne.getScore());
		
		System.out.println("Player Two Score: " + playerTwo.getScore());
		
	
	}
	

}
