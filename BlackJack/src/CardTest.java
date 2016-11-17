
public class CardTest {
	public static void main(String args[]){
		int count = 0;
		for(Card.Suit suit: Card.Suit.values()){
			for(Card.Face face: Card.Face.values()){
				Card testcard = new Card(suit, face);
				System.out.println(testcard.toString());
				count++;
			}
		}
		System.out.println(count);
	}
}