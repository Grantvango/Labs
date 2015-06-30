
import java.util.Scanner;


public class AreYouReady {
   static Scanner input = new Scanner (System.in);

	/*
	 * enterNumbers
	 *    input: none
	 *    output: none
	 *    
	 *    prompt a user to enter integers, 0 to exit the loop  
	 *
	 *    After all numbers have been entered, 
	 *    display the smallest and largest number. 
	 *    Note: write this program without using an array
	 */
   public static void enterNumbers( )
   {
   	
      System.out.println("Enter numbers, will display min and max when you exit");
   	
   }


	/*
	 * genPattern
	 *    input: int number of rows to display
	 *    output: none
	 *    
	 * Using embedded for loops: Display the following pattern (rows = 6)
	 *     6 5 4 3 2 1
	 *       5 4 3 2 1
	 *         4 3 2 1
	 *           3 2 1
	 *             2 1
	 *               1
	 *          
	 * pattern for (rows = 3)          
	 *     3 2 1
	 *       2 1
	 *         1           
	 *   
	 * Your method only has to support a max of 9 rows. 
	 * Use the printf statement.
	 */
   public static void genPattern (int nRows)
   {
      System.out.printf("generating Pattern for %2d rows\n", nRows);
   	
   }


	/*
	 * Generate a random number between 10 and 50 (inclusive)
	 * Prompt a user to guess the number up to 5 tries
	 *    Each time giving them a clue as to whether they are too low or too high.
	 * If they guess the number correctly, display the number of tries it took them.
	 * If they did not guess the number correctly, display the random value. 
	 * This program was on our last test. 
	 */
   public static void guessNumber()
   {
   	
      System.out.println("Guess a Number, you have up to 5 tries");
   	
   	
   }


	/*
	 * verifyMathRandom()
	 *   inputs: none
	 *   outputs: none
	 *   
    * NOTE: This is optional - but you can do it....
    *
	 * Verify Math.random() is evenly distributed over a large number of calls.  
	 *   - Allocate an integer array of 10 elements. 
	 *   - Generate 10,000,000 random numbers within the range of 0-9 inclusive.  
	 *   - increment the count of the corresponding index for each random number 
	 *   - compute the percentage difference between the number that was generated the most
	 *     and least.  
	 *     
	 *   For example: After generating 10,000,000 the array of corresponding numbers generated 
	 *                looks like the following:
	 *                num[0] = 1250000
	 *                num[1] = 1000000
	 *                num[2] =  900000
	 *                num[3] = 1200000
	 *                num[4] = 1100000    // the number 4 was generated 1100000 times
	 *                num[5] =  750000
	 *                num[6] =  800000
	 *                num[7] =  950000
	 *                num[8] = 1000000
	 *                num[9] = 1050000
	 *                
	 *   Display the array and then display the percentage difference between the smallest and largest:
	 *          number 5 was generated 7.5% and number 0 was generated 12.5% :: 
	 *             percentage difference is:  5%    (12.5% - 7.5%)             
	 */

   public static void verifyMathRandom()
   {
   	
      System.out.println("Verifying Math.random() is evenly distributed over a range of numbers");
      int numSamples = 10000000;
   }
   public static void genTestHeader(int caseNum, String msg)
   {
      System.out.println();
      System.out.println("==============================================");
      System.out.println("TestCase: "+ caseNum + " - " + msg);
      System.out.println("==============================================");
   	
   }

   public static void main(String[] args) {
      int test=1;
      genTestHeader(test++, "enter Numbers- displaying min and max");
      enterNumbers();
      
      genTestHeader(test++, "generating a Pattern");
      genPattern(6);
      System.out.println();
      genPattern(9);
      
      genTestHeader(test++, "guess a number");
      guessNumber();
      
      genTestHeader(test++, "testing Math.random()");
      verifyMathRandom();
   
   }

}