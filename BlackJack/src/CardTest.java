
public class CardTest {
	CardTest(){	
	}
	public static void main(String args[]){
		Card testcard = new Card(Card.Suit.DIAMOND, Card.Face.KING);
		System.out.println(testcard.toString());
	}
}
