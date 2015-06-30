

public class TestArrays3
{
	public static void main(String[] args)
	{
		int testCase = 1; 
		int [] tstArray1 = {10, 11, 12, 13, 14};

		//calc average
		printTestHeader(testCase++, "compute the average value of all elements within an array ");
		printArray("array", tstArray1);
		double avg = calculateAverage(tstArray1);
		System.out.println("average value: " + avg);

		/*
		System.out.println();
		int [] tstArray2 = new int [20];
		// so all elements should be within  -50 <= x <= 49
		populateArray(tstArray2, 100, -50);
		printArray("array", tstArray2);
		avg = calculateAverage(tstArray2);
		System.out.println("average value: " + avg);
		printTestTrailer();		           
		 */             


		/*   
           //computer median
           printTestHeader(testCase++, "compute the median value");
           //test with even number of elements
           int [] a1 = {1, 2, 3, 4};
           printArray("a1", a1);
           double median = computeMedian(a1);
           System.out.println("median value: " + median);

           System.out.println();
           //test with odd number of elements 
           int [] a2 = {111, 123, 345};
           printArray("a2", a2);
            median = computeMedian(a2);
            System.out.println("median value: " + median);
           printTestTrailer();
		 */


		/*
           //shuffle the elements:   
           printTestHeader(testCase++, "shuffle an array of integers");
           int [] a3 = new int[30];
           for (int k=0; k<a3.length; k++)
           	    a3[k] = k+1;
           printArray("before shuffle", a3);
           shuffleArray(a3);
           printArray("after shuffle", a3);
           printTestTrailer();
		 */


		/*
           //merge 2 sorted arrays
           printTestHeader(testCase++, "merge 2 sorted arrays");
           int [] a4 = {1, 3, 4, 6};
           int [] a5 = {2, 5, 7, 8};

           printArray("a4", a4);
           printArray("a5", a5);
           int [] a6 = mergeSortedArrays(a4, a5);
           printArray("merged array", a6);

           System.out.println();
           int [] a7 = {1, 2, 3, 4};
           int [] a8 = {5, 6};

           printArray("a7", a7);
           printArray("a8", a8);
           int [] a9 = mergeSortedArrays(a7, a8);
           printArray("merged array", a9);

           printTestTrailer();
		 */

	}

	/*      
           //OPTIONAL: Sort an array of integers 
           // you can do this.....
           printTestHeader(testCase++, "sort an array of integers");
           //populate the array with negative values, range = 100, offset = -50
           populateArray(tstArray2, 100, -50);
           printArray("unsorted array", tstArray2);
           sortArray(tstArray2);
           printArray("sorted array", tstArray2);  
           printTestTrailer();  
	 */ 

	/*
	 * printArray
	 *
	 * input: an array of integers
	 * output: (void)
	 *
	 * display all elements within an array, 4 spaces per element
	 * print a new line after every 10 elements
	 */ 
	public static void printArray(String msg, int [] a)
	{
		System.out.println(msg + ":");
		for (int k=0; k<a.length; k++) 
		{
			System.out.printf("%4d  ", a[k]);
			if ((k+1) % 10 == 0)
				System.out.println();
		}
		System.out.println();
	}
	/*
	 * populateArray
	 *		input: an array of integers
	 *		output:  (void)
	 *
	 *    populate the array with random values for a given range and offset
	 *    each element should be within:  offset <= x < offset+range 
	 *
	 *  if the range is 100 and the offset is 10
	 *  then the elements should be between 10 and 109
	 *
	 *  you do not have to return anything.  You are passed a reference to
	 *  an array and you are modifying the elements of the array.  
	 */
	public static void populateArray(int [] a, int range, int offset)
	{
		for (int k=0; k<a.length; k++)
			a[k] = (int)(Math.random()*range + offset);		
	}




	/*
	 * calculateAverage
	 *		input: an array of integers
	 *		output: double - average value
	 *
	 *    calculateAverage ( {10, 11, 12, 13} ) => 11.5
	 *
	 *    declare and initialize sum
	 *    traverse the array
	 *       add the element to sum
	 *
	 *    divide the sum by the number of elements (a.length)
	 *    return the average
	 */

	public static double calculateAverage(int [] a)
	{
		//declare and initialize sum

		//todo: traverse the array, add each element to sum


		//return the average value (double)
		return 5.3;   //just so it compiles.....
	}

	/*
	 * computeMedian
	 *		input: a sorted array of integers
	 *		output: the median (middle) value within the array
	 *
	 *    if the array length is even
	 *       return the average of the 2 middle elements
	 *    else (array's length is odd)
	 *       return the middle element
	 *    
	 */
	public static double computeMedian(int [] a)
	{
		return 5.3;  //just so it compiles.....
	}

	/*
	 * shuffleArray
	 *		input: an array of integers
	 *		output:  void
	 *       - shuffle the array of integers
	 *           use a for loop to traverse the array.
	 *           - generate a random index between a and the array.length-1
	 *           - swap the two elements 
	 *
	 *    shuffleArray ( {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ) => { 5, 7, 1, 4, 2, 9, 10, 3, 6, 8 }
	 *    
	 */	
	public static void shuffleArray( int [] a)
	{

	}


	/*
	 * mergeSortedArrays
	 *		input: 2 arrays of sorted integers
	 *		output: 1 array of sorted integers
	 *
	 *    given 2 integer arrays, merge them together by alternating elements 
	 *    mergeSortedArrays ( {1, 3, 4, 6}, {2, 5, 7, 8} ) => {1, 2, 3, 4, 5, 6, 7, 8}
	 *    mergeSortedArrays ( {1, 2, 3, 4}, {5, 6} ) => {1, 2, 3, 4, 5, 6}
	 */
	public static int [] mergeSortedArrays(int [] a, int [] b)
	{
		return new int [1];   //just so it compiles.....		
	}



	/*
	 * ** OPTIONAL: if you are having a hard time with arrays, you can skip this method.  
	 * sortArray
	 *		input:  array of integers
	 *		output: sorted array of integers
	 *
	 *    arrange the original array of integers so that all elements are sorted in ascending order 
	 *    sortArray ( {6, 4, 2, 8, 1} ) => {1, 2, 4, 6, 8}
	 *
	 *    you can sort the array without creating a new array.
	 *      - you will need a for loop within a for loop
	 *      - at index 0, find the minimum value starting at index 0 and swap it with the element at index 0
	 *      - at index 1, find the minimum value starting at index 1 and swap it with the element at index 1
	 *      - repeat until you reach index a.length-1
	 * 
	 *    note: to swap elements:
	 *        int temp = a[k];
	 *        a[k] = a[j];
	 *        a[j] = temp;
	 */
	public static void sortArray(int [] a)
	{
		
	}



	public static void printTestHeader( int testNum, String msg )
	{
		System.out.println("\n==============================================================");
		System.out.println("Test: " + testNum + ". " + msg + "\n");	
	} 

	public static void printTestTrailer(  )
	{
		System.out.println("==============================================================\n");	
	}
}
