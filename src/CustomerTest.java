

import java.util.Scanner;

public class CustomerTest
{
   static Customer [] myCustomers = new Customer[10];
   static int nextCustomer = 0;
   static Scanner input = new Scanner (System.in);
   
   public static String promptCustomerName()
   {
      input = new Scanner (System.in);    
      System.out.print("Enter Customer Name: ");
      String name = input.nextLine();
      return name;
   }
   
   public static Customer lookUpCustomer ( String name )
   {
      for (int k=0; k<nextCustomer; k++)
      {
         String custName = myCustomers[k].getFullName();
         if (custName.equals(name))
            return myCustomers[k];
      }
      return null;
   }
   public static void listCustomers()
   {
      System.out.println( Customer.getHeader() );
      for (int k=0; k<nextCustomer; k++)
      {
         System.out.println ( myCustomers[k] );
      }
   }

   
   public static boolean addCustomer( Customer cust )
   {   
      if (nextCustomer < myCustomers.length )
      {
         myCustomers[nextCustomer++] = cust;
         return true;
      }
      else 
         return false;
   }
   
   public static boolean addCustomer ()
   {
      String name = promptCustomerName();
      Customer cust = lookUpCustomer( name );
      if (cust != null)
      {
         System.out.println("Customer alread exists: " + cust );
         return false;
      }
      cust = new Customer ( name );
       
      return addCustomer ( cust );
   }
   
   public static void accessCustomer()
   {
      String name = promptCustomerName();
      Customer cust = lookUpCustomer( name );
      if (cust == null)
      {
         System.out.println("Customer does not exist: " );
         return;
      }
      //Testing Customer accessor methods
      System.out.println("Name:  " + cust.getFullName() );
      System.out.println("First: " + cust.getFirstName() );
      System.out.println("ID:    " + cust.getId() );
      System.out.println("date:  " + Customer.dateCreated );
      System.out.println();
      System.out.println("Do you want to set the Password (y or n)? ");
      String answer = input.next();
      answer = answer.toLowerCase();
      if (answer.length () > 0 && answer.charAt(0) == 'y')
      {
         System.out.println("Enter password: ");
         System.out.println("      at least 8 chars");
         System.out.println("      at least 1 number");
         System.out.println("      at least 1 capital letter");
         System.out.println("      at least 1 lower case letter");
         String password = input.next();
           
         if (cust.setPassword( password ))
            System.out.println("password was set successfully");
         else 
            System.out.println("invalid password???");
      }
      
   }
   public static void loginCustomer()
   {
      String name = promptCustomerName();
      Customer cust = lookUpCustomer( name );
      if (cust == null)
      {
         System.out.println("Customer does not exist: " );
         return;
      }
      
      System.out.println("Enter password: ");
      String password = input.next();
           
      if (cust.login( password ))
         System.out.println("login was successful");
      else 
         System.out.println("invalid password");
      
      
   }

   
   public static void menu()
   {
      while (true) 
      {
         System.out.println();
         System.out.println("Customer Test Menu");
         System.out.println("1 .... List Customers");
         System.out.println("2 .... Add Customer");
         System.out.println("3 .... Set a Customer's password");
         System.out.println("4 .... Login as a Customer");
         System.out.println("5 .... Exit");
         int choice = input.nextInt();
         switch (choice) {
            case 1:
               listCustomers();
               break;
            case 2:
               addCustomer();
               break;
            case 3:
               accessCustomer();
               break;
            case 4:
               loginCustomer();
               break;
            case 5:
               System.exit(0);
               break;
            default:
               System.out.println("Invalid choice");
         }
      }
   }
   
   public static void main (String [] args)
   {
      Customer cust1 =  new Customer ("Samuel L Jackson");
      cust1.setPassword("Sammy123Valid");
      addCustomer (cust1);
      
      addCustomer (new Customer ("Jimmy James Fallon"));
      
      Customer cust3 =  new Customer ("Jon Anthony Stewart");
      cust3.setPassword("Abc123");
      addCustomer (cust3);
      
      Customer cust4 =  new Customer ("Tina Fey");
      cust4.setPassword("abc123no_caps");
      addCustomer (cust4);
      
      Customer cust5 =  new Customer ("Stephen Scott Colbert");
      cust5.setPassword("comingToNBC");
      addCustomer (cust5);
      
      menu();
      
   }
   
   
}