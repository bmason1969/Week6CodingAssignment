package cardGameWar;

public enum Rank {
	Two("Two", 2),
	Three("Three", 3),
	Four("Four", 4),
	Five("Five", 5),
	Six("Six", 6),
	Seven("Seven", 7),
	Eight("Eight", 8),	
	Nine("Nine", 9),
	Ten("Ten", 10),
	Jack("Jack", 11),
	Queen("Queen", 12),
	King("King", 13),
	Ace("Ace", 14);
	
	String [] Rank = new String [13];
	
	rank[0] = 2;
	rank[1] = 3;
	rank[2] = 4;	
	rank[3] = 5;
	rank[4] = 6;
	rank[5] = 7;
	rank[6] = 8; 
	rank[7] = 9;
	rank[8] = 10;
	rank[9] = 11;
	rank[Jack] = 12;
	rank[Queen] = 13 ;
	rank[Ace] = 14;
	
	private	String rank;
	private int value;
	
	Rank (String rank, int value){
		this.rank = rank;
		this.value = value;
		
	}

	public String getRank() {
		return rank;
		}
	
	public int getvalue() {
		return value;
		}
	
		public String toString() {
		    String[] Rank = {null, "2", "3", "4", "5", "6",
		               "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
			return rank;
	}
		
	}
