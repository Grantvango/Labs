import java.util.Scanner;

public class TipCalc
{
	public static void main(String[] args)
	{
	   //Create a Scanner object, reading from the keyboard (System.in)
		Scanner input = new Scanner (System.in);
		
		//prompt user to enter in the amount of the bill
		System.out.println("Enter amount of the bill: ");
		double bill = input.nextDouble();
		
		System.out.println("Enter the Tip: ");
		double tip = input.nextDouble();
		double newTip = tip/100;
		
		//todo: prompt user for amount(percent: 15 for 15%) of the tip
		//      input the value as a double, then divide by 100 (0.15)
		
		//todo: compute total cost: bill and tip
		double total = bill + (bill * newTip);
		
		
		//display the tip and the total
		System.out.println("tip= " + tip + ", total= " + total);
		
	}

}