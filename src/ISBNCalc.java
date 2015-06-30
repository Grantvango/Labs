import java.util.Scanner;

public class ISBNCalc {

	public static void main(String[] args) 
	{
		
		int digit; 
		int sum = 0;
		System.out.println("Enter the first 9 digits of an ISBN as integer: ex) 013601267 ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int oldIsbn = num;
			
		while (num > 0 && num != 0)
		{
			for(int i = 9; i >= 1; i--)
			{
				digit = num % 10;
				sum += digit * i;
				num = num / 10;
			}
			sum = sum % 11;
		}
		
		
		if (sum > 9){
			System.out.printf("%-10s %-10s\n", "ISBN", "CHECKSUM");
			System.out.printf("%-10s %-10s\n", oldIsbn, "X");
			System.out.println("The ISBN-10 number is " + oldIsbn + "X");
		} else {
			System.out.printf("%-10s %-10s\n", "ISBN", "CHECKSUM");
			System.out.printf("%-10s %-10s\n", oldIsbn, sum);
			System.out.println("The ISBN-10 number is " + oldIsbn + sum);
		}
		
	}
}