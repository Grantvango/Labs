import java.util.ArrayList;
import java.util.Arrays;

public class TestArrays2
{

	public static void main(String[] args)
	{
		int testCase = 1; 
		int [] tstArray1 = {7, 10, 12, 15, 85, 14, 90, 8, 5, 555, 23, 20, 10};

		//find the min and max values of an array
		printTestHeader(testCase++, "find the min and max values of an array of integers");

		int min = getMinValue(tstArray1);
		int max = getMaxValue(tstArray1);
		printArray("array", tstArray1);
		System.out.println("min value: " + min + ", max value: "+ max);
		printTestTrailer();		          


		//find the number of elements that are odd and multiples of 5
		printTestHeader(testCase++, "find the number of elements that are odd and multiples of 5");
		int cnt = oddAnd5multiples(tstArray1);
		printArray("array", tstArray1);
		System.out.println("odd and multiple of 5 count: " + cnt);
		printTestTrailer();



		int [] tstArray2 = new int [20];    
		//replace all negative elements with their absolute values
		printTestHeader(testCase++, "replace all negative elements with their absolute values");

		// so all elements should be within  -50 <= x <= 49
		populateArray(tstArray2, 100, -50);

		printArray("before call to replaceNegatives", tstArray2);
		replaceNegatives(tstArray2);
		printArray("after call to replaceNegatives", tstArray2);
		printTestTrailer();


		//copy the array into a new array  
		printTestHeader(testCase++, "create a new array and copy the contents of one array into the new array");
		int [] newArray = copyArray(tstArray2);
		printArray("from", tstArray2);
		printArray("to", newArray);
		printTestTrailer();


		//verify 2 arrays are equal
		printTestHeader(testCase++, "verify 2 arrays are equal: they have the same length and elements");
		boolean result = verifyDuplicateArray(tstArray2, newArray);
		System.out.println("verifyDuplicateArray (previous arrays): " + result);

		int [] c1 = {1, 2, 3, 4, 5};
		int [] c2 = {1, 2, 3, 4, 6};
		printArray("c1", c1);
		printArray("c2", c2);
		result = verifyDuplicateArray(c1, c2);
		System.out.println("verifyDuplicateArray (an element is different): " + result);

		int [] c3 = {1, 2, 3, 4};
		printArray("c1", c1);
		printArray("c3", c3);
		result = verifyDuplicateArray(c1, c3);
		System.out.println("verifyDuplicateArray (different lengths): " + result);
		printTestTrailer();


		//remove all negative values.  The new array can have a different length      
		printTestHeader(testCase++, "remove all negative elements: new array's length should be different");
		//populate the array with negative values, range = 100, offset = -50
		populateArray(tstArray2, 100, -50);
		printArray("before removing negative elements", tstArray2);
		int [] modifiedArray = removeNegatives(tstArray2);
		printArray("after removing negative elements", modifiedArray);  
		printTestTrailer();   


		//reverse the order of elements of an array  
		printTestHeader(testCase++, "reverse the order of the elements of an array");
		//populate the array with positive values, range = 50, offset = 10
		int [] a3 = {1, 2, 3, 4, 5};
		int [] r3 = {5, 4, 3, 2, 1};

		printArray("original", a3);
		int [] na3 = reverseArray(a3);
		printArray("reversed", na3);
		boolean result3 = verifyDuplicateArray(a3, r3);
		System.out.println("verifyDuplicateArray: " + result3);
		printTestTrailer();

		//verify an array is in acending order  
		printTestHeader(testCase++, "verify the elements of an array are in ascending order");
		//populate the array with positive values, range = 50, offset = 10
		int [] a4 = { 1, 3, 4, 7, 11, 23, 25, 29, 44, 45, 55, 66, 67, 70, 72 };
		printArray("array", a4);
		boolean result2 = verifyAscendingOrder(a4);
		System.out.println("result of calling ascendingOrder: " + result2);
		System.out.println();

		int [] a5 = { 1, 3, 4, 7, 11, 23, 25, 29, 44, 45, 55, 66, 999, 70, 72 };
		printArray("array", a5);
		result = verifyAscendingOrder(a5);
		System.out.println("result of calling ascendingOrder: " + result);
		printTestTrailer();


	}

	/**
	 * @param Methdos
	 * 
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

	public static void populateArray(int [] a, int range, int offset)
	{
		for (int k=0; k<a.length; k++)
			a[k] = (int)(Math.random()*range + offset);		
	}


	public static int getMinValue(int [] a)
	{
		int min = a[0];

		for(int k=0; k<a.length;k++){
			if (a[k] < min){
				min = a[k];
			} 
		}
		return min;
	}

	public static int getMaxValue(int [] a)
	{
		int max = a[0];

		for(int k=0; k<a.length;k++){
			if (a[k] > max){
				max = a[k];
			} 
		}
		return max;
	}

	public static int oddAnd5multiples(int [] a)
	{
		int count = 0;

		for(int k=0; k<a.length;k++){
			if (a[k] % 2 == 1 && a[k] % 5 == 0){
				count++;
			} 
		}
		return count;
	}


	public static void replaceNegatives(int [] a)
	{

		for(int k=0; k<a.length;k++){
			if (a[k] < 0){
				a[k] = Math.abs(a[k]);
			} 
		}
	}

	public static int[] copyArray(int [] a)
	{
		int[] b = new int[a.length];

		for (int k = 0; k<a.length; k++){
			b[k] = a[k];
		}
		return b;
	}

	public static boolean verifyDuplicateArray(int [] a, int [] b)
	{
		int max = a.length;
		if (a.length < b.length){
			max = b.length;
		}

		if (a.length != b.length){
			return false;
		} else {
			for(int k = 0; k < max ;k++){
				if (a[k] != b[k]){
					return false;
				} else {
					k++;
				}
			}
			return true;  
		}
	}


	//why does it not work a[k]>= 0
	public static int[] removeNegatives(int[] a)
	{
		int count = 0;

		for (int k = 0; k < a.length; k++){
			if (a[k]>=0){
				count++;
			}
		}
		int[] b = new int[count];
		int i = 0;
		for(int k = 0; k < a.length; k++){
			if(a[k] >= 0){
				b[i++] = a[k];
			}
		}
		return b;
	}   

	public static int[] reverseArray(int[] a){
		int [] b = new int[a.length];
		int j =0;
		
		for(int i = a.length-1; i >= 0; i--)
		{
		    int temp = a[i];
		    b[j] = temp;
		    j++;
		}
		return b;
	}




	public static boolean verifyAscendingOrder(int[] a){
		int min = a[0];
		
		for(int k = 1; k<a.length; k++){
			if (min > a[k]){
				return false;
			} else {
				min = a[k];
			}
		}
		return true;
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