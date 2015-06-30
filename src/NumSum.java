import java.util.Scanner;

public class NumSum 
{
	public static void main(String args[])
	{
		//Generates a random number from 0-999
		double num = (int)(Math.random()*999 + 1);
		int orginalNum = (int)num;
				
		//Divides num by 10 and stores remainder as x then 
		//repeats that 3 times.
		
		double firstNum = num % 10;
		num = (int)(num / 10);
		double secondNum =  num % 10;
		num = (int)(num / 10);
		
		int sum = (int)(firstNum + secondNum + num);
		//Prints out the number and sum of all numbers
		System.out.println("Your random number was: " + orginalNum);
		System.out.print("The sum of the random number's digits are : ");
		System.out.print(sum);
	
	}

}
