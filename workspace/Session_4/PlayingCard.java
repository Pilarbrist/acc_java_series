/**
 * Homework 3 PlayingCard using enums
 */

/**
 * @author pi
 *
 */
public class PlayingCard {
    
	public ValidSuits suit = null;  // this card rank
	public ValidRanks rank = null;  // this card suit
	
	public enum ValidRanks {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
		                    NINE, TEN, JACK, QUEEN, KING, ACE}
	public enum ValidSuits {HEARTS, DIAMONDS, CLUBS, SPADES}
	

	public PlayingCard() {
		System.out.println("Must assign suit and rank to create PlayingCard");
		System.out.println(" should throw InvalidPlayingCard Exception ");
	}

	public PlayingCard(PlayingCard.ValidSuits suit_value, PlayingCard.ValidRanks rank_value) {
		this.suit = suit_value;
		this.rank = rank_value;
	}
	
}
