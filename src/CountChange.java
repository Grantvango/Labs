   import java.util.Scanner;

   /*
    * Convert a dollar amount to a number of quarters, dimes, 
    *      nickels, and pennies.
    */
    public class CountChange
   {
       public static void main(String[] args)
      {
      //create a Scanner object and open the keyboard for input
         Scanner input = new Scanner (System.in);
         System.out.print("Enter amount: ");
      
      //read in a double for the original amount
         double amount = input.nextDouble();
         System.out.println("you entered: " + amount);
      
      //amount is in dollars, convert to pennies
      //note the typecast of amount (double) to int
         int numPennies = (int)(amount * 100);
      
      //compute number of quarters 
         int numQuarters = numPennies / 25;
         numPennies = numPennies % 25;
      
      //todo: compute number of dimes
         int numDimes = numPennies / 10;
         int newPennies = numPennies % 10;
      
      //todo: compute number of nickels
         int numNickels = newPennies / 5;
         int Pennies = numPennies % 5; 
      
         System.out.println("\nYour Change");
         System.out.println("Quarters: " + numQuarters);
         System.out.println("Dimes: " + numDimes);
         System.out.println("Nickels: " + numNickels);
         System.out.println("Pennies: " + Pennies);
      
      }
   }