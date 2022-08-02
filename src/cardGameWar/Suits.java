package cardGameWar;

public enum Suits {
	


	
	String[] suits = new String[4];
	
	suits[0] = "Clubs";
	suits[1] = "Diamonds";
	suits[2] = "Hearts";
	suits[3] = "Spades";
	
	String[] ranks = {null,"2", "3", "4", "5", "6",
	           "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public String toString() {
	    String[] ranks = {null, "2", "3", "4", "5", "6",
	               "7", "8", "9", "10", "Jack", "Queen", "King"};
	    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	    String s = ranks[this.rank] + " of " + suits[this.suit];
	    return s;
	}
//	Clubs("Clubs", 1),
//	Hearts("Hearts", 2),
//	Spades("Spades", 3 ),
//	Diamonds("Diamonds", 4);
	
//	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
//	private int suitValue;
//	private String suitName;

//	Suits(String suitName, int suitValue) {
		
//	}

//	public int getSuitValue() {
//		return suitValue;
//	}

//	public void setSuitValue(int suitValue) {
		this.suitValue = suitValue;
//	}

//	public String getSuitName() {
		return suitName;
//	}

//	public void setSuitName(String suitName) {
//		this.suitName = suitName;
	}
		
}
