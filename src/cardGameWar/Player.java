package cardGameWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private int score;
	public List<Card> hand = new ArrayList<Card>(); 
	
	
	public Player(String name) {
		this.setName(name);
		score = 0;
                                                                                                                       ;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public void describe() {
		System.out.println(name);
		for(Card card : hand)
		{
			card.describe();
		}
		
	}

	public int getScore() {
		return score;
	}

	public void incrementScore() {
		this.score++;
	}
}