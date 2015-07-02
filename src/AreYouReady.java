
import java.util.Arrays;
import java.util.Scanner;


public class AreYouReady {
	static Scanner input = new Scanner (System.in);

	// 0 to exit loop. Displays min and max of numbers entered in loop.
	public static void enterNumbers( )
	{

		System.out.println("Enter numbers! Press 0 to exit and the min and max will be displayed.");
		int guess = input.nextInt();
		int min = guess;
		int max = guess;
		int temp;


		while (guess != 0){
			System.out.println("Enter a number: (0 to exit)!");
			temp = guess;

			if (temp > max){
				max = temp;
			} else if (temp < min){
				min = temp;
			}
			guess = input.nextInt();
		}
		System.out.println("The max number was " + max + ", and the min was " + min + ".");
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
		for(int i = 1; i <= nRows; i++){
			for(int j = (nRows + 1) - i; j >= 1; j--){
				System.out.printf("%3s", j);
			}
			System.out.println("");
		}

	}


	//5 tries to guess a number between 10 - 50 (inclusive)
	public static void guessNumber()
	{
		int rndNum = (int)(Math.random()*41 + 10);
		int tries = 4;
		int numGuess = 1;
		int guess = input.nextInt();

		while(numGuess < 5){
			if (guess < 10 || guess > 50){
				System.out.println("Guess a number between 10 - 50!!");
				guess = input.nextInt();
			} else {
				if (guess == rndNum){
					System.out.println("You guessed correctly!");
					System.out.println("The random number was " + rndNum + ", and it only took you " + numGuess + "tries.");
				} else if (guess > rndNum){
					System.out.println("Guess lower!");
					System.out.println("Tries left: " + tries);
					guess = input.nextInt();
					numGuess++;
					tries--;
				} else if (guess < rndNum){
					System.out.println("Guess higher!");
					System.out.println("Tries left: " + tries);
					guess = input.nextInt();
					numGuess++;
					tries--;
				}
			}
		}
		System.out.println("Sorry you ran out of tries!");
		System.out.println("The random number was " + rndNum + ".");
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

		System.out.println("Verifying that Math.random() is evenly distributed over a range of numbers.");
		double numSamples = 10000000;
		int[] a = new int[10];
		int x;
		double lowAverage;
		double highAverage;

		for(int i = 0; i < numSamples; i++){
			x = (int)(Math.random()*10);
			switch (x) {
			case 0: a[0]++;
					break;
			case 1: a[1]++;
					break;
			case 2: a[2]++; 
					break;
			case 3: a[3]++;
					break;
			case 4: a[4]++; 
					break;
			case 5: a[5]++; 
					break;
			case 6: a[6]++;
					break;
			case 7: a[7]++;
					break;
			case 8: a[8]++; 
					break;
			case 9: a[9]++;
					break;
			}
		}
		int min = getMin(a);
		int max = getMax(a);
		int minPos = getMinPos(a);
		int maxPos = getMaxPos(a);
		
		lowAverage = (min/numSamples)*100;
		highAverage = (max/numSamples)*100;
		
		double perDiff = highAverage - lowAverage;
		
		printArray(a);
		System.out.println("The number generated the least was " + minPos + ", and the number generated the most was " + maxPos + ".");
		System.out.printf("%s was generated %4.2f percent and %s was generated %4.2f percent! \nThe percent difference between them was %4.2f percent.\n", minPos, lowAverage, maxPos, highAverage, perDiff);
		
		
		
	}
	public static int getMaxPos(int [] a){
		int max = a[0];
		int maxPos = 0;
		int temp;
		
		for(int i = 0; i < a.length; i++){
			if (max < a[i]){
				temp = a[i];
				maxPos = i;
				max = temp;
			}
		}
		return maxPos;
	}
	public static int getMinPos(int [] a){
		int min = a[0];
		int minPos = 0;
		int temp;
		
		for(int i = 0; i < a.length; i++){
			if (min > a[i]){
				temp = a[i];
				minPos = i;
				min = temp;
			}
		}
		return minPos;
	}
	public static int getMin(int [] a){
		int min = a[0];
		int temp;
		
		for(int i = 0; i < a.length; i++){
			if (min > a[i]){
				temp = a[i];
				min = temp;
			}
		}
		return min;
		
	}
	public static int getMax(int [] a){
		int max = a[0];
		int temp;
		
		for(int i = 0; i < a.length; i++){
			if (max < a[i]){
				temp = a[i];
				max = temp;
			}
		}
		return max;
		
	}
	public static void printArray(int [] a)
	{
		for (int k=0; k<a.length; k++) 
		{
			System.out.printf("a[%s] = %4d \n", k, a[k]);
		}
		System.out.println("");
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
		/*
		genTestHeader(test++, "Enter Numbers- displaying min and max");
		enterNumbers();

		genTestHeader(test++, "Generating a Pattern");
		genPattern(6);
		System.out.println();
		genPattern(9);

		genTestHeader(test++, "Guess a number between 10 - 50!");
		guessNumber();
		*/
		genTestHeader(test++, "Testing Math.random()");
		verifyMathRandom();

	}

}