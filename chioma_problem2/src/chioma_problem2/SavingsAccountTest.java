package chioma_problem2;

/*
 * must: create two SavingsAccount objects  DONE
 * set annualInterestRate to 4%  DONE
 * calculate monthly interest for each of the 12 months and print balance for both SavingsAccount instances as a table  DONE
 * set annualInterestRate to 5%  DONE
 * calculate monthly interest for the next month's interest and prints the balance for both SavingsAccount instances.  DONE
 * test program is in a public class called SavingsAccountTest  DONE
 */

public class SavingsAccountTest {
	
 public static void main(String[] args) {
	 
     //First we will create two SavingsAccount objects
     SavingsAccount saver1, saver2;
     
     //Then we set both starting values of each account per the assignment requirements
     saver1 = new SavingsAccount(2000);
     saver2 = new SavingsAccount(3000);
     
     // set current intrest rate to 4 %
     SavingsAccount.modifyInterestRate(4);
     
     // calculate and print monthly balances for both the accounts for each month
     System.out.println("Current Month\tAccount 1\tAccount 2");
     for (int month = 1; month <= 12; month++) {
         saver1.calculateMonthlyInterest();
         saver2.calculateMonthlyInterest();
         //This will print out both balances to two decimal places
         System.out.printf("%5d \t\t $%.2f \t $%.2f\n", month, saver1.getSavingsBalance(), saver2.getSavingsBalance());
     }
     
     // change the intrest rate to 5%
     SavingsAccount.modifyInterestRate(5);
     
     // calculate intrest for next month
     saver1.calculateMonthlyInterest();
     saver2.calculateMonthlyInterest();
     
     // print the new balances
     System.out.println("\nThe new balance of adding just the next month's interest of each account:");
     System.out.printf("\nAccount 1: $%.2f", saver1.getSavingsBalance());
     System.out.printf("\nAccount 2: $%.2f", saver2.getSavingsBalance());
 	}
 }