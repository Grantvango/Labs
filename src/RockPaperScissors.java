import java.util.Scanner;


public class RockPaperScissors {

	final static int ROCK = 0;
	final static int PAPER = 1;
	final static int SCISSOR = 2;
	final static int NUM_OF_GAMES = 100;

	public static void main(String args[])
	{
		int count = 0;
		int compWins = 0;
		int userWins = 0;

		while (count < NUM_OF_GAMES)
		{
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Rock (0), Paper (1), Scissor (2). ");
			int userChoice = input.nextInt();
			
			if (userChoice >= 3)
			{
				System.out.println("Guess a number between 0-2!");
			} else {
			
				switch (userChoice) 
				{
					case ROCK: System.out.print("You picked rock, and ");
						break;
					case PAPER: System.out.print("You picked paper, and ");
						break;
					case SCISSOR: System.out.print("You picked scissor, and ");
						break;
				}
			
				int compChoice = (int)(Math.random()*2+1);
				switch (compChoice)
				{
					case ROCK: System.out.print("the computer picked rock. ");
						break;
					case PAPER: System.out.print("the computer picked paper. ");
						break;
					case SCISSOR: System.out.print("the computer picked scissor. ");
						break;
				}

				if (userChoice == compChoice)
				{
					System.out.println("It was a Draw!");
				} 
				if ((userChoice == PAPER && compChoice == ROCK) || (userChoice == SCISSOR && compChoice == PAPER) || (userChoice == ROCK && compChoice == SCISSOR))
				{
					System.out.println("You Won!");
					userWins++; 
				} else if ((userChoice == PAPER && compChoice == SCISSOR) || (userChoice == ROCK && compChoice == PAPER) || (userChoice == SCISSOR && compChoice == ROCK))
				{
					System.out.println("You Lost!");
					compWins++;
				}
				if ( userWins == 2)
				{
					System.out.println("Game Over");
					System.out.println("You won best 2 out of 3! ");
					break;
				} else if (compWins == 2)
				{
					System.out.println("Game Over");
					System.out.println("Sorry, the computer won best 2 out of 3! ");
					break;
				}
			}
			System.out.println("Score(wins): user= " + userWins + ", computer= " + compWins + ". ");
			count++; 
		}
	}
}
