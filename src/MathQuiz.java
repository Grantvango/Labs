 import java.util.Scanner;

public class MathQuiz 
{
	public static void main(String args[])
	{
		//You can switch from for statement to while by removing the //
		for(int i=0; i<2; i++)
		//int i = 0;
		//while (i < 2)
		{
			int range = 100;
			int shift = 10;
			
			double num1 = (int)(Math.random()*range + shift);
			double num2 = (int)(Math.random()*range + shift);
			double sum = num1 + num2;
		
			System.out.println("What is " + (int)num1 + " + " + (int)num2 + " =");
			long startTime = System.currentTimeMillis();
		
			//takes input from user
			Scanner input = new Scanner (System.in);
			double guess = input.nextDouble();
		
			//ends the time and saves it
			long endTime = System.currentTimeMillis();
			int deltaTime = (int)(((endTime - startTime) + 500) / 1000);
		
			System.out.print("The correct anwser is: " + (int)(sum) + " and ");
			System.out.print("you guessed " + (int)guess + ". ");
		
			if (guess == sum)
			{
				System.out.print("You were Correct! ");
			} else {
				System.out.print("Sorry, you were incorrect. ");
			}
			System.out.println("It took you " + deltaTime + " seconds.");
			//i++;
		}
	}	
}
