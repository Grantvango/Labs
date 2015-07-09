
public class CoinToss {

	static double numHeads = 0;
	static int headsAvg = 0;
	static String spacer = "---------------------------------------------------";

	public static void main(String[] args){

		//Coin 1
		Coin c1 = new Coin();
		c1.setValue(25);
		c1.setBias(60);

		//Coin 2
		Coin c2 = new Coin();
		c2.setValue(5);
		c2.setBias(50);

		//Coin 3
		Coin c3 = new Coin();
		c3.setValue(5);
		c3.setBias(50);

		
		
		/**
		 * 
		 * 
		 * Part 2. Create a Client class which flips coin 100 times displaying first 10 flips and then 
		 * percentage of heads after all 100 flips.
		 * 
		 * 
		 */
		
		/*
		System.out.printf("\n%-20s %-20s %-20s", "Coin 1", "Coin 2", "Coin 3");
		System.out.println("\n");
		*/
		
		for(int x = 0; x < 100; x++){
			c1.flip();
			if(c1.getState() == 1){
				numHeads++;
			}
			if (x <= 10){
				System.out.println(c1.getStringState());
			}
		}
		headsAvg = (int)((numHeads / 100) * 100);
		System.out.println("percent: " + headsAvg + "% HEADS");
		
		System.out.println(spacer);
		
		/**
		 * 
		 * Part 4. player 1 is set to 60 bias. Loop runs till 4 heads in a row then displays winner!
		 * 
		 * 
		 */
		System.out.printf("\n%-10s %12s %12s %12s", "Flip", "Player 1", "Player 2", "Player3");
		
		int player1count = 0;
		int player2count = 0;
		int player3count = 0;
		int flipCount = 1;
		
		while(flipCount > 0){
			c1.flip();
			c2.flip();
			c3.flip();
			
			System.out.printf("\n%-10s %12s %12s %12s", flipCount, c1.getStringState(), c2.getStringState(), c3.getStringState());
			flipCount++;

			if(c1.getState() == 1){
				player1count++;
			}
			if(c2.getState() == 1){
				player2count++;
			}
			if(c3.getState() == 1){
				player3count++;
			}
			
			if (player1count == 4){
				System.out.println("\nPlayer 1 wins!!");
				break;
			}
			if (player2count == 4){
				System.out.println("\nPlayer 2 wins!!");
				break;
			}
			if (player3count == 4){
				System.out.println("\nPlayer 3 wins!!");
				break;
			}
			
		}
	}

}
