import java.util.Scanner;


public class BurgerJoint {
	
	
	final static double COST_BURGER = 2.75;
	final static double COST_FRIES = 1.25;
	final static double COST_COKES = 0.95;
	final static double SALES_TAX = 0.05;
	public static double subtotal;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many Hamburgers do you want?: ");
		int numHam = input.nextInt();
		System.out.println("How many Fries do you want?: ");
		int numFries = input.nextInt();
		System.out.println("How many Cokes do you want?: ");
		int numCokes = input.nextInt();

		
		//Computes subtotal including 20 percent off if 3 or more of same item are purchased
		subtotal += (numHam >= 3) ? (numHam * COST_BURGER * .80) : (numHam * COST_BURGER);
		subtotal += (numFries >= 3) ? (numFries * COST_FRIES * .80) : (numFries * COST_FRIES);
		subtotal += (numCokes >= 3) ? (numCokes * COST_COKES * .80) : (numCokes * COST_COKES);
		
		//Rounds subtotal to 2 decimal points
		subtotal += .005;
		double remainder = (int)((subtotal * 100) % 100);
		subtotal = (remainder/100) + (int)(subtotal);
		
		//Computes total and then rounds to 2 decimal points
		double total = subtotal + (subtotal * SALES_TAX) + .005;
		remainder = (int)((total * 100) % 100);
		total = (remainder / 100) + (int)(total);
		
		//Prints how many Hamburgers, Fries and Cokes were purchased. 
		switch (numHam)
		{
			case 1: System.out.print("You ordered a hamburger, ");
				break;
			default: System.out.print("You ordered " + numHam + " hamburgers, ");
				break;
		}
		
		switch (numFries)
		{
			case 1: System.out.print(" a fry, ");
				break;
			default: System.out.print(" " + numFries + " fries, ");
				break;
		}
		
		switch (numCokes)
		{
			case 1: System.out.print("and a coke. ");
				break;
			default: System.out.print("and " + numCokes + " cokes. ");
				break;
		}
		
		
		System.out.println("\nYour subtotal is : " + subtotal);
		System.out.println("tax: " + SALES_TAX);
		System.out.println("total: " + total);


		//Enter Payment for the items
		System.out.println("Enter payment: ");
		
		//Computes how much is owed to customer
		double amount = input.nextDouble();
		double amountOwed = amount - total + .005;
		remainder = (int)((amountOwed * 100) % 100);
		amountOwed = (remainder / 100) + (int)(amountOwed);
		
		
		//Prints how much is owed and converts to pennies
		System.out.println("We owe you: " + amountOwed);
		int numPennies = (int)(amountOwed * 100);
		
		//Dollars
		int numDollars = numPennies / 100;
		numPennies = numPennies % 100;

		//Quarters
		int numQuarters = numPennies / 25;
		numPennies = numPennies % 25;

		//Dimes
		int numDimes = numPennies / 10;
		int newPennies = numPennies % 10;

		//Nickels
		int numNickels = newPennies / 5;
		
		//Pennies
		numPennies = numPennies % 5; 

		//Prints Change
		System.out.println("Your Change: ");
		
		if (numDollars > 0)
			System.out.println("Dollars: " + numDollars);
		if (numQuarters > 0)
			System.out.println("Quarters: " + numQuarters);
		if (numDimes > 0)
			System.out.println("Dimes: " + numDimes);
		if (numNickels > 0) 
			System.out.println("Nickels: " + numNickels);
		if (numPennies > 0)
			System.out.println("Pennies: " + numPennies);
	}
}
