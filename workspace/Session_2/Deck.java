/**
 * 
 */

/**
 * @author pi
 *
 */
public class Deck {

	private PlayingCard[] deck = new PlayingCard[52];
	private int cardIndex = 0;
	
	public PlayingCard[] getDeck() {
		return this.deck;
	}
	
	public void printDeck() {
		for (PlayingCard card : this.deck) {
			System.out.println(card.rank + " of " + card.suit);
		}
	}
	public static void main(String[] args) {
		// Creates a normal deck of 52 PlayingCard instances
		Deck deck_1 = new Deck();
		System.out.println("Building deck...");
		
		for (String the_suit : PlayingCard.validSuits) {
			for (String the_rank : PlayingCard.validRanks) {
				//System.out.println("Creating " + the_rank + " of " + the_suit);
				deck_1.deck[deck_1.cardIndex++] = new PlayingCard(the_suit, the_rank);
			}
		}

		System.out.println("Printing deck...");
		deck_1.printDeck();
	}

}
