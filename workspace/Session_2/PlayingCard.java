/**
 * 
 */

/**
 * @author pi
 *
 */
public class PlayingCard {
    
	public String suit = null;  // this card rank
	public String rank = null;  // this card suit
	public final static String[] validRanks = {"2", "3", "4", "5", "6", "7", "8", "9", 
		                                 "10", "Jack", "Queen", "King", "Ace"};
	public final static String[] validSuits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	

	public PlayingCard() {
		System.out.println("Must assign suit and rank to create PlayingCard");
		System.out.println(" should throw InvalidPlayingCard Exception ");
	}

	public PlayingCard(String suit_value, String rank_value) {
		if (is_valid_suit(suit_value)) {
			this.suit = suit_value;
		}
		if (is_valid_rank(rank_value)) {
			this.rank = rank_value;
		}
		if (this.suit == null || this.rank == null) {
			// throw InvalidPlayingCard Exception
    		System.out.println(" Invalid card: should throw InvalidPlayingCard Exception ");
		}
	}
	
	private boolean is_valid_suit(String suit_value) {
		// validate suit
		for (String suit : validSuits) {
			if (suit_value == suit) {
				return true;
			}
		}
		return false;
	}

	private boolean is_valid_rank(String rank_value) {
		// validate rank
		for (String rank : validRanks) {
			if (rank_value == rank) {
				return true;
			}
		}
		return false;
	}
}
