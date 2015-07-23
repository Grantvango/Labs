import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Customer {

	boolean loggedIn = false;

	private static int nextID = 0;
	private int ID;

	private String FullName;
	private String FirstName;
	private String passWord;

	public static String dateCreated;

	private String newPassword;

	public Customer(String name){
		ID = nextID;
		FullName = name;
		FirstName = this.getFullName();
		dateCreated = getDateTime();
		passWord = null;
		nextID++;
	}

	public String getFullName(){
		return FullName;
	}
	public void getDate(){
		System.out.println("The date the account was created was: " + dateCreated);
	}
	public int getId(){
		return ID;
	}
	public String getFirstName(){
		FirstName = FullName.substring(0, FullName.indexOf(" "));
		return FirstName;
	}

	public boolean login(String pass){
		if(pass.equals(this.passWord)){
			System.out.printf("%12s has logged on.", FirstName);
			loggedIn = true;
		} else if(!pass.equals(this.passWord)){
			System.out.println("Either Incorect password or no password has been set yet.");
			loggedIn = false;
		}
		return loggedIn;
	}

	public boolean setPassword(String pass){
		boolean validation;
		newPassword = pass;
		boolean isAtLeast8 = (pass.length() >= 8);
		
		if(pass.length() >= 8){
			isAtLeast8 = true;
		} else {
			isAtLeast8 = false;
		}
		
//		boolean hasNumber = (pass.matches("^[0-9]+$"));
//		boolean hasUpper = (pass.matches("[A-Z]"));
//		boolean hasLower = (pass.matches("[a-z]"));
//		boolean hasSpecial = (pass.matches("[A-Za-z0-9]*"));
//		boolean noName = !(pass.contains(this.FirstName));

		if((isAtLeast8) && (getNumber() == 1) && (getLowerCase() == 1) && (getUpperCase() == 1)){
			this.passWord = pass;
			validation = true;
		} else {
			System.out.println("Your password must be 8 characters, including one number, one special character,"
					+ " and one upper and lower case letter. "
					+ "Your first name cannot be in your password. ");
			validation = false;
		}
		return validation;
	}
	public void setPassword(){
		boolean validation = false;
		String pass;
		System.out.println("Enter a password: ");
		Scanner input = new Scanner(System.in);
		while(!validation){
			pass = input.next();
			boolean isAtLeast8 = pass.length() >= 8;
			boolean hasNumber = pass.matches("[0-9]");
			boolean hasSpecial = !pass.matches("[A-Za-z0-9]*");
			boolean noName = !(pass.contains(this.FirstName));

			if((isAtLeast8) && (getNumber() == 1) && (getLowerCase() == 1) && (getUpperCase() == 1)){
				System.out.println("Your password has been set to " + pass);
				this.passWord = pass;
				validation = true;
			} else {
				System.out.println("Your password must be 8 characters, including one number, one special character,"
						+ " and one upper and lower case letter. "
						+ "Your first name cannot be in your password. ");
				validation = false;
			}
		}
	}
	public int getNumber(){		
		for(int index = 0; index < newPassword.length(); index++){
			char a = newPassword.charAt(index);
			if(Character.isDigit(a)){
				return 1;
			}
		}
		return 0;
	}
	public int getUpperCase(){
		for(int index = 0; index < newPassword.length(); index++){
			char a = newPassword.charAt(index);
			if(Character.isUpperCase(a)){
				return 1;
			}
		}
		return 0;
	}
	public int getLowerCase(){
		for(int index = 0; index < newPassword.length(); index++){
			char a = newPassword.charAt(index);
			if(Character.isLowerCase(a)){
				return 1;
			}
		}
		return 0;
	}

	public static String getHeader(){
		String str = String.format("%25s|%3s|%8s|%9s|%s", "Name", "ID", "password", "Logged on", "Date Created");
		return str;
	}
	public String toString(){
		String str = String.format("%25s|%3s|%8s|%9s|%s", FullName, ID, (passWord == null ? "not set" : "set"), (loggedIn ? "yes" : "no"), dateCreated);
		return str;
	}

	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
