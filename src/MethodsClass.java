import java.util.Scanner;


public class MethodsClass {

	public static void main(String[] args) {
		
		System.out.println("First Method: GenRandomNumber(): ");
		int num = genRandomNumber(10, 30);
		System.out.println("genRandomNumber: " + num);
		System.out.println("----------------------------------------------------");
		
		System.out.println("Second Method: genNumsAndAverage(): ");
		genNumsAndAverage(5);
		System.out.println("----------------------------------------------------");
		
		System.out.println("Third Method: calcDistance(): ");
		calcDistance(1,2,1,1);
		System.out.println("----------------------------------------------------");
		
		System.out.println("Fourth Method: absolute(): ");
		absolute(-100);
		System.out.println("----------------------------------------------------");
		
		System.out.println("Fifth Method: maximum(): ");
		maximum(6,8);
		System.out.println("----------------------------------------------------");
		
		System.out.println("Sixth Method: promptPositiveNum(): ");
		promptPositiveNum();
	}
	
	/**
	 * Generates a random number given range and offset
	 * 
	 */
	
	public static int genRandomNumber(int range, int offset){
		range += 1;
		int num = (int)(Math.random()*range + offset);
		return num;
	}
	
	/**
	 * Generates a specified number of random values
	 * 
	 */
	
	public static void genNumsAndAverage(int numValues){
		int i = 1;
		int range = 10;
		int offset = 10;	
		int sum = 0;

		while (i < numValues){
			int randNum = genRandomNumber(range, offset);
			System.out.println("Your random number is " + randNum);
			sum += randNum;
			i++;
		}
		double avg = (double)(sum / numValues);
		System.out.println("The average of these random numbers is " + avg);
	}
	
	/**
	 * Calculates distance between two points
	 * 
	 */
	
	public static double calcDistance (int x1, int y1, int x2, int y2){
		double Distance = (double)(Math.sqrt(((x2 - x1)*(x2 - x1))+((y2 - y1)*(y2 - y1))));
		System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + Distance );
		return 0;
	}
	
	/**
	 * returns absolute value for a given integer
	 * 
	 */
	
	public static int absolute(int x){
		int numAbs = Math.abs(x);
		System.out.println("The absolute value of " + x + " is " + numAbs);
		return 0;
	}
	
	/**
	 * Returns the larger number between two integers
	 * 
	 */
	
	public static int maximum(int x1, int x2){
		if (x1 > x2){
			System.out.println(x1 + " is larger than " + x2);
		} else {
			System.out.println(x2 + " is larger than " + x1);
		}
		return 0;
	}
	
	/**
	 * Prompts user for a positive integer and loops until the number entered is positive
	 * 
	 */
	
	public static int promptPositiveNum(){
		System.out.println("Enter a positive integer: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		while (num < 0){
			System.out.println("Enter a positive number!");
			num = input.nextInt();
		}
		System.out.println("Your positive integer was " + num);
		return 0;
	}


}

