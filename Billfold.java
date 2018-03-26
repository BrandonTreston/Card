
public class Billfold extends Card{
	public Billfold(Object card1, Object card2) {
		card1 = null;
		card2 = null;
	}
	public Billfold(Card card_one, Card card_two) {  //this constructor takes an object and casts it to Card, morphing it from a general object to a Card object
		card1 = (Card) card_one;
		card2 = (Card) card_two;
	}
	
	public void addCard() {
		if( card1 == null) {
			card1 = new Card();
		}
		else {
			if (card2 == null) {
				card1 = new Card();
			}
		}
	}
	
	public String formatCards(Card card1, Card card2) {
		
		if (card1.getName() == card2.getName()) {
			System.out.println("Card holders are the same person: " + card1.getName());
		}
		if (card1.getName() != card2.getName())
		{System.out.println(card1.getName() + " and " + card2.getName());}
		
		return card1.format() + card2.format();
	}
	
	public int getExpiredCardCount(Card card1, Card card2) {
		boolean year = card1.isExpired(card1.getExpirationYear());
		boolean year2 = card2.isExpired(card2.getExpirationYear());
		int count = 0;
		if (year == true) {
			count++;
		}
		if (year2 == true) {
			count ++;
		}
		return count;
		}

	private Object card1;
	private Object card2;
}
