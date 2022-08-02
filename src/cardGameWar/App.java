package cardGameWar;



public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player playerOne = new Player("Sam");
		Player playerTwo = new Player("Jack");
		deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				playerOne.draw(deck);
			}
			else
			{
				playerTwo.draw(deck);
			}
				
		}
		
		
		Card cardOne;
		int valueOne;
		
		Card cardTwo;
		int valueTwo;
		for (int i = 0; i< 26; i++) {
			cardOne = playerOne.flip();
			cardTwo = playerTwo.flip();
			valueOne = cardOne.getValue();
			valueTwo = cardTwo.getValue();
			if(valueOne > valueTwo) {
				playerOne.incrementScore();
			}
		    else {
			    playerTwo.incrementScore();
		    }
	    }
		
		if(playerOne.getScore()> playerTwo.getScore()) {
			System.out.println("Winner: " + playerOne.getName());
			System.out.println("Player One Score: " + playerOne.getScore());
			System.out.println("Player Two Score: " + playerTwo.getScore());
			
		}
		else if(playerOne.getScore()< playerTwo.getScore()) {
			System.out.println("Winner: " + playerTwo.getName());
			System.out.println("Player One Score: " + playerOne.getScore());
			System.out.println("Player Two Score: " + playerTwo.getScore());
		}
		else
		{
			System.out.println("Draw");
			System.out.println("Player One Score: " + playerOne.getScore());
			System.out.println("Player Two Score: " + playerTwo.getScore());
		}
			

}
}
