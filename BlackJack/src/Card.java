
public class Card {
	public enum Suit{
		HEART, DIAMOND, CLUB, SPADE
	}
	public enum Face{
		ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), JACK(10), QUEEN(10), KING(10);
		private int value;
		private Face(int value){
			this.value = value;
		}
	}
	Suit suit;
	Face face;
	int value;
	
	public Card(Suit suit, Face face){
		this.suit = suit;
		this.face = face;
		this.value = face.value;
	}
	
	public String toString()
    {
        String result = face + " of " + suit;
        
        return result;
    }

}
