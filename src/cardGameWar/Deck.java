package cardGameWar;

import java.util.*;

public class Deck {
	
	public List<Card> cards = new ArrayList<Card>(); 

	public Deck() {
		
		Card cardOne;
		Card cardTwo;
		Card cardThree;
		Card cardFour;
		for (int i= 0; i < 13; i++) {
								
					
			
		
			
			
			switch (i) {
            case 0:
            	cardOne = new Card("Two of Hearts", 2);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Two of Spades", 2);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Two of Clubs", 2);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Two of Diamonds", 2);
            	cards.add(cardFour);
                     break;
            case 1:
            	cardOne = new Card("Three of Hearts", 3);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Three of Spades", 3);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Three of Clubs", 3);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Three of Diamonds", 3);
            	cards.add(cardFour);
                     break;
            case 2:
            	cardOne = new Card("Four of Hearts", 4);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Four of Spades", 4);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Four of Clubs", 4);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Four of Diamonds", 4);
            	cards.add(cardFour);
                     break;
            case 3:
            	cardOne = new Card("Five of Hearts", 5);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Five of Spades", 5);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Five of Clubs", 5);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Five of Diamonds", 5);
            	cards.add(cardFour);
                     break;
            case 4:
            	cardOne = new Card("Six of Hearts", 6);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Six of Spades", 6);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Six of Clubs", 6);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Six of Diamonds", 6);
            	cards.add(cardFour);
                     break;
            case 5:
            	cardOne = new Card("Seven of Hearts", 7);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Seven of Spades", 7);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Seven of Clubs", 7);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Seven of Diamonds", 7);
            	cards.add(cardFour);
                     break;
            case 6:
            	cardOne = new Card("Eight of Hearts", 8);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Eight of Spades", 8);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Eight of Clubs", 8);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Eight of Diamonds", 8);
            	cards.add(cardFour);
                     break;
            case 7:
            	cardOne = new Card("Nine of Hearts", 9);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Nine of Spades", 9);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Nine of Clubs", 9);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Nine of Diamonds", 9);
            	cards.add(cardFour);
                     break;
            case 8:
            	cardOne = new Card("Ten of Hearts", 10);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Ten of Spades", 10);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Ten of Clubs", 10);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Ten of Diamonds", 10);
            	cards.add(cardFour);
                     break;
            case 9:
            	cardOne = new Card("Jack of Hearts", 11);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Jack of Spades", 11);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Jack of Clubs", 11);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Jack of Diamonds",11);
            	cards.add(cardFour);
                     break;
            case 10:
            	cardOne = new Card("Queen of Hearts", 12);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Queen of Spades", 12);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Queen of Clubs", 12);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Queen of Diamonds", 12);
            	cards.add(cardFour);
                     break;
            case 11:
            	cardOne = new Card("King of Hearts", 13);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("King of Spades", 13);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("King of Clubs", 13);
            	cards.add(cardThree);
            	
            	cardFour = new Card("King of Diamonds", 13);
            	cards.add(cardFour);
                     break;
            case 12:
            	cardOne = new Card("Ace of Hearts", 14);
            	cards.add(cardOne);
            	
            	cardTwo = new Card("Ace of Spades", 14);
            	cards.add(cardTwo);
            	
            	cardThree = new Card("Ace of Clubs", 14);
            	cards.add(cardThree);
            	
            	cardFour = new Card("Ace of Diamonds", 14);
            	cards.add(cardFour);
                     break;
			}
	}
			
	}	
			
	public void shuffle() {
		Collections.shuffle(cards);	
	}
	public Card draw() {
		
			return cards.remove(0);
	}	
	
}
		
	
            