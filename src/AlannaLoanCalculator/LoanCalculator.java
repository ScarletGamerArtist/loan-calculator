package AlannaLoanCalculator;
import java.util.Scanner;
/*
 * Alanna Botscharow 
 * 9/18
 * Loan Calculator
 */
public class LoanCalculator {

	public static void main(String[] args) {
		//Prompt for the user for each of their inputs.
		// User input : interest rate
		// User input : loan amount
		// User input : number of years which payments will be made. 
		//Compute the monthly payment using the formula: 
		//Compute the total payment 
		// display the monthly payment
		// display the total payment
		Scanner input = new Scanner(System.in);
		
		
		
			double interestRate;
			double loanAmount;
			int years; 
			
			double monthlyPayment;
			double totalPayment;
			
			
		System.out.println("Enter your interest rate: ");
			interestRate = input.nextDouble();
		System.out.println("Enter your loan amount: ");	
			loanAmount = input.nextDouble(); 
		System.out.println("Enter the number of years for which the payments will be made: ");
			years = input.nextInt();
		
			monthlyPayment = (int) loanAmount * interestRate / (1-1 / Math.pow(1+ interestRate, years * 12));
			totalPayment = (monthlyPayment * 12) * years;
			
			
		System.out.println("Your monthly payment is: "+monthlyPayment);
		System.out.println("Your total payment is: "+totalPayment);
		
			
		

	}

}
