import java.util.Scanner;


public class EvenNumSum {
	static int sum;
	
	public static void main(String[] args) {
		
		System.out.println("Enter a Even Number!");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		while (num != 0)
		{
			if (num % 2 != 0)
			{
				System.out.println("Enter a Even Number!");
				num = input.nextInt();
			} else {
				while (num > 0){
					int digit = num % 10;
					sum += digit;
					num = num / 10;
				}
			}
		} 
		System.out.println("The sum of the even number was: " + sum);
	}
}
