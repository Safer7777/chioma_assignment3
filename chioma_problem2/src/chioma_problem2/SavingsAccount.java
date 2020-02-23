package chioma_problem2;

/*
 * Must have: 
 * public class SavingsAccount DONE
 * private class variable annualInterestRate DONE
 * private instance variable savings balance  DONE
 * public instance method calculateMonthlyInterest DONE
 * calculateMonthlyInterest is correctly implemented DONE
 * modifyInterestRate is a public class method DONE
 * modifyInterestRate is correcly implemented  DONE
 */

public class SavingsAccount {
	
	//We begin by setting up the instance variables
	private static double annualInterestRate;
	private double savingsBalance;
	
	//We use a constructor for the saving balance variable
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	//We use a get function to "get" the variable
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	//we will calculate the monthly interest here
	public double calculateMonthlyInterest() {
		double monthlyIntrest = (this.savingsBalance * annualInterestRate) / 12;
		this.savingsBalance = this.savingsBalance + monthlyIntrest;
		return monthlyIntrest;
	}
	
	//change the interest rate here
	public static void modifyInterestRate(double intrestRate) {
		annualInterestRate = intrestRate / 100;
	}
}