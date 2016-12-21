class Card {
	public enum Suit {
		Club, Diamond, Heart, Spade
		}
	private Suit suit; 
	int rank; 
	public Card(Suit s, int r) {
		suit = s;
		rank = r;
	}
	public void printCard() {
		System.out.print(getSuit() + " " + getRank() + " \n");
	}
	public Card.Suit getSuit() {
		return suit;
	}
	public int getRank() {
		return rank;
	}
}