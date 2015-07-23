import java.util.Scanner;


public class CustomerTestor {

	private static String name;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Customer[] myCustomer = new Customer[10];

		for(int i = 0; i < myCustomer.length; i++){
			System.out.printf("Enter the fullname for customer %2f:", i);
			name = input.next();
			myCustomer[i] = new Customer(name);
		}

		for(int i = 0; i < myCustomer.length; i++){
			System.out.println(Customer.getHeader());
			System.out.println(myCustomer[i].toString()+ "\n");
		}
	}
}
